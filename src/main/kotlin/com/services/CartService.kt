package com.services

import com.Exception.NotFound
import com.entities.CartEntity
import com.models.Cart
import com.repositories.CartRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CartService {

    @Autowired
    private val cartRepository: CartRepository? = null

    fun getCartById(cartId: Int): Cart {
        return Cart(cartRepository!!.findById(cartId).orElseThrow { NotFound() })

    }
    fun getCartByCustomerId(customerId: Int): Cart {
        return Cart(cartRepository!!.findCartByCustomerId(customerId))
    }

    fun saveCart(cart: Cart): Cart {
        val saveResult = cartRepository!!.save(cart.convertToEntity())
        return Cart(saveResult)
    }

    fun deleteCartById(cartId: Int) {
        cartRepository!!.deleteById(cartId)
    }
}
