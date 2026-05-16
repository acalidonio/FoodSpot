package com.pdm0126.foodspot.screens.home

import com.pdm0126.foodspot.model.Restaurant

data class HomeUiState(
    val groupedRestaurants: Map<String, List<Restaurant>> = emptyMap()
)
