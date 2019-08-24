package com.controllers

import com.models.Seller
import com.repositories.SellerRepository
import com.services.SellerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/seller")
class SellerController internal constructor(private val sellerRepository: SellerRepository) {
    //private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private val sellerService: SellerService? = null

    @RequestMapping("/")
    fun defaultSeller(): String {
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default seller endpoint"
    }

    @RequestMapping(method = [RequestMethod.GET])
    fun getSeller(@RequestParam("id") id: Int): Seller {
        return sellerService!!.getSellerById(id)
    }

    @RequestMapping(path = ["/user"], method = [RequestMethod.GET])
    fun findSellerByUserId(@RequestParam("id") id: Int): Seller {
        return sellerService!!.getSellerByUserId(id)
    }


    @RequestMapping(method = [RequestMethod.PUT])
    fun putSeller(@RequestBody seller: Seller) {
        sellerService!!.saveSeller(seller)
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun postSeller(@RequestBody seller: Seller): Seller {
        return sellerService!!.saveSeller(seller)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
//    fun deleteSeller(@PathVariable id: Int) {
    fun deleteContoller(@RequestParam id: Int) {

        sellerService!!.deleteSellerById(id)
    }
}
