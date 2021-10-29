package io.spring.shinyay.customer.repository

import io.spring.shinyay.customer.entity.Customer
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface CustomerRepository : ReactiveCrudRepository<Customer, Long>