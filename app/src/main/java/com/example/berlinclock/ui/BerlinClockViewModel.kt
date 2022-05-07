package com.example.berlinclock.ui

import androidx.lifecycle.*
import androidx.compose.runtime.Composable
import com.example.dip.Converter
import com.example.dip.ValueProvider
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
    }
}