package com.services

import com.Exception.NotFound
import com.entities.ProductEntity
import com.models.Product
import com.repositories.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.ArrayList

@Service
class ProductService {

    @Autowired
    private val productRepository: ProductRepository? = null

    fun getProductById(productId: Int): Product {
        return Product(productRepository!!.findById(productId).orElseThrow { NotFound() })
    }

    fun getProductsBySellerId(sellerId: Int): List<Product> {
        val resEntities = productRepository!!.findProductsBySellerId(sellerId)
        val res = ArrayList<Product>()
        for (entity in resEntities) {
            res.add(Product(entity))
        }

        return res
    }

    fun saveProduct(product: Product): Product {
        val saveResult = productRepository!!.save(product.convertToEntity())
        return Product(saveResult)
    }

    fun deleteProductById(productId: Int) {
        productRepository!!.deleteById(productId)
    }
}
