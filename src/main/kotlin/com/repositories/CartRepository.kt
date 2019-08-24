package com.repositories

import com.entities.CartEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CartRepository : JpaRepository<CartEntity, Int> {
    fun findCartByCustomerId(customerId: Int): CartEntity
}