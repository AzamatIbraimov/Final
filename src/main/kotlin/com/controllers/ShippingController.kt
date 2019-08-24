package com.controllers


import com.models.Shipping
import com.repositories.ShippingRepository
import com.services.ShippingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/shipping")
class ShippingController internal constructor(private val shippingRepository: ShippingRepository) {
    //private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private val shippingService: ShippingService? = null

    @RequestMapping("/")
    fun defaultShipping(): String {
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default shipping endpoint"
    }

    @RequestMapping(method = [RequestMethod.GET])
    fun getShipping(@RequestParam("id") id: Int): Shipping {
        return shippingService!!.getShippingById(id)
    }

    @RequestMapping(method = [RequestMethod.PUT])
    fun putShipping(@RequestBody shipping: Shipping) {
        shippingService!!.saveShipping(shipping)
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun postShipping(@RequestBody shipping: Shipping): Shipping {
        return shippingService!!.saveShipping(shipping)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
//    fun deleteShipping(@PathVariable id: Int) {
    fun deleteShipping(@RequestParam id: Int) {

        shippingService!!.deleteShippingById(id)
    }
}
