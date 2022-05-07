package com.example.berlinclock

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.berlinclock.ui.BerlinClockState
import com.example.berlinclock.ui.BerlinClockViewModel
import com.example.berlinclock.util.MainCoroutineRule
import com.example.berlinclock.util.observeForTesting
import com.example.dip.Converter
import com.example.dip.ValueProvider
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.yield
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.time.LocalDateTime
import kotlin.test.assertNotNull
import kotlin.test.assertNotSame

@RunWith(JUnit4::class)
@ExperimentalCoroutinesApi
class BerlinClockViewModelTest {

    @Rule
    @JvmField
    val instantExecutorRule = InstantTaskExecutorRule()

    // Sets the main coroutines dispatcher to a TestCoroutineScope for unit testing.
    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    @Test
    fun given_BerlinClockViewModel_when_Observed_then_EmitsBerlinClockStates() = runTest {
        // Give BerlinClockViewModel
        val mockTimeProvider = object : ValueProvider<LocalDateTime> {
            override fun getValue() = LocalDateTime.now()
        }
        val mockStateConverter = object : Converter<LocalDateTime, BerlinClockState> {
            override fun convert(source: LocalDateTime) = BerlinClockState()
        }
        val viewModel = BerlinClockViewModel(mockTimeProvider, mockStateConverter)

        // When observed
        viewModel.state.observeForTesting {
            // Yield test thread so that the first LiveData emission can complete
            yield()

            val state1 = viewModel.state.value
            assertNotNull(state1)

            // Execute all pending coroutines in the viewModel
            runCurrent()

            delay(1000)
            val state2 = viewModel.state.value
            assertNotNull(state2)

            // Then emits BerlinClockStates
            assertNotSame(state1, state2)
        }
    }
}