package com.controllers

import com.entities.OrderEntity
import com.models.Order
import com.services.OrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import com.repositories.OrderRepository
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping



@RestController
@RequestMapping("/order")
class OrderController internal constructor(private val orderRepository: OrderRepository) {
    //private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private val orderService: OrderService? = null

    @RequestMapping("/")
    fun defaultOrder(): String {
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default order endpoint"
    }


    @RequestMapping(path = ["/customer"], method = [RequestMethod.GET])
    fun getOrderByCustomerId(@RequestParam("id") id: Int): List<Order> {
        return orderService!!.getOrderByCustomerId(id)
    }

    @RequestMapping(path = ["/shipping"], method = [RequestMethod.GET])
    fun getOrderByShippingId(@RequestParam("id") id: Int): List<Order> {
        return orderService!!.getOrderByShippingId(id)
    }


    @RequestMapping(method = [RequestMethod.GET])
    fun getOrder(@RequestParam("id") id: Int): Order {
        return orderService!!.getOrderById(id)
    }

    @RequestMapping(method = [RequestMethod.PUT])
    fun putOrder(@RequestBody order: Order) {
        orderService!!.saveOrder(order)
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun postOrder(@RequestBody order: Order): Order {
        return orderService!!.saveOrder(order)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
//    fun deleteOrder(@PathVariable id: Int) {
    fun deleteOrder(@RequestParam id: Int) {

        orderService!!.deleteOrderById(id)
    }

}
