package com.entities

import javax.persistence.*

@Entity
@Table(name = "seller")
data class SellerEntity

/*
CREATE TABLE IF NOT EXISTS `seller` (
  `seller_id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `seller_name` VARCHAR(255) NOT NULL,
  `seller_email` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`seller_id`),
  FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
  );
 */
(
        @get:Id
        @get:GeneratedValue(strategy = GenerationType.AUTO)
        @get:Column(name = "seller_id")
        var sellerId: Int = 0,
        @get:Column(name = "user_id")
        var userId: Int = 0,
        @get:Basic
        @get:Column(name = "seller_name")
        var sellerName: String? = null,
        @get:Basic
        @get:Column(name = "seller_email")
        var sellerEmail: String? = null,
        @get:Basic
        @get:Column(name = "phone")
        var phone: String? = null
)



