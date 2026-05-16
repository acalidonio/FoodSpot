package com.pdm0126.foodspot.repository

import com.pdm0126.foodspot.model.CartItem
import com.pdm0126.foodspot.model.Dish
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

object CartRepository {
    private val _cartItems = MutableStateFlow<List<CartItem>>(emptyList())
    val cartItems: StateFlow<List<CartItem>> = _cartItems.asStateFlow()

    fun addDish(dish: Dish, restaurantName: String) {
        _cartItems.update { currentItems ->
            val existingItem = currentItems.find { it.dish.id == dish.id }
            if (existingItem != null) {
                currentItems.map {
                    if (it.dish.id == dish.id) it.copy(quantity = it.quantity + 1) else it
                }
            } else {
                currentItems + CartItem(dish, restaurantName)
            }
        }
    }

    fun removeDish(dishId: Int) {
        _cartItems.update { currentItems ->
            currentItems.filterNot { it.dish.id == dishId }
        }
    }

    fun clearCart() {
        _cartItems.value = emptyList()
    }

    fun updateQuantity(dishId: Int, newQuantity: Int) {
        _cartItems.update { currentItems ->
            currentItems.map {
                if (it.dish.id == dishId) it.copy(quantity = newQuantity) else it
            }
        }
    }

}