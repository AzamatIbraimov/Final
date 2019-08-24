package com.entities


import javax.persistence.*
import java.sql.Timestamp

@Entity
@Table(name = "shop_order", schema = "shop")
data class ShopOrderEntity (
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.IDENTITY)
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
    var subTotal: Double = 0.toDouble())

//    constructor() {}
//
//    constructor(orderId: Int, status: String, dateCreated: Timestamp, subTotal: Double) {
//        this.orderId = orderId
//        this.status = status
//        this.dateCreated = dateCreated
//        this.subTotal = subTotal
//    }
//
//    constructor(status: String, dateCreated: Timestamp, subTotal: Double) {
//        this.status = status
//        this.dateCreated = dateCreated
//        this.subTotal = subTotal
//    }
//
//    override fun equals(o: Any?): Boolean {
//        if (this === o) return true
//        if (o == null || javaClass != o.javaClass) return false
//
//        val that = o as ShopOrderEntity?
//
//        if (orderId != that!!.orderId) return false
//        if (java.lang.Double.compare(that.subTotal, subTotal) != 0) return false
//        if (if (status != null) status != that.status else that.status != null) return false
//        return if (if (dateCreated != null) !dateCreated!!.equals(that.dateCreated) else that.dateCreated != null) false else true
//
//    }
//
//    override fun hashCode(): Int {
//        var result: Int
//        val temp: Long
//        result = orderId
//        result = 31 * result + if (status != null) status!!.hashCode() else 0
//        result = 31 * result + if (dateCreated != null) dateCreated!!.hashCode() else 0
//        temp = java.lang.Double.doubleToLongBits(subTotal)
//        result = 31 * result + (temp xor temp.ushr(32)).toInt()
//        return result
//    }
//}
