package com.pdm0126.foodspot.screens.detail

import com.pdm0126.foodspot.model.Restaurant

data class DetailUiState(
    val restaurant: Restaurant? = null,
    val isLoading: Boolean = true
)
