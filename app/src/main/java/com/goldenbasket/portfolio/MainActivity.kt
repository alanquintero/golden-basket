package com.goldenbasket.portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.goldenbasket.portfolio.ui.theme.GoldenBasketTheme
import com.goldenbasket.portfolio.ui.PortfolioApp

/**
 * MainActivity is the entry point of the app when using Jetpack Compose.
 *
 * Responsibilities:
 * - Sets up the app's theme and main content using Compose.
 * - Hosts the NavHost for handling navigation between composable screens:
 *   History, Charts, Home, Categories, and Tools.
 * - Configures the BottomNavigationBar composable to switch between the main
 *   destinations.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoldenBasketTheme {
                PortfolioApp()
            }
        }
    }
}