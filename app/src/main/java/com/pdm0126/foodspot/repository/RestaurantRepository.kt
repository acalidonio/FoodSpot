package com.pdm0126.foodspot.repository

import com.pdm0126.foodspot.model.Restaurant

interface RestaurantRepository {
    fun getRestaurants(): List<Restaurant>
    fun getRestaurantById(id: Int): Restaurant?
    fun searchRestaurants(query: String): List<Restaurant>
}