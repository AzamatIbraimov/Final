package com.services

import com.Exception.NotFound
import com.entities.CartItemEntity
import com.models.CartItem
import com.repositories.CartItemRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import java.util.ArrayList

@Service
class CartItemService {
    @Autowired
    private val cartItemRepository: CartItemRepository? = null

    fun getCartItemById(productId: Int): CartItem {
        return CartItem(cartItemRepository!!.findById(productId).orElseThrow { NotFound() })
    }

    fun getCartItemsByCartId(cartId: Int): List<CartItem> {
        val resEntities = cartItemRepository!!.findCartItemsByCartId(cartId)
        val res = ArrayList<CartItem>()
        for (entity in resEntities) {
            res.add(CartItem(entity))
        }
        return res
    }


    fun saveCartItem(cartItem: CartItem): CartItem {
        val saveResult = cartItemRepository!!.save(cartItem.convertToEntity())
        return CartItem(saveResult)
    }

    fun deleteCartItemById(productId: Int) {
        cartItemRepository!!.deleteById(productId)
    }
}