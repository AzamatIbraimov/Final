package com.controllers

import com.models.Cart
import com.repositories.CartRepository
import com.services.CartService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cart")
class CartController internal constructor(private val cartRepository: CartRepository) {
    //private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private val cartService: CartService? = null

    @RequestMapping("/")
    fun defaultCart(): String {
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default cart endpoint"
    }

    @RequestMapping(method = [RequestMethod.GET])
    fun getCart(@RequestParam("id") id: Int): Cart {
        return cartService!!.getCartById(id)
    }

    @RequestMapping(path = ["/customer"], method = [RequestMethod.GET])
    fun findCartByCustomerId(@RequestParam("id") id: Int): Cart {
        return cartService!!.getCartByCustomerId(id)
    }



    @RequestMapping(method = [RequestMethod.PUT])
    fun putCart(@RequestBody cart: Cart) {
        cartService!!.saveCart(cart)
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun postCart(@RequestBody cart: Cart): Cart {
        return cartService!!.saveCart(cart)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
//    fun deleteCart(@PathVariable id: Int) {
    fun deleteCart(@RequestParam id: Int) {

        cartService!!.deleteCartById(id)
    }
}
