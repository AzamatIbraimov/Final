package com.repositories

import com.entities.SellerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SellerRepository : JpaRepository<SellerEntity, Int> {
    fun findSellerByUserId(userId: Int): SellerEntity
}
