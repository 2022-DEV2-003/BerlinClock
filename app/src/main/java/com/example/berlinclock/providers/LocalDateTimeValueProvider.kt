package com.example.berlinclock.providers

import com.example.dip.ValueProvider
import java.time.LocalDateTime

/**
 * A component capable of providing a instances of [LocalDateTime]
 */
object LocalDateTimeValueProvider : ValueProvider<LocalDateTime> {
    override fun getValue(): LocalDateTime {
        TODO("Not yet implemented")
    }
}