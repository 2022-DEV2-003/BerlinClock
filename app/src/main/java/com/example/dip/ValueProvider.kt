package com.example.dip

/**
 * The API for components capable of providing a value.
 * @param TValue The type of the value that can be provided.
 */
interface ValueProvider<TValue> {

    /**
     * Gets the value.
     * @return The provided value.
     */
    fun getValue(): TValue
}