package com.repositories

import com.entities.OrderEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository : JpaRepository<OrderEntity, Int> {
    fun findOrdersByCustomerId(customerId: Int): List<OrderEntity>
    fun findOrdersByShippingId(shippingId: Int): List<OrderEntity>
}
