package com.assessment.product.service;

import org.springframework.stereotype.Service;

import com.assessment.product.model.Customer;

@Service
public interface CustomerService {
	
	public Customer getCustomerById(long id);
	
	public Customer saveCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	
	public void deleteCustomer(long id);
}
