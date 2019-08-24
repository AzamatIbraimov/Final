package com.services

import com.Exception.NotFound
import com.entities.OrderEntity
import com.models.Order
import com.repositories.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import java.util.ArrayList


@Service
class OrderService {

    @Autowired
    private val orderRepository: OrderRepository? = null

    fun getOrderById(orderId: Int): Order {
        return Order(orderRepository!!.findById(orderId).orElseThrow { NotFound() })
    }


    fun getOrderByCustomerId(customerId: Int): List<Order> {
        val resEntities = orderRepository!!.findOrdersByCustomerId(customerId)
        val res = ArrayList<Order>()
        for (entity in resEntities) {
            res.add(Order(entity))
        }

        return res
    }

    fun getOrderByShippingId(shippingId: Int): List<Order> {
        val resEntities = orderRepository!!.findOrdersByShippingId(shippingId)
        val res = ArrayList<Order>()
        for (entity in resEntities) {
            res.add(Order(entity))
        }

        return res
    }
    /*public List<Order> getOrderByCustomerId(int customerId) {
        List<OrderEntity> orderEntityList = orderRepository.findOrderByCustomerId(customerId);
        List<Order> orderList = new ArrayList<>();
        for (OrderEntity orderEntity:orderEntityList) {
            orderList.add(new Order(orderEntity));
        }

        return orderList;
    }*/

    fun saveOrder(order: Order): Order {
        val saveResult = orderRepository!!.save(order.convertToEntity())
        return Order(saveResult)
    }

    fun deleteOrderById(orderId: Int) {
        orderRepository!!.deleteById(orderId)
    }
}
