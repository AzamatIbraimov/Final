package com.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.*
import java.sql.Timestamp

@Entity
@Table(name = "shop_order")
data class OrderEntity (
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.AUTO)
    @get:Column(name = "order_id")
    var orderId: Int = 0,
    @get:Basic
    @get:Column(name = "status")
    var status: String? = null,
    @get:Basic
    @get:Column(name = "date_created")
    var dateCreated: Timestamp? = null,
    @get:Basic
    @get:Column(name = "sub_total")
    var subtotal: Double = 0.toDouble(),
    @get:Column(name = "customer_id")
    var customerId: Int = 0,
    @get:Column(name = "shipping_id")
    var shippingId: Int = 0)

//    constructor() {
//
//    }
//
//    // without orderId
//    constructor(status: String, dateCreated: Timestamp, subtotal: Double, customerId: Int, shippingId: Int) {
//        this.status = status
//        this.dateCreated = dateCreated
//        this.subtotal = subtotal
//        this.customerId = customerId
//        this.shippingId = shippingId
//    }
//
//    constructor(orderId: Int, status: String, dateCreated: Timestamp, subtotal: Double, customerId: Int, shippingId: Int) {
//        this.orderId = orderId
//        this.status = status
//        this.dateCreated = dateCreated
//        this.subtotal = subtotal
//        this.customerId = customerId
//        this.shippingId = shippingId
//    }
//
//
//    override fun equals(o: Any?): Boolean {
//        if (this === o) return true
//        if (o == null || javaClass != o.javaClass) return false
//
//        val that = o as OrderEntity?
//
//        if (orderId != that!!.orderId) return false
//        if (if (status != null) status != that.status else that.status != null) return false
//        if (if (dateCreated != null) !dateCreated!!.equals(that.dateCreated) else that.dateCreated != null) return false
//        if (java.lang.Double.compare(that.subtotal, subtotal) != 0) return false
//        if (customerId != that.customerId) return false
//        return if (shippingId != that.shippingId) false else true
//
//    }
//
//    override fun hashCode(): Int {
//        var result: Int
//        val temp: Long
//        result = orderId
//        result = 31 * result + if (status != null) status!!.hashCode() else 0
//        result = 31 * result + if (dateCreated != null) dateCreated!!.hashCode() else 0
//        temp = java.lang.Double.doubleToLongBits(subtotal)
//        result = 31 * result + (temp xor temp.ushr(32)).toInt()
//        result = 31 * result + customerId
//        result = 31 * result + shippingId
//
//        return result
//    }
//}
