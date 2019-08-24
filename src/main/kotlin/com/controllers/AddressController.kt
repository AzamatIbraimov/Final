package com.controllers

import com.models.Address
import com.repositories.AddressRepository
import com.services.AddressService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping



@RestController
@RequestMapping("/address")
class AddressController internal constructor(private val addressRepository: AddressRepository) {
    //private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private val addressService: AddressService? = null

    @RequestMapping("/")
    fun defaultAddress(): String {
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default address endpoint"
    }

    @RequestMapping(method = [RequestMethod.GET])
    @Throws(Exception::class)
    fun getAddress(@RequestParam("id") id: Int): Address? {
        if (addressService != null) {
            return addressService.getAddressById(id)
        }
        return null
    }


    @RequestMapping(method = [RequestMethod.PUT])
    fun putAddress(@RequestBody address: Address) {
        addressService!!.saveAddress(address)
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun postAddress(@RequestBody address: Address): Address {
        return addressService!!.saveAddress(address)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
//    fun getAddress(@RequestParam("id") id: Int): Address {

        fun deleteAddress(@RequestParam id: Int) {
        addressService!!.deleteAddressById(id)
    }
}
