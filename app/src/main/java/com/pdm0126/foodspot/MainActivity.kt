package com.pdm0126.foodspot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pdm0126.foodspot.navigation.MainNavigation
import com.pdm0126.foodspot.ui.theme.FoodSpotTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotTheme {
                MainNavigation()
            }
        }
    }
}