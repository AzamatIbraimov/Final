package com.repositories


import com.entities.CartItemEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CartItemRepository : JpaRepository<CartItemEntity, Int> {
    fun findCartItemsByCartId(cartId: Int): List<CartItemEntity>
}

