package com.entities

import javax.persistence.*

@Entity
@Table(name = "customer")
data class CustomerEntity (

    /*
    CREATE TABLE IF NOT EXISTS `customer` (
      `customer_id` INT NOT NULL AUTO_INCREMENT,
      `user_id` INT NOT NULL,
      `address_id` INT NOT NULL,
      `customer_name` VARCHAR(255) NOT NULL,
      `customer_email` VARCHAR(255) NOT NULL,
      `payment_info` VARCHAR(255),
      PRIMARY KEY (`customer_id`),
      FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
    );
     */

    @get:Id
    @get:GeneratedValue(strategy = GenerationType.AUTO)
    @get:Column(name = "customer_id")
    var customerId: Int = 0,
    @get:Column(name = "user_id")
    var userId: Int = 0,
    @get:Basic
    @get:Column(name = "address_id")
    var addressId: Int = 0,
    @get:Basic
    @get:Column(name = "customer_name")
    var customerName: String? = null,
    @get:Basic
    @get:Column(name = "customer_email")
    var customerEmail: String? = null,
    @get:Column(name = "payment_info")
    var paymentInfo: String? = null) // could be hex encoded, later?

//    constructor() {}
//
//    // without customerId
//    constructor(userId: Int, addressId: Int, customerName: String, customerEmail: String, paymentInfo: String) {
//        this.userId = userId
//        this.addressId = addressId
//        this.customerName = customerName
//        this.customerEmail = customerEmail
//        this.paymentInfo = paymentInfo
//    }
//
//    constructor(customerId: Int, userId: Int, addressId: Int, customerName: String, customerEmail: String, paymentInfo: String) {
//        this.customerId = customerId
//        this.userId = userId
//        this.addressId = addressId
//        this.customerName = customerName
//        this.customerEmail = customerEmail
//        this.paymentInfo = paymentInfo
//    }
//
//
//    override fun equals(o: Any?): Boolean {
//        if (this === o) return true
//        if (o == null || javaClass != o.javaClass) return false
//
//        val that = o as CustomerEntity?
//
//        if (customerId != that!!.customerId) return false
//        if (userId != that.userId) return false
//        if (addressId != that.addressId) return false
//        if (if (customerName != null) customerName != that.customerName else that.customerName != null) return false
//        if (if (customerEmail != null) customerEmail != that.customerEmail else that.customerEmail != null) return false
//        return if (if (paymentInfo != null) paymentInfo != that.paymentInfo else that.paymentInfo != null) false else true
//
//    }
//
//    override fun hashCode(): Int {
//        var result: Int
//        result = customerId
//        result = 31 * result + userId
//        result = 31 * result + addressId
//        result = 31 * result + if (customerName != null) customerName!!.hashCode() else 0
//        result = 31 * result + if (customerEmail != null) customerEmail!!.hashCode() else 0
//        result = 31 * result + if (paymentInfo != null) paymentInfo!!.hashCode() else 0
//
//        return result
//    }
//}
