package com.repositories

import com.entities.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<ProductEntity, Int> {
    fun findProductsBySellerId(sellerId: Int): List<ProductEntity>
}
