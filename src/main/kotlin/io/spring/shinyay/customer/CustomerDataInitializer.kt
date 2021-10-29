package io.spring.shinyay.customer

import io.spring.shinyay.customer.entity.Customer
import io.spring.shinyay.customer.repository.CustomerRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux

@Component
class CustomerDataInitializer(val repository: CustomerRepository) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val names = Flux.just("John", "Jack", "Mary", "Jane", "Jill", "Joe")
        val customers = names.map { name -> Customer(0, name) }
        customers.flatMap { customer -> repository.save(customer) }.subscribe { customer -> println(customer) }
    }
}