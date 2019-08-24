package com.entities

import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "shipping")
data class ShippingEntity

/*
CREATE TABLE IF NOT EXISTS `shop`.`shipping` (
  `shipping_id` INT NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(255) NOT NULL, -- delivery or pickup at pickup points
  `shipping_cost` FLOAT NOT NULL,
  PRIMARY KEY (`shipping_id`)
  );

);
);
 */
(
        @get:Id
        @get:GeneratedValue(strategy = GenerationType.AUTO)
        @get:Column(name = "shipping_id")
        var shippingID: Int = 0,
        @get:Basic
        @get:Column(name = "type")
        var type: String? = null,
        @get:Basic
        @get:Column(name = "shipping_cost")
        var shippingCost: Float = 0f)
