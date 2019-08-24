package com.models

import com.entities.SellerEntity

import javax.persistence.*

class Seller {

    var sellerId: Int = 0
    var userId: Int = 0
    var sellerName: String? = null
    var sellerEmail: String? = null
    var phone: String? = null // could be hex encoded, later?

    constructor() {}

    constructor(sellerId: Int, userId: Int, sellerName: String, sellerEmail: String, phone: String) {
        this.sellerId = sellerId
        this.userId = userId
        this.sellerName = sellerName
        this.sellerEmail = sellerEmail
        this.phone = phone
    }

    constructor(sellerEntity: SellerEntity) {
        this.sellerId = sellerEntity.sellerId
        this.userId = sellerEntity.userId
        this.sellerName = sellerEntity.sellerName
        this.sellerEmail = sellerEntity.sellerEmail
        this.phone = sellerEntity.phone
    }

    fun convertToEntity(): SellerEntity {
        return SellerEntity(sellerId, userId, sellerName, sellerEmail, phone)
    }

}
