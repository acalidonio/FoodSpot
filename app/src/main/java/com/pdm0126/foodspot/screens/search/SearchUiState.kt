package com.pdm0126.foodspot.screens.search

import com.pdm0126.foodspot.model.Restaurant

data class SearchUiState(
    val query: String = "",
    val results: List<Restaurant> = emptyList()
)
