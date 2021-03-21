package com.assessment.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.product.dao.CustomerRepository;
import com.assessment.product.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer getCustomerById(long id) {
		Customer customer = customerRepository.findCustomerByCustomerId(id);
		return customer;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(long id) {
		Customer customer = customerRepository.findCustomerByCustomerId(id);
		customerRepository.delete(customer);
	}

}
