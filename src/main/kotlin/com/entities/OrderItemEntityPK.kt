package com.entities

import javax.persistence.*
import java.io.Serializable

@Embeddable
data class OrderItemEntityPK(
        /* RELATED TO:
    CREATE TABLE IF NOT EXISTS `order_item` (
      `product_id` INT NOT NULL,
      `order_id` INT NOT NULL,
      `quantity` INT NOT NULL,
      PRIMARY KEY (`product_id`,`order_id`),
      FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
      FOREIGN KEY (`order_id`) REFERENCES `order` (`order_id`)
      );
     */

        var productId: Int, var orderId: Int) : Serializable {


    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val that = o as OrderItemEntityPK?

        if (orderId != that!!.orderId) return false
        return if (productId != that.productId) false else true

    }

    override fun hashCode(): Int {
        var result: Int
        result = orderId
        result = 31 * result + productId

        return result
    }
}
