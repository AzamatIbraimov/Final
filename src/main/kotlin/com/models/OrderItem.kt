package com.models

import com.entities.OrderItemEntity

class OrderItem {
    var productId: Int = 0
    var orderId: Int = 0
    var quantity: Int = 0

    constructor() {}

    constructor(productId: Int, orderId: Int, quantity: Int) {
        this.productId = productId
        this.orderId = orderId
        this.quantity = quantity
    }

    constructor(orderItemEntity: OrderItemEntity) {
        this.orderId = orderItemEntity.orderId
        this.productId = orderItemEntity.productId
        this.quantity = orderItemEntity.quantity
    }

    fun convertToEntity(): OrderItemEntity {
        return OrderItemEntity(orderId, productId, quantity)
    }
}