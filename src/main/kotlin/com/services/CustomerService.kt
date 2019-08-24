package com.services

import com.Exception.NotFound
import com.entities.CustomerEntity
import com.models.Customer
import com.repositories.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService {

    @Autowired
    private val customerRepository: CustomerRepository? = null

    fun getCustomerById(customerId: Int): Customer {
        return Customer(customerRepository!!.findById(customerId).orElseThrow { NotFound() })
    }

    fun getCustomerByUserId(userId: Int): Customer {
        return Customer(customerRepository!!.findCustomerByUserId(userId))
    }

    fun saveCustomer(customer: Customer): Customer {
        val saveResult = customerRepository!!.save(customer.convertToEntity())
        return Customer(saveResult)
    }

    fun deleteCustomerById(customerId: Int) {
        customerRepository!!.deleteById(customerId)
    }
}
