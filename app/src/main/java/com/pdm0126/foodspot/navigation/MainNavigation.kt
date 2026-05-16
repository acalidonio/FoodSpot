package com.pdm0126.foodspot.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.foodspot.screens.detail.DetailScreen
import com.pdm0126.foodspot.screens.home.HomeScreen
import com.pdm0126.foodspot.screens.search.SearchScreen
import androidx.navigation3.runtime.entryProvider

@Composable
fun MainNavigation() {
    val backStack = rememberNavBackStack(Routes.Home)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.Home> {
                HomeScreen(
                    onNavigateToDetail = { restaurantId ->
                        backStack.add(Routes.Detail(restaurantId))
                    },
                    onNavigateToSearch = {
                        backStack.add(Routes.Search)
                    }
                )
            }
            entry<Routes.Detail> { key ->
                DetailScreen(
                    restaurantId = key.restaurantId,
                    onNavigateBack = { backStack.removeLastOrNull() }
                )
            }
            entry<Routes.Search> {
                SearchScreen(
                    onNavigateBack = { backStack.removeLastOrNull() },
                    onNavigateToDetail = { restaurantId ->
                        backStack.add(Routes.Detail(restaurantId))
                    }
                )
            }
        }
    )
}