package com.pdm0126.foodspot.repository.dummy

import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.model.Restaurant

val sampleRestaurants = listOf(
    Restaurant(
        1,
        "Pizza Place",
        "Las mejores pizzas artesanales de la ciudad",
        "https://images.unsplash.com/photo-1611915365928-565c527a0590?q=80&w=1025",
        listOf("Italiana", "Pizzas"),
        listOf(
            Dish(
                1,
                "Pizza Margarita",
                "Mozzarella, albahaca y tomate fresco",
                "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=781"
            ),
            Dish(
                2,
                "Pizza Pepperoni",
                "Pepperoni con queso mozzarella derretido",
                "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?q=80&w=1176"
            )
        )
    )
)