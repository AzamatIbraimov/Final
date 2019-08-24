package com.entities

import javax.persistence.*

@Entity
@Table(name = "address")
data class AddressEntity

    /*
    CREATE TABLE IF NOT EXISTS `address` (
      `address_id` INT NOT NULL AUTO_INCREMENT,
      `street` VARCHAR(255),
      `street_no` VARCHAR(255),
      `unit_no` VARCHAR(255),
      `city` VARCHAR(255),
      `country` VARCHAR(255),
      `other` VARCHAR(255),
      PRIMARY KEY (`address_id`)
    );
     */
(
    @get:Id
    @get:GeneratedValue(strategy = GenerationType.AUTO)
    @get:Column(name = "address_id")
    var addressId: Int = 0,
    @get:Basic
    @get:Column(name = "street")
    var street: String? = null,
    @get:Basic
    @get:Column(name = "street_no")
    var streetNo: String? = null,
    @get:Basic
    @get:Column(name = "unit_no")
    var unitNo: String? = null,
    @get:Basic
    @get:Column(name = "city")
    var city: String? = null,
    @get:Basic
    @get:Column(name = "country")
    var country: String? = null,
    @get:Basic
    @get:Column(name = "other")
    var other: String? = null
)
//    constructor() {}
//
//    // without addressId
//    constructor(street: String, streetNo: String, unitNo: String, city: String, country: String, other: String) {
//        this.street = street
//        this.streetNo = streetNo
//        this.unitNo = unitNo
//        this.city = city
//        this.country = country
//        this.other = other
//    }
//
//    constructor(addressId: Int, street: String, streetNo: String, unitNo: String, city: String, country: String, other: String) {
//        this.addressId = addressId
//        this.street = street
//        this.streetNo = streetNo
//        this.unitNo = unitNo
//        this.city = city
//        this.country = country
//        this.other = other
//    }
//
//
//    override fun equals(o: Any?): Boolean {
//        if (this === o) return true
//        if (o == null || javaClass != o.javaClass) return false
//
//        val that = o as AddressEntity?
//
//        if (addressId != that!!.addressId) return false
//        if (if (street != null) street != that.street else that.street != null) return false
//        if (if (streetNo != null) streetNo != that.streetNo else that.streetNo != null) return false
//        if (if (unitNo != null) unitNo != that.unitNo else that.unitNo != null) return false
//        if (if (city != null) city != that.city else that.city != null) return false
//        if (if (country != null) country != that.country else that.country != null) return false
//        return if (if (other != null) other != that.other else that.other != null) false else true
//
//    }
//
//    override fun hashCode(): Int {
//        var result: Int
//        result = addressId
//        result = 31 * result + if (street != null) street!!.hashCode() else 0
//        result = 31 * result + if (streetNo != null) streetNo!!.hashCode() else 0
//        result = 31 * result + if (unitNo != null) unitNo!!.hashCode() else 0
//        result = 31 * result + if (city != null) city!!.hashCode() else 0
//        result = 31 * result + if (country != null) country!!.hashCode() else 0
//        result = 31 * result + if (other != null) other!!.hashCode() else 0
//
//        return result
//    }
//}
