package com.services

import com.Exception.NotFound
import com.entities.SellerEntity
import com.models.Seller
import com.repositories.SellerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SellerService {

    @Autowired
    private val sellerRepository: SellerRepository? = null

    fun getSellerById(sellerId: Int): Seller {
        return Seller(sellerRepository!!.findById(sellerId).orElseThrow { NotFound() })
    }

    fun getSellerByUserId(userId: Int): Seller {
        return Seller(sellerRepository!!.findSellerByUserId(userId))
    }

    fun saveSeller(seller: Seller): Seller {
        val saveResult = sellerRepository!!.save(seller.convertToEntity())
        return Seller(saveResult)
    }

    fun deleteSellerById(sellerId: Int) {
        sellerRepository!!.deleteById(sellerId)
    }
}
