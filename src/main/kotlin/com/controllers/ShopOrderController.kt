package com.controllers


import com.models.ShopOrder
import com.services.ShopOrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

import javax.websocket.server.PathParam

@RestController
@RequestMapping("/shopOrder")
class ShopOrderController {

    @Autowired
    private val shopOrderService: ShopOrderService? = null


    @RequestMapping("/")
    fun defaultShopOrder(): String {
        return "Default shopOrder endpoint"
    }

    @RequestMapping(method = [RequestMethod.GET])
    fun getShopOrderById(@RequestParam("id") id: Int): ShopOrder {
        return shopOrderService!!.getShopOrderById(id)
    }


    @RequestMapping(method = [RequestMethod.PUT])
    fun updateShopOrder(@RequestBody shopOrder: ShopOrder) {
        shopOrderService!!.saveShopOrder(shopOrder)
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun createShopOrder(@RequestBody shopOrder: ShopOrder): ShopOrder {
        return shopOrderService!!.saveShopOrder(shopOrder)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
    fun deleteShopOrderById(@PathParam("id") id: Int) {
        shopOrderService!!.deleteShopOrderById(id)
    }

}

