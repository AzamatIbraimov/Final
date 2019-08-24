package com.models

import com.entities.CartEntity

import javax.persistence.*

class Cart {

    var cartId: Int = 0
    var subTotal: Float = 0f
    var customerId: Int = 0


    constructor() {}

    constructor(cartId: Int, subTotal: Float, customerId: Int) {
        this.cartId = cartId
        this.subTotal = subTotal
        this.customerId = customerId
    }

    constructor(cartEntity: CartEntity) {
        this.cartId = cartEntity.cartId
        this.subTotal = cartEntity.subTotal
        this.customerId = cartEntity.customerId
    }

    fun convertToEntity(): CartEntity {
        return CartEntity(cartId,subTotal,customerId)
    }

}
