package com.assessment.product.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.product.model.Product;

public interface ProductRepository extends  JpaRepository<Product, Long>{

	public Optional<Product> findById(Long id);
}

