package com.assessment.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.product.model.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{

	public Order findById(long id);
}
