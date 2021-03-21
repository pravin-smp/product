package com.assessment.product.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.product.model.Customer;
import com.assessment.product.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping
	public ResponseEntity<Customer> getCustomerByid(@RequestParam long id) {
		Customer customer = customerService.getCustomerById(id);
		return ResponseEntity.ok(customer);
	}
	 
	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@PostMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
}
