package com.repositories


import com.entities.OrderItemEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderItemRepository : JpaRepository<OrderItemEntity, Int> {
    fun findOrderItemsByOrderId(orderId: Int): List<OrderItemEntity>
}

