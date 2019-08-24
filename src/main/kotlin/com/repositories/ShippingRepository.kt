package com.repositories

import com.entities.ShippingEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ShippingRepository : JpaRepository<ShippingEntity, Int>
