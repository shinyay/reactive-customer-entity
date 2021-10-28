package io.spring.shinyay.customer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CustomerReactiveApplication

fun main(args: Array<String>) {
	runApplication<CustomerReactiveApplication>(*args)
}
