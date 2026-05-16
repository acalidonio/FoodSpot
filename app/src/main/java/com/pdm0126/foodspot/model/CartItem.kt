package com.pdm0126.foodspot.model

data class CartItem(
    val dish: Dish,
    val restaurantName: String,
    var quantity: Int = 1
)