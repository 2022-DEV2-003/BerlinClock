package com.example.berlinclock

import com.example.berlinclock.providers.LocalDateTimeValueProvider
import com.example.dip.ValueProvider
import org.junit.Test
import java.time.LocalDateTime
import kotlin.test.assertIs

class LocalDateTimeValueProviderTest {

    @Test
    fun given_LocalDateTimeValueProvider_when_GetValue_then_ReturnsLocalDateTime()
    {
        // Given a ValueProvider<LocalDateTime>
        val provider : ValueProvider<LocalDateTime> = LocalDateTimeValueProvider
        // When getValue()
        val value = provider.getValue()
        // Then return a LocalDateTime
        assertIs<LocalDateTime>(value)
    }
}