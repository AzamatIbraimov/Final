package com.entities

import javax.persistence.*

@Entity
@Table(name = "cart_item", schema = "shop")
@IdClass(CartItemEntityPK::class)
data class CartItemEntity (
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "product_id")
    var productId: Int = 0,
    @get:Id
    @get:Column(name = "cart_id")
    var cartId: Int = 0,
    @get:Basic
    @get:Column(name = "quantity", nullable = false)
    var quantity: Int = 0)
//
//    constructor() {}
//
//    constructor(cartId: Int, quantity: Int) {
//        this.cartId = cartId
//        this.quantity = quantity
//    }
//
//    constructor(productId: Int, cartId: Int, quantity: Int) {
//        this.cartId = cartId
//        this.productId = productId
//        this.quantity = quantity
//    }
//
//    override fun equals(o: Any?): Boolean {
//        if (this === o) return true
//        if (o == null || javaClass != o.javaClass) return false
//
//        val that = o as CartItemEntity?
//
//        if (productId != that!!.productId) return false
//        if (cartId != that.cartId) return false
//        return if (quantity != that.quantity) false else true
//
//    }
//
//    override fun hashCode(): Int {
//        var result = productId
//        result = 31 * result + cartId
//        result = 31 * result + quantity
//        return result
//    }
//}