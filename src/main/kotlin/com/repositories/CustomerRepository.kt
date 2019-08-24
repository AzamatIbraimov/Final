package com.repositories

import com.entities.CustomerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : JpaRepository<CustomerEntity, Int> {
    fun findCustomerByUserId(userId: Int): CustomerEntity
}
