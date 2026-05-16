package com.pdm0126.foodspot.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.foodspot.model.Restaurant
import com.pdm0126.foodspot.repository.RestaurantRepository
import com.pdm0126.foodspot.repository.impl.RestaurantRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()
    private val _uiState = MutableStateFlow(HomeUiState())

    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadRestaurants()
    }

    private fun loadRestaurants() {
        viewModelScope.launch {
            val restaurants = repository.getRestaurants()

            val groupedMap = mutableMapOf<String, MutableList<Restaurant>>()
            restaurants.forEach { restaurant ->
                restaurant.categories.forEach { category ->
                    groupedMap.getOrPut(category) { mutableListOf() }.add(restaurant)
                }
            }

            _uiState.value = HomeUiState(groupedMap)
        }
    }
}