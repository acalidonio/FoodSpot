package com.pdm0126.foodspot.repository.impl

import com.pdm0126.foodspot.model.*
import com.pdm0126.foodspot.repository.RestaurantRepository
import com.pdm0126.foodspot.repository.dummy.sampleRestaurants

class RestaurantRepositoryImpl : RestaurantRepository {
    override fun getRestaurants(): List<Restaurant> {
        return sampleRestaurants
    }

    override fun getRestaurantById(id: Int): Restaurant? {
        return sampleRestaurants.find { it.id == id }
    }

    override fun searchRestaurants(query: String): List<Restaurant> {
        if (query.isBlank()) return emptyList()

        return sampleRestaurants.filter { restaurant ->
            restaurant.name.contains(query, true) ||
                    restaurant.menu.any { dish ->
                        dish.name.contains(query, true)
                    }
        }
    }
}