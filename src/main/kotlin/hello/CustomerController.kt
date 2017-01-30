package hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(val repository:CustomerRepository) {

	@GetMapping("/")
	fun findAll() = repository.findAll()

	@GetMapping("/first/{firstName}")
	fun findByFirstName(@PathVariable firstName: String)
		= repository.findByFirstName(firstName)

	@GetMapping("/{lastName}")
	fun findByLastName(@PathVariable lastName:String)
			= repository.findByLastName(lastName)
}