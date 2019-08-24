package com.services

import com.Exception.NotFound
import com.entities.OrderItemEntity
import com.models.OrderItem
import com.repositories.OrderItemRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.ArrayList


@Service
class OrderItemService {
    @Autowired
    private val orderItemRepository: OrderItemRepository? = null

    fun getOrderItemById(orderId: Int): OrderItem {
        return OrderItem(orderItemRepository!!.findById(orderId).orElseThrow { NotFound() })
    }


    fun saveOrderItem(orderItem: OrderItem): OrderItem {
        val saveResult = orderItemRepository!!.save(orderItem.convertToEntity())
        return OrderItem(saveResult)
    }


    fun getOrderItemsByOrderId(orderId: Int): List<OrderItem> {
        val resEntities = orderItemRepository!!.findOrderItemsByOrderId(orderId)
        val res = ArrayList<OrderItem>()
        for (entity in resEntities) {
            res.add(OrderItem(entity))
        }

        return res
    }


    fun deleteOrderItemById(orderId: Int) {
        orderItemRepository!!.deleteById(orderId)
    }
}
