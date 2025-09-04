package com.goldenbasket.portfolio.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// ------------- Define the colors -------------
private val Purple40 = Color(0xFFBB86FC)
private val Purple80 = Color(0xFF3700B3)
private val Teal200 = Color(0xFF03DAC5)
private val White = Color(0xFFFFFFFF)
private val Black = Color(0xFF000000)

// Colors for light theme
private val LightColors = lightColorScheme(
    primary = Purple40,
    onPrimary = White,
    secondary = Teal200,
    onSecondary = Black,
    background = White,
    onBackground = Black,
    surface = White,
    onSurface = Black,
    error = Color(0xFFB00020),
    onError = White
)

// Colors for dark theme
private val DarkColors = darkColorScheme(
    primary = Purple80,
    onPrimary = Black,
    secondary = Teal200,
    onSecondary = Black,
    background = Black,
    onBackground = White,
    surface = Black,
    onSurface = White,
    error = Color(0xFFCF6679),
    onError = Black
)

// ------------- Typography -------------
private val AppTypography = Typography()

// ------------- Composable Theme -------------
@Composable
fun GoldenBasketTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = AppTypography,
        content = content
    )
}