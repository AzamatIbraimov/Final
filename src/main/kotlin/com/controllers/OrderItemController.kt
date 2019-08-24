package com.controllers

import com.models.OrderItem
import com.services.OrderItemService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

import javax.websocket.server.PathParam

@RestController
@RequestMapping("/orderItem")
class OrderItemController {

    @Autowired
    private val orderItemService: OrderItemService? = null

    @RequestMapping("/")
    fun defaultOrderItem(): String {
        return "Default orderItem endpoint"
    }

    @RequestMapping(value = "/{id}", method = [RequestMethod.GET])
    fun getOrderItemById(@RequestParam("id") id: Int): OrderItem {
        return orderItemService!!.getOrderItemById(id)
    }



    @RequestMapping(path = ["/order"], method = [RequestMethod.GET])
    fun getOrderItemsByOrderId(@RequestParam("id") id: Int): List<OrderItem> {
        return orderItemService!!.getOrderItemsByOrderId(id)
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun createOrderItem(@RequestBody orderItem: OrderItem): OrderItem {
        return orderItemService!!.saveOrderItem(orderItem)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
    fun deleteOrderItemById(@PathParam("id") id: Int) {
        orderItemService!!.deleteOrderItemById(id)
    }
}
