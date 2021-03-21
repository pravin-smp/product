package com.assessment.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.product.model.Customer;
@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long>{

	public Customer findCustomerByCustomerId(long id);

}
