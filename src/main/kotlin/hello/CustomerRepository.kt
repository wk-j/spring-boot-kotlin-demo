package hello

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {
	fun findByLastName(lastName: String): Iterable<Customer>
	fun findByFirstName(firstName: String): Iterable<Customer>
}
