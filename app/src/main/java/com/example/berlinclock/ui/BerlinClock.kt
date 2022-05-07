package com.example.berlinclock.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.berlinclock.ui.theme.BerlinClockTheme

/**
 * Stateless BerlinClock [Composable].
 */
@Composable
fun BerlinClock(
    state: BerlinClockState
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .clip(CircleShape)
                .border(2.dp, Color.LightGray, CircleShape)
                .background(if (state.secondsOn) Color.Red else Color.Transparent)
                .semantics {
                    contentDescription = "even seconds block"
                    stateDescription = if (state.secondsOn) "on" else "off"
                }
        )
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp))
                    .border(2.dp, Color.LightGray, RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp))
                    .background(if (state.fiveHoursBocksOnCount >= 1) Color.Red else Color.Transparent)
                    .semantics {
                        contentDescription = "1 to 5 hours block"
                        stateDescription = if (state.fiveHoursBocksOnCount >= 1) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.fiveHoursBocksOnCount >= 2) Color.Red else Color.Transparent)
                    .semantics {
                        contentDescription = "6 to 10 hours block"
                        stateDescription = if (state.fiveHoursBocksOnCount >= 2) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.fiveHoursBocksOnCount >= 3) Color.Red else Color.Transparent)
                    .semantics {
                        contentDescription = "11 to 15 hours block"
                        stateDescription = if (state.fiveHoursBocksOnCount >= 3) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp))
                    .border(2.dp, Color.LightGray, RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp))
                    .background(if (state.fiveHoursBocksOnCount >= 4) Color.Red else Color.Transparent)
                    .semantics {
                        contentDescription = "16 to 20 hours block"
                        stateDescription = if (state.fiveHoursBocksOnCount >= 4) "on" else "off"
                    }
            )
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .fillMaxHeight()
                    .clip(RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp))
                    .border(2.dp, Color.LightGray, RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp))
                    .background(if (state.oneHourBlocksOnCount >= 1) Color.Red else Color.Transparent)
                    .semantics {
                        contentDescription = "1 hour block"
                        stateDescription = if (state.oneHourBlocksOnCount >= 1) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.oneHourBlocksOnCount >= 2) Color.Red else Color.Transparent)
                    .semantics {
                        contentDescription = "2 hours block"
                        stateDescription = if (state.oneHourBlocksOnCount >= 2) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.oneHourBlocksOnCount >= 3) Color.Red else Color.Transparent)
                    .semantics {
                        contentDescription = "3 hours block"
                        stateDescription = if (state.oneHourBlocksOnCount >= 3) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp))
                    .border(2.dp, Color.LightGray, RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp))
                    .background(if (state.oneHourBlocksOnCount >= 4) Color.Red else Color.Transparent)
                    .semantics {
                        contentDescription = "4 hours block"
                        stateDescription = if (state.oneHourBlocksOnCount >= 4) "on" else "off"
                    }
            )
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp))
                    .border(2.dp, Color.LightGray, RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp))
                    .background(if (state.fiveMinutesBlocksOnCount >= 1) Color.Yellow else Color.Transparent)
                    .semantics {
                        contentDescription = "1 to 5 minutes block"
                        stateDescription = if (state.fiveMinutesBlocksOnCount >= 1) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.fiveMinutesBlocksOnCount >= 2) Color.Yellow else Color.Transparent)
                    .semantics {
                        contentDescription = "6 to 10 minutes block"
                        stateDescription = if (state.fiveMinutesBlocksOnCount >= 2) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.fiveMinutesBlocksOnCount >= 3) Color.Red else Color.Transparent)
                    .semantics {
                        contentDescription = "11 to 15 minutes block"
                        stateDescription = if (state.fiveMinutesBlocksOnCount >= 3) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.fiveMinutesBlocksOnCount >= 4) Color.Yellow else Color.Transparent)
                    .semantics {
                        contentDescription = "16 to 20 minutes block"
                        stateDescription = if (state.fiveMinutesBlocksOnCount >= 4) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.fiveMinutesBlocksOnCount >= 5) Color.Yellow else Color.Transparent)
                    .semantics {
                        contentDescription = "21 to 25 minutes block"
                        stateDescription = if (state.fiveMinutesBlocksOnCount >= 5) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.fiveMinutesBlocksOnCount >= 6) Color.Red else Color.Transparent)
                    .semantics {
                        contentDescription = "26 to 30 minutes block"
                        stateDescription = if (state.fiveMinutesBlocksOnCount >= 6) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.fiveMinutesBlocksOnCount >= 7) Color.Yellow else Color.Transparent)
                    .semantics {
                        contentDescription = "31 to 35 minutes block"
                        stateDescription = if (state.fiveMinutesBlocksOnCount >= 7) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.fiveMinutesBlocksOnCount >= 8) Color.Yellow else Color.Transparent)
                    .semantics {
                        contentDescription = "36 to 40 minutes block"
                        stateDescription = if (state.fiveMinutesBlocksOnCount >= 8) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.fiveMinutesBlocksOnCount >= 9) Color.Red else Color.Transparent)
                    .semantics {
                        contentDescription = "41 to 45 minutes block"
                        stateDescription = if (state.fiveMinutesBlocksOnCount >= 9) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.fiveMinutesBlocksOnCount >= 10) Color.Yellow else Color.Transparent)
                    .semantics {
                        contentDescription = "46 to 50 minutes block"
                        stateDescription = if (state.fiveMinutesBlocksOnCount >= 10) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp))
                    .border(2.dp, Color.LightGray, RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp))
                    .background(if (state.fiveMinutesBlocksOnCount >= 11) Color.Yellow else Color.Transparent)
                    .semantics {
                        contentDescription = "51 to 55 minutes block"
                        stateDescription = if (state.fiveMinutesBlocksOnCount >= 11) "on" else "off"
                    }
            )
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp))
                    .border(2.dp, Color.LightGray, RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp))
                    .background(if (state.oneMinuteBlocksOnCount >= 1) Color.Yellow else Color.Transparent)
                    .semantics {
                        contentDescription = "1 minute block"
                        stateDescription = if (state.oneMinuteBlocksOnCount >= 1) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.oneMinuteBlocksOnCount >= 2) Color.Yellow else Color.Transparent)
                    .semantics {
                        contentDescription = "2 minutes block"
                        stateDescription = if (state.oneMinuteBlocksOnCount >= 2) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RectangleShape)
                    .border(2.dp, Color.LightGray, RectangleShape)
                    .background(if (state.oneMinuteBlocksOnCount >= 3) Color.Yellow else Color.Transparent)
                    .semantics {
                        contentDescription = "3 minutes block"
                        stateDescription = if (state.oneMinuteBlocksOnCount >= 3) "on" else "off"
                    }
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .clip(RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp))
                    .border(2.dp, Color.LightGray, RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp))
                    .background(if (state.oneMinuteBlocksOnCount >= 4) Color.Yellow else Color.Transparent)
                    .semantics {
                        contentDescription = "4 minutes block"
                        stateDescription = if (state.oneMinuteBlocksOnCount >= 4) "on" else "off"
                    }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultBerlinClock() {
    val state = BerlinClockState(false, 2, 4, 5, 3)
    BerlinClockTheme {
        Box(modifier = Modifier.height(400.dp)) {
            BerlinClock(state)
        }
    }
}