package ru.deadoralive.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val ButtonBackgroundColor = Color(0xFF5A3472)
val BackgroundColor = Brush.linearGradient(
    0.0f to Color(0xFF310050),
    500.0f to Color(0xFF000000),
    start = Offset.Zero,
    end = Offset.Infinite
)
val MainTextColor = Color(0xFFFFFFFF)
val CardTextColor = Color(0xFF000000)
val CardBackgroundColor = Color(0xFFFFFFFF)

val DeadIconGradient = Brush.linearGradient(
    0.0f to Color(0xFF0D658A),
    500.0f to Color(0xFFB0FFB4),
    start = Offset.Zero,
    end = Offset.Infinite
)
val AliveIconGradient = Brush.linearGradient(
    0.0f to Color(0xFFFFB800),
    500.0f to Color(0xFFFFF7B0),
    start = Offset.Zero,
    end = Offset.Infinite
)
val LifeIconGradient = Brush.linearGradient(
    0.0f to Color(0xFFAD00FF),
    500.0f to Color(0xFFFFB0E9),
    start = Offset.Zero,
    end = Offset.Infinite
)
