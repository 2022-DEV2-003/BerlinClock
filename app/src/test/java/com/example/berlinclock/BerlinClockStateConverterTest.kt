package com.example.berlinclock

import com.example.berlinclock.converters.BerlinClockStateConverter
import com.example.berlinclock.ui.BerlinClockState
import com.example.dip.Converter
import org.junit.Test
import java.time.LocalDateTime
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertTrue

class BerlinClockStateConverterTest {

    @Test
    fun given_BerlinClockStateConverter_when_Convert_then_ReturnsBerlinClockState()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val time = LocalDateTime.now()
        // When convert()
        val state = converter.convert(time)
        // Then returns a BerlinClockState
        assertIs<BerlinClockState>(state)
    }

    @Test
    fun given_EvenSeconds_when_Convert_then_SecondsOnIsTrue()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then secondsOn is True
        assertTrue(state.secondsOn)
    }

    @Test
    fun given_OddSeconds_when_Convert_then_SecondsOnIsFalse()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:00:01"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then secondsOn is False
        assertFalse(state.secondsOn)
    }

    @Test
    fun given_HoursBetween0And4_when_Convert_then_FiveHoursBocksOnCountEquals0()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveHoursBocksOnCount is 0
        assertEquals(0, state.fiveHoursBocksOnCount)
    }

    @Test
    fun given_HoursBetween5And9_when_Convert_then_FiveHoursBocksOnCountEquals1()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T05:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveHoursBocksOnCount == 1
        assertEquals(1, state.fiveHoursBocksOnCount)
    }

    @Test
    fun given_HoursBetween10And14_when_Convert_then_FiveHoursBocksOnCountEquals2()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T10:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveHoursBocksOnCount == 2
        assertEquals(2, state.fiveHoursBocksOnCount)
    }

    @Test
    fun given_HoursBetween15And19_when_Convert_then_FiveHoursBocksOnCountEquals3()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T15:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveHoursBocksOnCount == 3
        assertEquals(3, state.fiveHoursBocksOnCount)
    }

    @Test
    fun given_HoursBetween20And24_when_Convert_then_FiveHoursBocksOnCountEquals4()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T20:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveHoursBocksOnCount == 4
        assertEquals(4, state.fiveHoursBocksOnCount)
    }

    @Test
    fun given_MinutesBetween0And4_when_Convert_then_FiveMinutesBocksOnCountEquals0()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveMinutesBlocksOnCount is 0
        assertEquals(0, state.fiveMinutesBlocksOnCount)
    }

    @Test
    fun given_MinutesBetween5And9_when_Convert_then_FiveMinutesBocksOnCountEquals1()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:05:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveMinutesBlocksOnCount is 1
        assertEquals(1, state.fiveMinutesBlocksOnCount)
    }

    @Test
    fun given_MinutesBetween10And14_when_Convert_then_FiveMinutesBocksOnCountEquals2()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:10:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveMinutesBlocksOnCount is 2
        assertEquals(2, state.fiveMinutesBlocksOnCount)
    }

    @Test
    fun given_MinutesBetween15And19_when_Convert_then_FiveMinutesBocksOnCountEquals3()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:15:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveMinutesBlocksOnCount is 3
        assertEquals(3, state.fiveMinutesBlocksOnCount)
    }

    @Test
    fun given_MinutesBetween20And24_when_Convert_then_FiveMinutesBocksOnCountEquals4()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:20:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveMinutesBlocksOnCount is 4
        assertEquals(4, state.fiveMinutesBlocksOnCount)
    }

    @Test
    fun given_MinutesBetween25And29_when_Convert_then_FiveMinutesBocksOnCountEquals5()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:25:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveMinutesBlocksOnCount is 5
        assertEquals(5, state.fiveMinutesBlocksOnCount)
    }

    @Test
    fun given_MinutesBetween30And34_when_Convert_then_FiveMinutesBocksOnCountEquals6()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:30:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveMinutesBlocksOnCount is 6
        assertEquals(6, state.fiveMinutesBlocksOnCount)
    }

    @Test
    fun given_MinutesBetween35And39_when_Convert_then_FiveMinutesBocksOnCountEquals7()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:35:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveMinutesBlocksOnCount is 7
        assertEquals(7, state.fiveMinutesBlocksOnCount)
    }

    @Test
    fun given_MinutesBetween40And44_when_Convert_then_FiveMinutesBocksOnCountEquals8()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:40:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveMinutesBlocksOnCount is 8
        assertEquals(8, state.fiveMinutesBlocksOnCount)
    }

    @Test
    fun given_MinutesBetween45And49_when_Convert_then_FiveMinutesBocksOnCountEquals9()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:45:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveMinutesBlocksOnCount is 9
        assertEquals(9, state.fiveMinutesBlocksOnCount)
    }

    @Test
    fun given_MinutesBetween50And54_when_Convert_then_FiveMinutesBocksOnCountEquals10()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:50:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveMinutesBlocksOnCount is 10
        assertEquals(10, state.fiveMinutesBlocksOnCount)
    }

    @Test
    fun given_MinutesBetween55And59_when_Convert_then_FiveMinutesBocksOnCountEquals11()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:55:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then fiveMinutesBlocksOnCount is 11
        assertEquals(11, state.fiveMinutesBlocksOnCount)
    }

    @Test
    fun given_HoursMod5Equals0_when_Convert_then_OneHourBlocksOnCountEquals0()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then oneHourBlocksOnCount is 0
        assertEquals(0, state.oneHourBlocksOnCount)
    }

    @Test
    fun given_HoursMod5Equals1_when_Convert_then_OneHourBlocksOnCountEquals1()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T16:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then oneHourBlocksOnCount is 1
        assertEquals(1, state.oneHourBlocksOnCount)
    }

    @Test
    fun given_HoursMod5Equals2_when_Convert_then_OneHourBlocksOnCountEquals2()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T12:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then oneHourBlocksOnCount is 2
        assertEquals(2, state.oneHourBlocksOnCount)
    }

    @Test
    fun given_HoursMod5Equals3_when_Convert_then_OneHourBlocksOnCountEquals3()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T03:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then oneHourBlocksOnCount is 3
        assertEquals(3, state.oneHourBlocksOnCount)
    }

    @Test
    fun given_HoursMod5Equals4_when_Convert_then_OneHourBlocksOnCountEquals4()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T14:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then oneHourBlocksOnCount is 4
        assertEquals(4, state.oneHourBlocksOnCount)
    }

    @Test
    fun given_MinutesMod5Equals0_when_Convert_then_OneMinuteBlocksOnCountEquals0()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:00:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then oneMinuteBlocksOnCount is 0
        assertEquals(0, state.oneMinuteBlocksOnCount)
    }

    @Test
    fun given_MinutesMod5Equals1_when_Convert_then_OneMinuteBlocksOnCountEquals1()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:01:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then oneMinuteBlocksOnCount is 1
        assertEquals(1, state.oneMinuteBlocksOnCount)
    }

    @Test
    fun given_MinutesMod5Equals2_when_Convert_then_OneMinuteBlocksOnCountEquals2()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:17:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then oneMinuteBlocksOnCount is 2
        assertEquals(2, state.oneMinuteBlocksOnCount)
    }

    @Test
    fun given_MinutesMod5Equals3_when_Convert_then_OneMinuteBlocksOnCountEquals3()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:23:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then oneMinuteBlocksOnCount is 3
        assertEquals(3, state.oneMinuteBlocksOnCount)
    }

    @Test
    fun given_MinutesMod5Equals4_when_Convert_then_OneMinuteBlocksOnCountEquals4()
    {
        // Given a Converter<LocalDateTime, BerlinClockState>
        val converter: Converter<LocalDateTime, BerlinClockState> = BerlinClockStateConverter
        val strDateTime = "2015-08-04T00:44:00"
        val time = LocalDateTime.parse(strDateTime)
        // When convert()
        val state = converter.convert(time)
        // Then oneMinuteBlocksOnCount is 4
        assertEquals(4, state.oneMinuteBlocksOnCount)
    }
}