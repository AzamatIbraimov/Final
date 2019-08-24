package com.models

import com.entities.CartItemEntity

class CartItem {
    var productId: Int = 0
    var cartId: Int = 0
    var quantity: Int = 0

    constructor() {

    }

    constructor(productId: Int, cartId: Int, quantity: Int) {
        this.cartId = cartId
        this.productId = productId
        this.quantity = quantity
    }

    constructor(cartItemEntity: CartItemEntity) {
        this.quantity = cartItemEntity.quantity
        this.productId = cartItemEntity.productId
        this.cartId = cartItemEntity.productId
    }

    fun convertToEntity(): CartItemEntity {
        return CartItemEntity(cartId, productId, quantity)
    }
}