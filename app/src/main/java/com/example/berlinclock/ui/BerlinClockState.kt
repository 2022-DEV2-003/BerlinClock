package com.example.berlinclock.ui

/**
 * A state representing a Berlin Clock.
 *
 * @property secondsOn the 'seconds block' illuminated state.
 * @property fiveHoursBocksOnCount the count of 'five hours blocks' illuminated.
 * @property oneHourBlocksOnCount the count of 'one hour blocks' illuminated.
 * @property fiveMinutesBlocksOnCount the count of 'five minutes blocks' illuminated.
 * @property oneMinuteBlocksOnCount the count of 'one minute blocks' illuminated.
 */
data class BerlinClockState(
    val secondsOn: Boolean = false,
    val fiveHoursBocksOnCount: Int = 0,
    val oneHourBlocksOnCount: Int = 0,
    val fiveMinutesBlocksOnCount: Int = 0,
    val oneMinuteBlocksOnCount: Int = 0
) {
    init {
        require(fiveHoursBocksOnCount in 0..4)
        require(oneHourBlocksOnCount in 0..4)
        require(fiveMinutesBlocksOnCount in 0..11)
        require(oneMinuteBlocksOnCount in 0..4)
    }
}