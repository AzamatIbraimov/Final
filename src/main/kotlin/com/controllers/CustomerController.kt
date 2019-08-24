package com.controllers

import com.models.Customer
import com.repositories.CustomerRepository
import com.services.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customer")
class CustomerController internal constructor(private val customerRepository: CustomerRepository) {
    //private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private val customerService: CustomerService? = null

    @RequestMapping("/")
    fun defaultCustomer(): String {
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default customer endpoint"
    }

    @RequestMapping(method = [RequestMethod.GET])
    fun getCustomer(@RequestParam("id") id: Int): Customer {
        return customerService!!.getCustomerById(id)
    }

    @RequestMapping(path = ["/user"], method = [RequestMethod.GET])
    fun findCustomerByUserId(@RequestParam("id") id: Int): Customer {
        return customerService!!.getCustomerByUserId(id)
    }

    @RequestMapping(method = [RequestMethod.PUT])
    fun putCustomer(@RequestBody customer: Customer) {
        customerService!!.saveCustomer(customer)
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun postCustomer(@RequestBody customer: Customer): Customer {
        return customerService!!.saveCustomer(customer)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
//    fun deleteCustomer(@PathVariable id: Int) {
    fun deleteCustomer(@RequestParam id: Int) {

        customerService!!.deleteCustomerById(id)
    }
}
    
