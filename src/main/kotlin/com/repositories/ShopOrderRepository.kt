package com.repositories

import com.entities.ShopOrderEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ShopOrderRepository : JpaRepository<ShopOrderEntity, Int>