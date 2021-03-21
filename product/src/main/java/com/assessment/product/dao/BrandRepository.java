package com.assessment.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.product.model.Brand;
@Repository
public interface BrandRepository extends  JpaRepository<Brand,Long> {

	public Brand findByBrandId(long id);


}
