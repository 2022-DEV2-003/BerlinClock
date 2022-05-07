package com.example.berlinclock

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.berlinclock.ui.BerlinClock
import com.example.berlinclock.ui.BerlinClockState
import com.example.berlinclock.ui.theme.BerlinClockTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BerlinClockTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun given_BerlinClockState_when_SecondsOnIsFalse_then_SecondsValueEqualsOff()
    {
        // Given a BerlinClockState state
        // When secondsOn is false
        val state = BerlinClockState(secondsOn = false)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "even seconds block" should be "off"
        composeTestRule.onNodeWithContentDescription("even seconds block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_SecondsOnIsTrue_then_SecondsValueEqualsOn()
    {
        // Given a BerlinClockState state
        // When secondsOn is false
        val state = BerlinClockState(secondsOn = true)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "even seconds block" should be "on"
        composeTestRule.onNodeWithContentDescription("even seconds block")
            .assertValueEquals("on")
    }

    @Test
    fun given_BerlinClockState_when_FiveHoursBlocksOnCountEquals0_then_1To20HoursBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveHoursBlocksOnCount is 0
        val state = BerlinClockState(fiveHoursBocksOnCount = 0)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("1 to 5 hours block")
            .assertValueEquals("off")
        // Then "6 to 10 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("6 to 10 hours block")
            .assertValueEquals("off")
        // Then "11 to 15 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("11 to 15 hours block")
            .assertValueEquals("off")
        // Then "16 to 20 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("16 to 20 hours block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveHoursBlocksOnCountEquals1_then_1To5HoursBlockEqualsOn_and_6To20HoursBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveHoursBlocksOnCount is 1
        val state = BerlinClockState(fiveHoursBocksOnCount = 1)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 hours block")
            .assertValueEquals("on")
        // Then "6 to 10 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("6 to 10 hours block")
            .assertValueEquals("off")
        // Then "11 to 15 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("11 to 15 hours block")
            .assertValueEquals("off")
        // Then "16 to 20 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("16 to 20 hours block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveHoursBlocksOnCountEquals2_then_1To10HoursBlockEqualsOn_and_11To20HoursBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveHoursBlocksOnCount is 2
        val state = BerlinClockState(fiveHoursBocksOnCount = 2)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 hours block")
            .assertValueEquals("on")
        // Then "6 to 10 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 hours block")
            .assertValueEquals("on")
        // Then "11 to 15 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("11 to 15 hours block")
            .assertValueEquals("off")
        // Then "16 to 20 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("16 to 20 hours block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveHoursBlocksOnCountEquals3_then_1To15HoursBlockEqualsOn_and_16To20HoursBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveHoursBlocksOnCount is 3
        val state = BerlinClockState(fiveHoursBocksOnCount = 3)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 hours block")
            .assertValueEquals("on")
        // Then "6 to 10 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 hours block")
            .assertValueEquals("on")
        // Then "11 to 15 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("11 to 15 hours block")
            .assertValueEquals("on")
        // Then "16 to 20 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("16 to 20 hours block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveHoursBlocksOnCountEquals4_then_1To20HoursBlockEqualsOn()
    {
        // Given a BerlinClockState state
        // When fiveHoursBlocksOnCount is 4
        val state = BerlinClockState(fiveHoursBocksOnCount = 4)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 hours block")
            .assertValueEquals("on")
        // Then "6 to 10 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 hours block")
            .assertValueEquals("on")
        // Then "11 to 15 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("11 to 15 hours block")
            .assertValueEquals("on")
        // Then "16 to 20 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("16 to 20 hours block")
            .assertValueEquals("on")
    }

    @Test
    fun given_BerlinClockState_when_FiveMinutesBlocksOnCountEquals0_then_1To55MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveMinutesBlocksOnCount is 0
        val state = BerlinClockState(fiveMinutesBlocksOnCount = 0)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("1 to 5 minutes block")
            .assertValueEquals("off")
        // Then "6 to 10 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("6 to 10 minutes block")
            .assertValueEquals("off")
        // Then "11 to 15 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("11 to 15 minutes block")
            .assertValueEquals("off")
        // Then "16 to 20 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("16 to 20 minutes block")
            .assertValueEquals("off")
        // Then "21 to 25 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("21 to 25 minutes block")
            .assertValueEquals("off")
        // Then "26 to 30 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("26 to 30 minutes block")
            .assertValueEquals("off")
        // Then "31 to 35 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("31 to 35 minutes block")
            .assertValueEquals("off")
        // Then "36 to 40 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("36 to 40 minutes block")
            .assertValueEquals("off")
        // Then "41 to 45 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("41 to 45 minutes block")
            .assertValueEquals("off")
        // Then "46 to 50 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("46 to 50 minutes block")
            .assertValueEquals("off")
        // Then "51 to 55 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("51 to 55 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveMinutesBlocksOnCountEquals1_then_1To5MinutesBlockEqualsOn_and_6To55MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveMinutesBlocksOnCount is 1
        val state = BerlinClockState(fiveMinutesBlocksOnCount = 1)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 minutes block")
            .assertValueEquals("on")
        // Then "6 to 10 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("6 to 10 minutes block")
            .assertValueEquals("off")
        // Then "11 to 15 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("11 to 15 minutes block")
            .assertValueEquals("off")
        // Then "16 to 20 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("16 to 20 minutes block")
            .assertValueEquals("off")
        // Then "21 to 25 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("21 to 25 minutes block")
            .assertValueEquals("off")
        // Then "26 to 30 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("26 to 30 minutes block")
            .assertValueEquals("off")
        // Then "31 to 35 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("31 to 35 minutes block")
            .assertValueEquals("off")
        // Then "36 to 40 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("36 to 40 minutes block")
            .assertValueEquals("off")
        // Then "41 to 45 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("41 to 45 minutes block")
            .assertValueEquals("off")
        // Then "46 to 50 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("46 to 50 minutes block")
            .assertValueEquals("off")
        // Then "51 to 55 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("51 to 55 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveMinutesBlocksOnCountEquals2_then_1To10MinutesBlockEqualsOn_and_11To55MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveMinutesBlocksOnCount is 2
        val state = BerlinClockState(fiveMinutesBlocksOnCount = 2)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 minutes block")
            .assertValueEquals("on")
        // Then "6 to 10 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 minutes block")
            .assertValueEquals("on")
        // Then "11 to 15 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("11 to 15 minutes block")
            .assertValueEquals("off")
        // Then "16 to 20 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("16 to 20 minutes block")
            .assertValueEquals("off")
        // Then "21 to 25 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("21 to 25 minutes block")
            .assertValueEquals("off")
        // Then "26 to 30 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("26 to 30 minutes block")
            .assertValueEquals("off")
        // Then "31 to 35 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("31 to 35 minutes block")
            .assertValueEquals("off")
        // Then "36 to 40 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("36 to 40 minutes block")
            .assertValueEquals("off")
        // Then "41 to 45 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("41 to 45 minutes block")
            .assertValueEquals("off")
        // Then "46 to 50 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("46 to 50 minutes block")
            .assertValueEquals("off")
        // Then "51 to 55 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("51 to 55 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveMinutesBlocksOnCountEquals3_then_1To15MinutesBlockEqualsOn_and_16To55MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveMinutesBlocksOnCount is 3
        val state = BerlinClockState(fiveMinutesBlocksOnCount = 3)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 minutes block")
            .assertValueEquals("on")
        // Then "6 to 10 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 minutes block")
            .assertValueEquals("on")
        // Then "11 to 15 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("11 to 15 minutes block")
            .assertValueEquals("on")
        // Then "16 to 20 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("16 to 20 minutes block")
            .assertValueEquals("off")
        // Then "21 to 25 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("21 to 25 minutes block")
            .assertValueEquals("off")
        // Then "26 to 30 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("26 to 30 minutes block")
            .assertValueEquals("off")
        // Then "31 to 35 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("31 to 35 minutes block")
            .assertValueEquals("off")
        // Then "36 to 40 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("36 to 40 minutes block")
            .assertValueEquals("off")
        // Then "41 to 45 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("41 to 45 minutes block")
            .assertValueEquals("off")
        // Then "46 to 50 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("46 to 50 minutes block")
            .assertValueEquals("off")
        // Then "51 to 55 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("51 to 55 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveMinutesBlocksOnCountEquals4_then_1To20MinutesBlockEqualsOn_and_21To55MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveMinutesBlocksOnCount is 4
        val state = BerlinClockState(fiveMinutesBlocksOnCount = 4)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 minutes block")
            .assertValueEquals("on")
        // Then "6 to 10 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 minutes block")
            .assertValueEquals("on")
        // Then "11 to 15 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("11 to 15 minutes block")
            .assertValueEquals("on")
        // Then "16 to 20 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("16 to 20 minutes block")
            .assertValueEquals("on")
        // Then "21 to 25 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("21 to 25 minutes block")
            .assertValueEquals("off")
        // Then "26 to 30 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("26 to 30 minutes block")
            .assertValueEquals("off")
        // Then "31 to 35 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("31 to 35 minutes block")
            .assertValueEquals("off")
        // Then "36 to 40 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("36 to 40 minutes block")
            .assertValueEquals("off")
        // Then "41 to 45 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("41 to 45 minutes block")
            .assertValueEquals("off")
        // Then "46 to 50 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("46 to 50 minutes block")
            .assertValueEquals("off")
        // Then "51 to 55 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("51 to 55 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveMinutesBlocksOnCountEquals5_then_1To25MinutesBlockEqualsOn_and_26To55MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveMinutesBlocksOnCount is 5
        val state = BerlinClockState(fiveMinutesBlocksOnCount = 5)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 minutes block")
            .assertValueEquals("on")
        // Then "6 to 10 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 minutes block")
            .assertValueEquals("on")
        // Then "11 to 15 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("11 to 15 minutes block")
            .assertValueEquals("on")
        // Then "16 to 20 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("16 to 20 minutes block")
            .assertValueEquals("on")
        // Then "21 to 25 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("21 to 25 minutes block")
            .assertValueEquals("on")
        // Then "26 to 30 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("26 to 30 minutes block")
            .assertValueEquals("off")
        // Then "31 to 35 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("31 to 35 minutes block")
            .assertValueEquals("off")
        // Then "36 to 40 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("36 to 40 minutes block")
            .assertValueEquals("off")
        // Then "41 to 45 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("41 to 45 minutes block")
            .assertValueEquals("off")
        // Then "46 to 50 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("46 to 50 minutes block")
            .assertValueEquals("off")
        // Then "51 to 55 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("51 to 55 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveMinutesBlocksOnCountEquals6_then_1To30MinutesBlockEqualsOn_and_31To55MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveMinutesBlocksOnCount is 6
        val state = BerlinClockState(fiveMinutesBlocksOnCount = 6)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 minutes block")
            .assertValueEquals("on")
        // Then "6 to 10 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 minutes block")
            .assertValueEquals("on")
        // Then "11 to 15 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("11 to 15 minutes block")
            .assertValueEquals("on")
        // Then "16 to 20 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("16 to 20 minutes block")
            .assertValueEquals("on")
        // Then "21 to 25 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("21 to 25 minutes block")
            .assertValueEquals("on")
        // Then "26 to 30 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("26 to 30 minutes block")
            .assertValueEquals("on")
        // Then "31 to 35 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("31 to 35 minutes block")
            .assertValueEquals("off")
        // Then "36 to 40 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("36 to 40 minutes block")
            .assertValueEquals("off")
        // Then "41 to 45 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("41 to 45 minutes block")
            .assertValueEquals("off")
        // Then "46 to 50 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("46 to 50 minutes block")
            .assertValueEquals("off")
        // Then "51 to 55 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("51 to 55 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveMinutesBlocksOnCountEquals7_then_1To35MinutesBlockEqualsOn_and_36To55MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveMinutesBlocksOnCount is 7
        val state = BerlinClockState(fiveMinutesBlocksOnCount = 7)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 minutes block")
            .assertValueEquals("on")
        // Then "6 to 10 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 minutes block")
            .assertValueEquals("on")
        // Then "11 to 15 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("11 to 15 minutes block")
            .assertValueEquals("on")
        // Then "16 to 20 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("16 to 20 minutes block")
            .assertValueEquals("on")
        // Then "21 to 25 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("21 to 25 minutes block")
            .assertValueEquals("on")
        // Then "26 to 30 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("26 to 30 minutes block")
            .assertValueEquals("on")
        // Then "31 to 35 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("31 to 35 minutes block")
            .assertValueEquals("on")
        // Then "36 to 40 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("36 to 40 minutes block")
            .assertValueEquals("off")
        // Then "41 to 45 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("41 to 45 minutes block")
            .assertValueEquals("off")
        // Then "46 to 50 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("46 to 50 minutes block")
            .assertValueEquals("off")
        // Then "51 to 55 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("51 to 55 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveMinutesBlocksOnCountEquals8_then_1To40MinutesBlockEqualsOn_and_41To55MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveMinutesBlocksOnCount is 8
        val state = BerlinClockState(fiveMinutesBlocksOnCount = 8)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 minutes block")
            .assertValueEquals("on")
        // Then "6 to 10 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 minutes block")
            .assertValueEquals("on")
        // Then "11 to 15 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("11 to 15 minutes block")
            .assertValueEquals("on")
        // Then "16 to 20 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("16 to 20 minutes block")
            .assertValueEquals("on")
        // Then "21 to 25 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("21 to 25 minutes block")
            .assertValueEquals("on")
        // Then "26 to 30 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("26 to 30 minutes block")
            .assertValueEquals("on")
        // Then "31 to 35 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("31 to 35 minutes block")
            .assertValueEquals("on")
        // Then "36 to 40 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("36 to 40 minutes block")
            .assertValueEquals("on")
        // Then "41 to 45 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("41 to 45 minutes block")
            .assertValueEquals("off")
        // Then "46 to 50 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("46 to 50 minutes block")
            .assertValueEquals("off")
        // Then "51 to 55 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("51 to 55 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveMinutesBlocksOnCountEquals9_then_1To45MinutesBlockEqualsOn_and_46To55MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveMinutesBlocksOnCount is 9
        val state = BerlinClockState(fiveMinutesBlocksOnCount = 9)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 minutes block")
            .assertValueEquals("on")
        // Then "6 to 10 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 minutes block")
            .assertValueEquals("on")
        // Then "11 to 15 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("11 to 15 minutes block")
            .assertValueEquals("on")
        // Then "16 to 20 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("16 to 20 minutes block")
            .assertValueEquals("on")
        // Then "21 to 25 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("21 to 25 minutes block")
            .assertValueEquals("on")
        // Then "26 to 30 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("26 to 30 minutes block")
            .assertValueEquals("on")
        // Then "31 to 35 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("31 to 35 minutes block")
            .assertValueEquals("on")
        // Then "36 to 40 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("36 to 40 minutes block")
            .assertValueEquals("on")
        // Then "41 to 45 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("41 to 45 minutes block")
            .assertValueEquals("on")
        // Then "46 to 50 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("46 to 50 minutes block")
            .assertValueEquals("off")
        // Then "51 to 55 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("51 to 55 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveMinutesBlocksOnCountEquals10_then_1To50MinutesBlockEqualsOn_and_51To55MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When fiveMinutesBlocksOnCount is 10
        val state = BerlinClockState(fiveMinutesBlocksOnCount = 10)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 minutes block")
            .assertValueEquals("on")
        // Then "6 to 10 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 minutes block")
            .assertValueEquals("on")
        // Then "11 to 15 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("11 to 15 minutes block")
            .assertValueEquals("on")
        // Then "16 to 20 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("16 to 20 minutes block")
            .assertValueEquals("on")
        // Then "21 to 25 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("21 to 25 minutes block")
            .assertValueEquals("on")
        // Then "26 to 30 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("26 to 30 minutes block")
            .assertValueEquals("on")
        // Then "31 to 35 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("31 to 35 minutes block")
            .assertValueEquals("on")
        // Then "36 to 40 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("36 to 40 minutes block")
            .assertValueEquals("on")
        // Then "41 to 45 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("41 to 45 minutes block")
            .assertValueEquals("on")
        // Then "46 to 50 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("46 to 50 minutes block")
            .assertValueEquals("on")
        // Then "51 to 55 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("51 to 55 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_FiveHoursBlocksOnCountEquals11_then_1To55MinutesBlockEqualsOn()
    {
        // Given a BerlinClockState state
        // When fiveMinutesBlocksOnCount is 11
        val state = BerlinClockState(fiveMinutesBlocksOnCount = 11)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 to 5 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 to 5 minutes block")
            .assertValueEquals("on")
        // Then "6 to 10 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("6 to 10 minutes block")
            .assertValueEquals("on")
        // Then "11 to 15 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("11 to 15 minutes block")
            .assertValueEquals("on")
        // Then "16 to 20 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("16 to 20 minutes block")
            .assertValueEquals("on")
        // Then "21 to 25 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("21 to 25 minutes block")
            .assertValueEquals("on")
        // Then "26 to 30 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("26 to 30 minutes block")
            .assertValueEquals("on")
        // Then "31 to 35 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("31 to 35 minutes block")
            .assertValueEquals("on")
        // Then "36 to 40 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("36 to 40 minutes block")
            .assertValueEquals("on")
        // Then "41 to 45 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("41 to 45 minutes block")
            .assertValueEquals("on")
        // Then "46 to 50 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("46 to 50 minutes block")
            .assertValueEquals("on")
        // Then "51 to 55 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("51 to 55 minutes block")
            .assertValueEquals("on")
    }

    @Test
    fun given_BerlinClockState_when_OneHourBlocksOnCountEquals0_then_1To4HoursBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When oneHourBlocksOnCount is 0
        val state = BerlinClockState(oneHourBlocksOnCount = 0)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 hour block" should be "off"
        composeTestRule.onNodeWithContentDescription("1 hour block")
            .assertValueEquals("off")
        // Then "2 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("2 hours block")
            .assertValueEquals("off")
        // Then "3 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("3 hours block")
            .assertValueEquals("off")
        // Then "4 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("4 hours block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_OneHourBlocksOnCountEquals1_then_1HoursBlockEqualsOn_and_2To4HoursBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When oneHourBlocksOnCount is 1
        val state = BerlinClockState(oneHourBlocksOnCount = 1)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 hour block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 hour block")
            .assertValueEquals("on")
        // Then "2 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("2 hours block")
            .assertValueEquals("off")
        // Then "3 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("3 hours block")
            .assertValueEquals("off")
        // Then "4 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("4 hours block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_OneHourBlocksOnCountEquals2_then_1To2HoursBlockEqualsOn_and_3To4HoursBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When oneHourBlocksOnCount is 2
        val state = BerlinClockState(oneHourBlocksOnCount = 2)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 hour block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 hour block")
            .assertValueEquals("on")
        // Then "2 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("2 hours block")
            .assertValueEquals("on")
        // Then "3 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("3 hours block")
            .assertValueEquals("off")
        // Then "4 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("4 hours block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_OneHourBlocksOnCountEquals3_then_1To3HoursBlockEqualsOn_and_4HoursBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When oneHourBlocksOnCount is 3
        val state = BerlinClockState(oneHourBlocksOnCount = 3)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 hour block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 hour block")
            .assertValueEquals("on")
        // Then "2 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("2 hours block")
            .assertValueEquals("on")
        // Then "3 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("3 hours block")
            .assertValueEquals("on")
        // Then "4 hours block" should be "off"
        composeTestRule.onNodeWithContentDescription("4 hours block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_OneHourBlocksOnCountEquals4_then_1To4HoursBlockEqualsOn()
    {
        // Given a BerlinClockState state
        // When oneHourBlocksOnCount is 4
        val state = BerlinClockState(oneHourBlocksOnCount = 4)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 hour block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 hour block")
            .assertValueEquals("on")
        // Then "2 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("2 hours block")
            .assertValueEquals("on")
        // Then "3 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("3 hours block")
            .assertValueEquals("on")
        // Then "4 hours block" should be "on"
        composeTestRule.onNodeWithContentDescription("4 hours block")
            .assertValueEquals("on")
    }

    @Test
    fun given_BerlinClockState_when_OneMinuteBlocksOnCountEquals0_then_1To4MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When oneMinuteBlocksOnCount is 0
        val state = BerlinClockState(oneMinuteBlocksOnCount = 0)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 minute block" should be "off"
        composeTestRule.onNodeWithContentDescription("1 minute block")
            .assertValueEquals("off")
        // Then "2 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("2 minutes block")
            .assertValueEquals("off")
        // Then "3 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("3 minutes block")
            .assertValueEquals("off")
        // Then "4 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("4 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_OneMinuteBlocksOnCountEquals1_then_1MinuteBlockEqualsOn_and_2To4MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When oneMinuteBlocksOnCount is 1
        val state = BerlinClockState(oneMinuteBlocksOnCount = 1)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 minute block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 minute block")
            .assertValueEquals("on")
        // Then "2 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("2 minutes block")
            .assertValueEquals("off")
        // Then "3 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("3 minutes block")
            .assertValueEquals("off")
        // Then "4 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("4 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_OneMinuteBlocksOnCountEquals2_then_1To2MinutesBlockEqualsOn_and_3To4MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When oneMinuteBlocksOnCount is 2
        val state = BerlinClockState(oneMinuteBlocksOnCount = 2)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 minute block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 minute block")
            .assertValueEquals("on")
        // Then "2 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("2 minutes block")
            .assertValueEquals("on")
        // Then "3 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("3 minutes block")
            .assertValueEquals("off")
        // Then "4 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("4 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_OneMinuteBlocksOnCountEquals3_then_1To3MinutesBlockEqualsOn_and_4MinutesBlockEqualsOff()
    {
        // Given a BerlinClockState state
        // When oneMinuteBlocksOnCount is 3
        val state = BerlinClockState(oneMinuteBlocksOnCount = 3)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 minute block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 minute block")
            .assertValueEquals("on")
        // Then "2 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("2 minutes block")
            .assertValueEquals("on")
        // Then "3 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("3 minutes block")
            .assertValueEquals("on")
        // Then "4 minutes block" should be "off"
        composeTestRule.onNodeWithContentDescription("4 minutes block")
            .assertValueEquals("off")
    }

    @Test
    fun given_BerlinClockState_when_OneMinuteBlocksOnCountEquals4_then_1To4MinutesBlockEqualsOn()
    {
        // Given a BerlinClockState state
        // When oneMinuteBlocksOnCount is 4
        val state = BerlinClockState(oneMinuteBlocksOnCount = 4)

        composeTestRule.setContent {
            BerlinClockTheme {
                BerlinClock(state)
            }
        }

        // Then "1 minute block" should be "on"
        composeTestRule.onNodeWithContentDescription("1 minute block")
            .assertValueEquals("on")
        // Then "2 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("2 minutes block")
            .assertValueEquals("on")
        // Then "3 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("3 minutes block")
            .assertValueEquals("on")
        // Then "4 minutes block" should be "on"
        composeTestRule.onNodeWithContentDescription("4 minutes block")
            .assertValueEquals("on")
    }
}