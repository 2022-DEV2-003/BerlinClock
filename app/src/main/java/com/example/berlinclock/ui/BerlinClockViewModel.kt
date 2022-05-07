package com.example.berlinclock.ui

import androidx.lifecycle.*
import androidx.compose.runtime.Composable
import com.example.berlinclock.converters.BerlinClockStateConverter
import com.example.berlinclock.providers.LocalDateTimeValueProvider
import com.example.dip.Converter
import com.example.dip.ValueProvider
import kotlinx.coroutines.delay
import java.time.LocalDateTime

/**
 * The [ViewModel] used by the stateful BerlinClock [Composable].
 * @param timeProvider A component capable of providing [LocalDateTime] instances.
 * @param stateConverter A component capable of converting from [LocalDateTime] to [BerlinClockState].
 */
class BerlinClockViewModel(
    private val timeProvider: ValueProvider<LocalDateTime>,
    private val stateConverter: Converter<LocalDateTime, BerlinClockState>) : ViewModel()
{
    /**
     * A [LiveData] that continuously emit a new [BerlinClockState].
     */
    val state : LiveData<BerlinClockState> = liveData {
        while (true) {
            val time = timeProvider.getValue()
            emit(stateConverter.convert(time))
            delay(STATE_EMIT_DELAY)
        }
    }

    companion object {
        private const val STATE_EMIT_DELAY = 500L
    }
}

/**
 * A [ViewModel] Factory needed to inject the dependencies of [BerlinClockViewModel].
 *
 * shouldn't be needed with a Dependency Injection Framework (ie: Hilt/Dagger).
 */
class BerlinClockViewModelFactory: ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BerlinClockViewModel(LocalDateTimeValueProvider, BerlinClockStateConverter) as T
    }
}