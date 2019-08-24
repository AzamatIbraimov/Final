package com.models

import com.entities.ShopOrderEntity

import java.sql.Timestamp

class ShopOrder {
    var orderId: Int = 0
    var status: String? = null
    var dateCreated: Timestamp? = null
    var subTotal: Double = 0.toDouble()

    constructor() {}

    constructor(orderId: Int, status: String, dateCreated: Timestamp, subTotal: Double) {
        this.orderId = orderId
        this.status = status
        this.dateCreated = dateCreated
        this.subTotal = subTotal
    }

    constructor(shopOrderEntity: ShopOrderEntity) {
        this.orderId = shopOrderEntity.orderId
        this.status = shopOrderEntity.status
        this.dateCreated = shopOrderEntity.dateCreated
        this.subTotal = shopOrderEntity.subTotal
    }

    fun convertToEntity(): ShopOrderEntity {
        return ShopOrderEntity(orderId, status, dateCreated, subTotal)
    }
}
