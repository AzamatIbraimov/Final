package com.entities

import javax.persistence.*

@Entity
@Table(name = "cart")
data class CartEntity (

        /*
CREATE TABLE IF NOT EXISTS `cart` (
  `cart_id` INT NOT NULL AUTO_INCREMENT,
  `sub_total` FLOAT NOT NULL,
  `customer_id` INT NOT NULL,
  PRIMARY KEY (`cart_id`)
  );
         */

        @get:Id
        @get:GeneratedValue(strategy = GenerationType.AUTO)
        @get:Column(name = "cart_id")
        var cartId: Int = 0,
        @get:Basic
        @get:Column(name = "sub_total")
        var subTotal: Float = 0f,
        @get:Column(name = "customer_id")
        var customerId: Int = 0)
