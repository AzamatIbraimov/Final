package com.models

import com.entities.OrderEntity

import java.sql.Timestamp
import java.time.Instant

class Order {
    var orderId: Int = 0
    var status: String? = null
    var dateCreated: Instant? = null
    var subtotal: Double = 0.toDouble()
    var customerId: Int = 0
    var shippingId: Int = 0

    constructor(orderId: Int, status: String, dateCreated: Instant, subtotal: Double, customerId: Int, shippingId: Int) {
        this.orderId = orderId
        this.status = status
        this.dateCreated = dateCreated
        this.subtotal = subtotal
        this.customerId = customerId
        this.shippingId = shippingId
    }

    constructor(orderEntity: OrderEntity) {
        this.orderId = orderEntity.orderId
        this.status = orderEntity.status
        this.dateCreated = orderEntity.dateCreated?.toInstant()
        this.subtotal = orderEntity.subtotal
        this.customerId = orderEntity.customerId
        this.shippingId = orderEntity.shippingId
    }

    fun convertToEntity(): OrderEntity {
        return OrderEntity(orderId, status, Timestamp.from(dateCreated!!), subtotal, customerId, shippingId)
    }

}
//{
//    "orderId":1,
//    "status": "new",
//    "subtotal":12.2,
//    "customerId":10,
//    "shippingId":12345
//
//}