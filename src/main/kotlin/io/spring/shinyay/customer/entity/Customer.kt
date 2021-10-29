package io.spring.shinyay.customer.entity

import org.springframework.data.annotation.Id

// customer entity
data class Customer(
    @Id
    val id: String? = null,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String
)
