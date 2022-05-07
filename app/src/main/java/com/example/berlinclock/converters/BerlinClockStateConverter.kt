package com.example.berlinclock.converters

import com.example.dip.Converter
import com.example.berlinclock.ui.BerlinClockState
import java.time.LocalDateTime

/**
 * A component capable of converting an instance of [LocalDateTime] into an instance of [BerlinClockState]
 */
object BerlinClockStateConverter : Converter<LocalDateTime, BerlinClockState> {
    override fun convert(source: LocalDateTime): BerlinClockState {
        TODO("Not yet implemented")
    }
}