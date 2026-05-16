package com.pdm0126.foodspot.repository

import com.pdm0126.foodspot.model.Restaurant

interface RestaurantRepository {
    suspend fun getRestaurants(): List<Restaurant>
    suspend fun getRestaurantById(id: Int): Restaurant?
    suspend fun searchRestaurants(query: String): List<Restaurant>
}