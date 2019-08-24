package com.models

import com.entities.ShippingEntity


class Shipping {
    var shippingId: Int = 0
    var type: String? = null
    var shippingCost: Float = 0f

    constructor() {}

    constructor(shippingId: Int, type: String, shippingCost: Float) {
        this.shippingId = shippingId
        this.type = type
        this.shippingCost = shippingCost
    }

    constructor(shippingEntity: ShippingEntity) {
        this.shippingId = shippingEntity.shippingID
        this.type = shippingEntity.type
        this.shippingCost = shippingEntity.shippingCost
    }

    fun convertToEntity(): ShippingEntity {
        return ShippingEntity(shippingId, type, shippingCost)
    }
}
