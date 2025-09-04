package com.goldenbasket.portfolio.ui.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.goldenbasket.portfolio.R

/**
 * Represents the different screens of the application for navigation purposes.
 *
 * Each screen has an associated string resource for its route and title,
 * as well as an icon to display in the BottomNavigationBar.
 *
 * This sealed class ensures type safety when navigating between screens.
 *
 * @property routeRes The string resource ID representing the navigation route.
 * @property titleRes The string resource ID representing the screen title.
 * @property iconRes The icon to display for this screen in the bottom navigation.
 */
sealed class Screen(@StringRes val routeRes: Int, @StringRes val titleRes: Int, @DrawableRes val iconRes: Int) {
    data object History : Screen(R.string.screen_history, R.string.history_title, R.drawable.baseline_history_24)
    data object Charts : Screen(R.string.screen_charts, R.string.charts_title, R.drawable.baseline_charts_24)
    data object Home : Screen(R.string.screen_home, R.string.home_title, R.drawable.baseline_home_24)
    data object Categories : Screen(R.string.screen_categories, R.string.title_categories, R.drawable.baseline_category_24)
    data object Tools : Screen(R.string.screen_tools, R.string.tools_title, R.drawable.baseline_tools_24)
}