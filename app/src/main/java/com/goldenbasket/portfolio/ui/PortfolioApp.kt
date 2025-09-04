package com.goldenbasket.portfolio.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.goldenbasket.portfolio.ui.screen.categories.CategoriesScreen
import com.goldenbasket.portfolio.ui.screen.charts.ChartsScreen
import com.goldenbasket.portfolio.ui.screen.history.HistoryScreen
import com.goldenbasket.portfolio.ui.screen.home.HomeScreen
import com.goldenbasket.portfolio.ui.screen.tools.ToolsScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.goldenbasket.portfolio.R
import com.goldenbasket.portfolio.ui.navigation.BottomNavigationBar
import com.goldenbasket.portfolio.ui.navigation.Screen

/**
 * Main entry point of the application, implemented using Jetpack Compose.
 *
 * This class sets up the navigation host and the overall app theme.
 * It defines the start destination and provides the composable screens
 * used in the BottomNavigationBar.
 */
@Composable
fun PortfolioApp() {
    val navController = rememberNavController()
    // screens
    val homeScreen = stringResource(R.string.screen_home)
    val toolsScreen = stringResource(R.string.screen_tools)
    val chartsScreen = stringResource(R.string.screen_charts)
    val historyScreen = stringResource(R.string.screen_history)
    val categoriesScreen = stringResource(R.string.screen_categories)

    val screens = listOf(
        Screen.History,
        Screen.Charts,
        Screen.Home,
        Screen.Categories,
        Screen.Tools
    )

    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController, screens)
        }
    ) { innerPadding ->
        NavHost(
            navController,
            startDestination = homeScreen,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(historyScreen) { HistoryScreen() }
            composable(chartsScreen) { ChartsScreen() }
            composable(homeScreen) { HomeScreen() }
            composable(categoriesScreen) { CategoriesScreen() }
            composable(toolsScreen) { ToolsScreen() }
        }
    }
}