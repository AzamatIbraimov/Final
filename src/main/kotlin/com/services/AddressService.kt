package com.services

import com.Exception.NotFound
import com.entities.AddressEntity
import com.models.Address
import com.repositories.AddressRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AddressService {

    @Autowired
    private val addressRepository: AddressRepository? = null

    fun getAddressById(addressId: Int): Address {
        return Address(addressRepository!!.findById(addressId).orElseThrow { NotFound() })
    }

    fun saveAddress(address: Address): Address {
        val saveResult = addressRepository!!.save(address.convertToEntity())
        return Address(saveResult)
    }

    fun deleteAddressById(addressId: Int) {
        addressRepository!!.deleteById(addressId)
    }
}
