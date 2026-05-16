package com.pdm0126.foodspot.screens.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.repository.CartRepository
import com.pdm0126.foodspot.repository.RestaurantRepository
import com.pdm0126.foodspot.repository.impl.RestaurantRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DetailViewModel : ViewModel() {
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()

    private val _uiState = MutableStateFlow(DetailUiState())
    val uiState = _uiState.asStateFlow()

    fun loadRestaurant(id: Int) {
        viewModelScope.launch {
            val restaurant = repository.getRestaurantById(id)
            _uiState.value = DetailUiState(restaurant, false)
        }
    }

    fun addToCart(dish: Dish) {
        val restaurantName = uiState.value.restaurant?.name ?: "Unknown"
        CartRepository.addDish(dish, restaurantName)
    }
}