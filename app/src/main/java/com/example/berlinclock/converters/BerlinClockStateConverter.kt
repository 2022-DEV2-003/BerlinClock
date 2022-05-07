package com.example.berlinclock.converters

import com.example.dip.Converter
import com.example.berlinclock.ui.BerlinClockState
import java.time.LocalDateTime

/**
 * A component capable of converting an instance of [LocalDateTime] into an instance of [BerlinClockState]
 */
object BerlinClockStateConverter : Converter<LocalDateTime, BerlinClockState> {

    override fun convert(source: LocalDateTime) = convertToBerlinClockState(source)

    private fun convertToBerlinClockState(time: LocalDateTime) =
        BerlinClockState(
            time.second % 2 == 0,
            time.hour / 5, time.hour % 5,
            time.minute / 5, time.minute % 5
        )
}