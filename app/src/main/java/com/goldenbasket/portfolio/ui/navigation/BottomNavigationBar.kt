package com.goldenbasket.portfolio.ui.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

/**
 * Composable function that renders the bottom navigation bar for the app.
 *
 * This component displays navigation items for all the top-level screens
 * defined in the app, showing their respective icons and titles. Selecting
 * an item triggers navigation to the corresponding screen.
 *
 * @param navController The NavHostController used to navigate between screens.
 * @param screens The list of screens that will be shown in the navigation bar.
 */
@Composable
fun BottomNavigationBar(navController: NavController, screens: List<Screen>) {
    NavigationBar {
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route

        screens.forEach { screen ->
            val route = stringResource(id = screen.routeRes)
            NavigationBarItem(
                label = { Text(stringResource(id = screen.titleRes)) },
                icon = { Icon(painter = painterResource(id = screen.iconRes), contentDescription = stringResource(screen.titleRes)) },
                selected = currentRoute == route,
                onClick = {
                    navController.navigate(route) {
                        launchSingleTop = true
                        restoreState = true
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                    }
                }
            )
        }
    }
}
