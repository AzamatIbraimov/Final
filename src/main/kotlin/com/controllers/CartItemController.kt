package com.controllers


import com.models.CartItem
import com.services.CartItemService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

import javax.websocket.server.PathParam

@RestController
@RequestMapping("/cartItem")
class CartItemController {

    @Autowired
    private val cartItemService: CartItemService? = null

    @RequestMapping("/")
    fun defaultCartItem(): String {
        return "Default cartItem endpoint"
    }

    @RequestMapping(value = "/{id}", method = [RequestMethod.GET])
    fun getCartItemById(@RequestParam("id") id: Int): CartItem {
        return cartItemService!!.getCartItemById(id)
    }

    @RequestMapping(path = ["/seller"], method = [RequestMethod.GET])
    fun getCartItemsByCartId(@RequestParam("id") id: Int): List<CartItem> {
        return cartItemService!!.getCartItemsByCartId(id)
    }


    @RequestMapping(method = [RequestMethod.PUT])
    fun updateCartItem(@RequestBody cartItem: CartItem) {
        cartItemService!!.saveCartItem(cartItem)
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun createCartItem(@RequestBody cartItem: CartItem): CartItem {
        return cartItemService!!.saveCartItem(cartItem)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
    fun deleteCartItemById(@PathParam("id") id: Int) {
        cartItemService!!.deleteCartItemById(id)
    }
}
