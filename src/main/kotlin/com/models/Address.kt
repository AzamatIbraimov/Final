package com.models

import com.entities.AddressEntity

class Address {
    var addressId: Int = 0
    var street: String? = null
    var streetNo: String? = null
    var unitNo: String? = null
    var city: String? = null
    var country: String? = null
    var other: String? = null

    constructor() {}

    constructor(addressId: Int, street: String, streetNo: String, unitNo: String, city: String, country: String, other: String) {
        this.addressId = addressId
        this.street = street
        this.streetNo = streetNo
        this.unitNo = unitNo
        this.city = city
        this.country = country
        this.other = other
    }

    constructor(addressEntity: AddressEntity) {
        this.addressId = addressEntity.addressId
        this.street = addressEntity.street
        this.streetNo = addressEntity.streetNo
        this.unitNo = addressEntity.unitNo
        this.city = addressEntity.city
        this.country = addressEntity.country
        this.other = addressEntity.other
    }

    fun convertToEntity(): AddressEntity {
        return AddressEntity(addressId, street, streetNo, unitNo, city, country, other)
    }
}
