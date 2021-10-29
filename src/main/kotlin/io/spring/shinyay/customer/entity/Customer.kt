package io.spring.shinyay.customer.entity

import org.springframework.data.annotation.Id

// customer entity
data class Customer(
    @Id
    val id: Long,
    val firstName: String
)
