package com.assessment.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "product")
public class Product {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "product_Name")
	private String product_Name;
	
	@Column(name = "price")
	private float price;
	
	
	@Column(name = "brand_id")
	private int brand_id;
	
	public Product() {

	}

	public Long getProduct_Id() {
		return Id;
	}

	

	public void setProduct_Id(Long product_Id) {
		this.Id = product_Id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + brand_id;
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((product_Name == null) ? 0 : product_Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (brand_id != other.brand_id)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (product_Name == null) {
			if (other.product_Name != null)
				return false;
		} else if (!product_Name.equals(other.product_Name))
			return false;
		return true;
	}
	
	
	
}
