package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController {

    @Autowired
    MongoOrderRepository orderRepository

    @GetMapping("/{order}")
    def listOrders(@PathVariable("order") String order) {
        Optional<CustomerOrder> orders = orderRepository.findById(order)
        return orders
    }
}