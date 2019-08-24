package com.entities


import javax.persistence.Column
import javax.persistence.Id
import java.io.Serializable

class CartItemEntityPK : Serializable {
    @get:Column(name = "product_id")
    @get:Id
    var productId: Int = 0
    @get:Column(name = "cart_id")
    @get:Id
    var cartId: Int = 0

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val that = o as CartItemEntityPK?

        if (productId != that!!.productId) return false
        return if (cartId != that.cartId) false else true

    }

    override fun hashCode(): Int {
        var result = productId
        result = 31 * result + cartId
        return result
    }
}
