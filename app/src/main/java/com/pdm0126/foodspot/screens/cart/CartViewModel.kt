package com.pdm0126.foodspot.screens.cart

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.pdm0126.foodspot.model.CartItem
import com.pdm0126.foodspot.repository.CartRepository
import kotlinx.coroutines.flow.StateFlow

class CartViewModel : ViewModel() {
    val cartItems: StateFlow<List<CartItem>> = CartRepository.cartItems

    fun removeItem(dishId: Int) {
        CartRepository.removeDish(dishId)
    }

    fun checkout(context: Context) {
        Toast.makeText(context,
            "Compra procesada con éxito",
            Toast.LENGTH_LONG
        ).show()
        CartRepository.clearCart()
    }

    fun getTotal(): String {
        var total = 0.0
        cartItems.value.forEach { item ->
            total += item.dish.price * item.quantity
        }
        return "$${"%.2f".format(total)}"
    }
}