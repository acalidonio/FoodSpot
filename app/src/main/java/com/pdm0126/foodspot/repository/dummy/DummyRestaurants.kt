package com.pdm0126.foodspot.repository.dummy

import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.model.Restaurant

val sampleRestaurants = listOf(
    Restaurant(
        1,
        "Pizza Place",
        "Las mejores pizzas artesanales de la ciudad",
        "https://images.unsplash.com/photo-1611915365928-565c527a0590?q=80&w=800",
        listOf("Italiana", "Pizzas", "Comida Rápida"),
        listOf(
            Dish(
                1,
                "Pizza Margarita",
                "Mozzarella, albahaca y tomate fresco",
                "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?q=80&w=400"
            ),
            Dish(
                2,
                "Pizza de Pepperoni",
                "Pepperoni con queso mozzarella derretido",
                "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?q=80&w=400"
            ),
            Dish(
                3,
                "Pizza Hawaiana",
                "Piña, jamón y queso mozzarella",
                "https://images.unsplash.com/photo-1597715469889-dd75fe4a1765?q=80&w=400"
            )
        )
    ),
    Restaurant(
        2,
        "Burger House",
        "Hamburguesas premium con carne 100% de res.",
        "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?q=80&w=800",
        listOf("Hamburguesas", "Comida Rápida"),
        listOf(
            Dish(
                4,
                "Hamburguesa Clásica",
                "Carne, lechuga, tomate y queso cheddar",
                "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?q=80&w=400"
            ),
            Dish(
                5,
                "Bacon Burger",
                "Doble carne con tocino crujiente y salsa BBQ",
                "https://images.unsplash.com/photo-1648221410814-9d45c9ab144b?q=80&w=400"
            ),
            Dish(
                6,
                "Papas Fritas",
                "Porción grande de papas crujientes",
                "https://images.unsplash.com/photo-1576107232684-1279f390859f?q=80&w=400"
            )
        )
    ),
    Restaurant(
        3,
        "Sushi Bar",
        "Auténtico sushi y cocina tradicional japonesa.",
        "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?q=80&w=800",
        listOf("Asiática", "Saludable"),
        listOf(
            Dish(
                7,
                "Nigiri de Salmón",
                "Arroz cubierto con un corte fresco de salmón",
                "https://images.unsplash.com/photo-1710945301326-d60727e4833a?q=80&w=400"
            ),
            Dish(
                8,
                "California Roll",
                "Rollo de cangrejo, aguacate y pepino",
                "https://plus.unsplash.com/premium_photo-1736798695947-2c7661f72bc8?q=80&w=400"
            ),
            Dish(
                9,
                "Sopa Miso",
                "Sopa tradicional con tofu y algas",
                "https://images.unsplash.com/photo-1680137248903-7af5d51a3350?q=80&w=400"
            )
        )
    ),
    Restaurant(
        4,
        "Green Bowl",
        "Opciones saludables, ensaladas y bowls nutritivos.",
        "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?q=80&w=800",
        listOf("Ensaladas", "Saludable"),
        listOf(
            Dish(
                10,
                "Bowl de Quinoa",
                "Quinoa, aguacate, pollo a la plancha y aderezo de la casa",
                "https://images.unsplash.com/photo-1623428187969-5da2dcea5ebf?q=80&w=400"
            ),
            Dish(
                11,
                "Ensalada César",
                "Lechuga romana, crutones, parmesano, pollo a la plancha y aderezo césar",
                "https://images.unsplash.com/photo-1550304943-4f24f54ddde9?q=80&w=400"
            ),
            Dish(
                12,
                "Smoothie Verde",
                "Batido de espinaca, manzana y apio",
                "https://plus.unsplash.com/premium_photo-1700084621249-b22c621ac4e9?q=80&w=400"
            )
        )
    ),
    Restaurant(
        5,
        "Bella Pasta",
        "Pasta fresca con un sazón 100% Italiano.",
        "https://images.unsplash.com/photo-1473093295043-cdd812d0e601?q=80&w=800",
        listOf("Italiana"),
        listOf(
            Dish(
                13,
                "Spaghetti a la Boloñesa",
                "Pasta con salsa de tomate y carne molida",
                "https://images.unsplash.com/photo-1622973536968-3ead9e780960?q=80&w=400"
            ),
            Dish(
                14,
                "Fetuccini Alfredo",
                "Pasta plana en salsa cremosa",
                "https://images.unsplash.com/photo-1645112411341-6c4fd023714a?q=80&w=400"
            ),
            Dish(
                15,
                "Lasagna Clásica",
                "Capas de pasta, carne, queso y salsa bechamel",
                "https://images.unsplash.com/photo-1574894709920-11b28e7367e3?q=80&w=400"
            )
        )
    ),
    Restaurant(
        6,
        "Wok Express",
        "Comida china rápida y deliciosa.",
        "https://images.unsplash.com/photo-1585032226651-759b368d7246?q=80&w=800",
        listOf("Asiática", "Comida Rápida"),
        listOf(
            Dish(
                16,
                "Pollo Agridulce",
                "Trozos de pollo frito en salsa agridulce",
                "https://images.unsplash.com/photo-1664138788119-bd4f073259d5?q=80&w=400"
            ),
            Dish(
                17, "Arroz Frito",
                "Arroz salteado con verduras y huevo",
                "https://images.unsplash.com/photo-1603133872878-684f208fb84b?q=80&w=400"
            ),
            Dish(
                18,
                "Rollitos Primavera",
                "Rollitos fritos rellenos de vegetales",
                "https://images.unsplash.com/photo-1606525437679-037aca74a3e9?q=80&w=400"
            )
        )
    ),
    Restaurant(
        7,
        "Tacos Mex",
        "Tacos al pastor y antojitos mexicanos.",
        "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?q=80&w=800",
        listOf("Comida Rápida", "Mexicana"),
        listOf(
            Dish(
                19,
                "Tacos al Pastor",
                "Orden de 3 tacos al pastor con piña y cilantro",
                "https://images.unsplash.com/photo-1551504734-5ee1c4a1479b?q=80&w=400"
            ),
            Dish(
                20,
                "Quesadilla Gigante",
                "Tortilla de harina con extra queso y carne",
                "https://images.unsplash.com/photo-1719957770167-bb66133ba808?q=80&w=400"
            ),
            Dish(
                21,
                "Nachos Supremos",
                "Nachos con queso fundido, frijoles y jalapeños",
                "https://images.unsplash.com/photo-1513456852971-30c0b8199d4d?q=80&w=400"
            )
        )
    ),
    Restaurant(
        8,
        "Sweet Treats",
        "Los mejores postres y pasteles para endulzar tu día.",
        "https://images.unsplash.com/photo-1595397351604-cf490cc38bf1?q=80&w=800",
        listOf("Postres"),
        listOf(
            Dish(
                22,
                "Pastel de Chocolate",
                "Rebanada de pastel de triple chocolate",
                "https://images.unsplash.com/photo-1578985545062-69928b1d9587?q=80&w=400"
            ),
            Dish(
                23,
                "Cheesecake de Fresa",
                "Tarta de queso cubierta con jalea de fresas",
                "https://images.unsplash.com/photo-1676300185983-d5f242babe34?q=80&w=400"
            ),
            Dish(
                24,
                "Helado Artesanal",
                "Dos bolas de helado con sabor a elección",
                "https://images.unsplash.com/photo-1534706936160-d5ee67737249?q=80&w=400"
            )
        )
    ),
    Restaurant(
        9,
        "Coffee Corner",
        "Café de especialidad y bebidas refrescantes.",
        "https://images.unsplash.com/photo-1509042239860-f550ce710b93?q=80&w=800",
        listOf("Bebidas", "Postres"),
        listOf(
            Dish(
                25,
                "Cappuccino",
                "Espresso con leche vaporizada y espuma",
                "https://images.unsplash.com/photo-1572442388796-11668a67e53d?q=80&w=400"
            ),
            Dish(
                26,
                "Frappé de Caramelo",
                "Bebida fría mezclada con hielo y caramelo",
                "https://images.unsplash.com/photo-1637178035222-a08f2d4dd1a3?q=80&w=400"
            ),
            Dish(
                27,
                "Croissant",
                "Pan horneado estilo francés, suave y crujiente",
                "https://images.unsplash.com/photo-1555507036-ab1f4038808a?q=80&w=400"
            )
        )
    ),
    Restaurant(
        10,
        "La Parrilla del Abuelo",
        "Los mejores cortes de carne asada al carbón con el sabor tradicional del campo.",
        "https://images.unsplash.com/photo-1544025162-d76694265947?q=80&w=800",
        listOf("Parrillada", "Carnes"),
        listOf(
            Dish(
                28,
                "Corte de Entraña",
                "Jugoso corte de entraña a la parrilla acompañado de chimichurri",
                "https://images.unsplash.com/photo-1558030006-450675393462?q=80&w=400"
            ),
            Dish(
                29,
                "Choripán Gourmet",
                "Chorizo artesanal en pan de campo con salsa criolla",
                "https://images.unsplash.com/photo-1705512557389-841efbde54db?q=80&w=400"
            ),
            Dish(
                30,
                "Guarnición de Vegetales",
                "Pimientos, cebollas y calabacines asados al fuego",
                "https://images.unsplash.com/photo-1625944227313-4f7f68e6b3fa?q=80&w=400"
            )
        )
    )
)