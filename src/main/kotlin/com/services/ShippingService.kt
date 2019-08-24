package com.services

import com.Exception.NotFound
import com.entities.ShippingEntity
import com.models.Shipping
import com.repositories.ShippingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ShippingService {

    @Autowired
    private val shippingRepository: ShippingRepository? = null

    fun getShippingById(shippingId: Int): Shipping {
        return Shipping(shippingRepository!!.findById(shippingId).orElseThrow { NotFound() })
    }

    fun saveShipping(shipping: Shipping): Shipping {
        val saveResult = shippingRepository!!.save(shipping.convertToEntity())
        return Shipping(saveResult)
    }

    fun deleteShippingById(shippingId: Int) {
        shippingRepository!!.deleteById(shippingId)
    }
}
