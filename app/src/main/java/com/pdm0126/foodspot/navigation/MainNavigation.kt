package com.pdm0126.foodspot.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.foodspot.screens.detail.DetailScreen
import com.pdm0126.foodspot.screens.home.HomeScreen
import com.pdm0126.foodspot.screens.search.SearchScreen
import com.pdm0126.foodspot.screens.cart.CartScreen
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
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
                    },
                    onNavigateToCart = {
                        backStack.add(Routes.Cart)
                    }
                )
            }
            entry<Routes.Detail> { key ->
                DetailScreen(
                    restaurantId = key.restaurantId,
                    onNavigateBack = { backStack.removeLastOrNull() },
                    onNavigateToCart = { backStack.add(Routes.Cart) }
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
            entry<Routes.Cart> {
                CartScreen(
                    onNavigateBack = { backStack.removeLastOrNull() }
                )
            }
        },
        transitionSpec = {
            slideInHorizontally(
                initialOffsetX = { it },
                animationSpec = tween(500)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { -it },
                animationSpec = tween(500)
            )
        },
        popTransitionSpec = {
            slideInHorizontally(
                initialOffsetX = { -it },
                animationSpec = tween(500)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { it },
                animationSpec = tween(500)
            )
        },
        predictivePopTransitionSpec = {
            slideInHorizontally(
                initialOffsetX = { -it },
                animationSpec = tween(250)
            ) togetherWith slideOutHorizontally(
                targetOffsetX = { it },
                animationSpec = tween(250)
            )
        }
    )
}