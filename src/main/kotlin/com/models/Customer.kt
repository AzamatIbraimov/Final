package com.models

import com.entities.CustomerEntity

import javax.persistence.*

class Customer {

    var customerId: Int = 0
    var userId: Int = 0
    var addressId: Int = 0
    var customerName: String? = null
    var customerEmail: String? = null
    var paymentInfo: String? = null // could be hex encoded, later?

    constructor() {}

    constructor(customerId: Int, userId: Int, addressId: Int, customerName: String, customerEmail: String, paymentInfo: String) {
        this.customerId = customerId
        this.userId = userId
        this.addressId = addressId
        this.customerName = customerName
        this.customerEmail = customerEmail
        this.paymentInfo = paymentInfo
    }

    constructor(customerEntity: CustomerEntity) {
        this.customerId = customerEntity.customerId
        this.userId = customerEntity.userId
        this.addressId = customerEntity.addressId
        this.customerName = customerEntity.customerName
        this.customerEmail = customerEntity.customerEmail
        this.paymentInfo = customerEntity.paymentInfo
    }

    fun convertToEntity(): CustomerEntity {
        return CustomerEntity(customerId, userId, addressId, customerName, customerEmail, paymentInfo)
    }

}
