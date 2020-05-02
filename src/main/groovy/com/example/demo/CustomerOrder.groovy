package com.example.demo

import org.springframework.data.annotation.Id

class CustomerOrder {
    @Id
    String id
    Date orderDate
}