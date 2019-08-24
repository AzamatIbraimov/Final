package com.models

import com.entities.ProductEntity
import java.sql.Timestamp
import java.time.Instant

import javax.persistence.*

class Product {

    var productId: Int = 0
    var productName: String? = null
    var dateModified: Instant? = null
    var description: String? = null
    var stock: Int = 0 // could be hex encoded, later?
    var unitCost: Float = 0f
    var sellerId : Int = 0

    constructor() {}

    constructor(productID: Int, productName: String, dateModified: Instant, description: String, stock: Int,unitCost:Float,sellerId: Int) {
        this.productId = productId
        this.productName = productName
        this.dateModified = dateModified
        this.description = description
        this.stock = stock
        this.unitCost = unitCost
        this.sellerId = sellerId



    }

    constructor(productEntity: ProductEntity) {
        this.productId = productEntity.productId
        this.productName = productEntity.productName
        this.dateModified = productEntity.dateModified?.toInstant()
        this.description = productEntity.description
        this.stock = productEntity.stock
        this.unitCost = productEntity.unitCost
        this.sellerId = productEntity.sellerId
    }

    fun convertToEntity(): ProductEntity {
        return ProductEntity(productId,productName, Timestamp.from(dateModified!!),description,stock,unitCost,sellerId)
    }

}
