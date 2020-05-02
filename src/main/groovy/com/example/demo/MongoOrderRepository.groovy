package com.example.demo

import org.springframework.data.mongodb.repository.MongoRepository

interface MongoOrderRepository extends MongoRepository<CustomerOrder, String> {
    Optional<CustomerOrder> findById(String customerId)
}