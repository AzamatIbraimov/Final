package com.services

import com.Exception.NotFound
import com.models.ShopOrder
import com.repositories.ShopOrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ShopOrderService {
    @Autowired
    private val shopOrderRepository: ShopOrderRepository? = null

//    val allShopOrder: List<ShopOrder>
//        get() {
//            val shopOrderList = ArrayList<ShopOrder>()
//            for (i in 0 until shopOrderRepository!!.findAll().size) {
//                shopOrderList.add(ShopOrder(shopOrderRepository!!.findAll().get(i)))
//            }
//            return shopOrderList
//        }

    fun getShopOrderById(orderId: Int): ShopOrder {
        return ShopOrder(shopOrderRepository!!.findById(orderId).orElseThrow { NotFound() })
    }

    fun saveShopOrder(shopOrder: ShopOrder): ShopOrder {
        val saveResult = shopOrderRepository!!.save(shopOrder.convertToEntity())
        return ShopOrder(saveResult)
    }

    fun deleteShopOrderById(orderId: Int) {
        shopOrderRepository!!.deleteById(orderId)
    }

    fun deleteAllShopOrder(shopOrder: ShopOrder) {
        shopOrderRepository!!.deleteAll()
    }
}
