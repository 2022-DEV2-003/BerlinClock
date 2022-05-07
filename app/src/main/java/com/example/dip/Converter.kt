package com.example.dip

/**
 * The API of a component capable of converting an instance of type [TInput] into an instance of type [TOutput].
 * @param TInput The type of the instance to convert from.
 * @param TOutput The type of the instance to convert to.
 */
interface Converter<TInput, TOutput> {

    /**
     * Converts an instance.
     * @param source The instance to convert.
     * @return The converted instance.
     */
    fun convert(source: TInput): TOutput
}