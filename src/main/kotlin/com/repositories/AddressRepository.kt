package com.repositories

import com.entities.AddressEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository : JpaRepository<AddressEntity, Int>
