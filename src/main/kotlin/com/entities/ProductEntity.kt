package com.entities

import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "product")
data class ProductEntity

/*
CREATE TABLE IF NOT EXISTS `product` (
  `product_id` INT NOT NULL,
  `product_name` VARCHAR(255) NOT NULL,
  `date_modified` TIMESTAMP NOT NULL,
  `description` TEXT NOT NULL,
  `stock` INT NOT NULL,
  `unit_cost` FLOAT NOT NULL,
  `seller_id` INT NOT NULL,
  PRIMARY KEY (`product_id`),
  FOREIGN KEY (`seller_id`) REFERENCES `seller` (`seller_id`)
  );
 */
(
        @get:Id
        @get:GeneratedValue(strategy = GenerationType.AUTO)
        @get:Column(name = "product_id")
        var productId: Int = 0,
        @get:Basic
        @get:Column(name = "product_name")
        var productName: String? = null,
        @get:Basic
        @get:Column(name = "date_modified")
        var dateModified: Timestamp? = null,
        @get:Basic
        @get:Column(name = "description")
        var description: String? = null,
        @get:Basic
        @get:Column(name = "stock")
        var stock: Int = 0,
        @get:Basic
        @get:Column(name = "unit_cost")
        var unitCost: Float = 0f,
        @get:Column(name = "seller_id")
        var sellerId: Int = 0)




