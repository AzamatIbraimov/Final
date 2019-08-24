package com.entities

import com.entities.OrderItemEntityPK

import javax.*
import javax.persistence.*

@Entity
@Table(name = "order_item", schema = "shop")
@IdClass(OrderItemEntityPK::class)
data class OrderItemEntity (
    @get:Id
    @get:Column(name = "product_id")
    var productId: Int = 0,
    @get:Id
    @get:Column(name = "order_id")
    var orderId: Int = 0,
    @get:Basic
    @get:Column(name = "quantity", nullable = false)
    var quantity: Int = 0)

//    constructor() {}
//    constructor(orderId: Int, quantity: Int) {
//        this.orderId = orderId
//        this.quantity = quantity
//    }
//
//    constructor(productId: Int, orderId: Int, quantity: Int) {
//        this.productId = productId
//        this.orderId = orderId
//        this.quantity = quantity
//    }
//
//    override fun equals(o: Any?): Boolean {
//        if (this === o) return true
//        if (o == null || javaClass != o.javaClass) return false
//
//        val that = o as OrderItemEntity?
//
//        if (productId != that!!.productId) return false
//        if (orderId != that.orderId) return false
//        return if (quantity != that.quantity) false else true
//
//    }
//
//    override fun hashCode(): Int {
//        var result = productId
//        result = 31 * result + orderId
//        result = 31 * result + quantity
//        return result
//    }
//}
