package com.controllers

import com.models.Product
import com.repositories.ProductRepository
import com.services.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")
class ProductController internal constructor(private val productRepository: ProductRepository) {
    //private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private val productService: ProductService? = null

    @RequestMapping("/")
    fun defaultProduct(): String {
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default product endpoint"
    }

    @RequestMapping(method = [RequestMethod.GET])
    fun getProduct(@RequestParam("id") id: Int): Product {
        return productService!!.getProductById(id)
    }

    @RequestMapping(path = ["/seller"], method = [RequestMethod.GET])
    fun getProductsBySellerId(@RequestParam("id") id: Int): List<Product> {
        return productService!!.getProductsBySellerId(id)
    }

    @RequestMapping(method = [RequestMethod.PUT])
    fun putProduct(@RequestBody product: Product) {
        productService!!.saveProduct(product)
    }


    @RequestMapping(method = [RequestMethod.POST])
    fun postProduct(@RequestBody product: Product): Product {
        return productService!!.saveProduct(product)
    }

    @RequestMapping(method = [RequestMethod.DELETE])
//    fun deleteProduct(@PathVariable id: Int) {
    fun deleteProduct(@RequestParam id: Int) {

        productService!!.deleteProductById(id)
    }
}
