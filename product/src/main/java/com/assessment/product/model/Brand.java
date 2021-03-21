package com.assessment.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "brand")
public class Brand {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long brandId;
	
	@Column(name = "brand_Name")
	private String brand_Name;
	
	@Column(name = "brand_Avail_Status")
	private String brand_Avail_Status;
	
	@Column(name = "quantity")
	private float quantity;

	
	public long getBrand_Id() {
		return brandId;
	}

	public void setBrand_Id(long brand_Id) {
		this.brandId = brand_Id;
	}

	public String getBrand_Name() {
		return brand_Name;
	}

	public void setBrand_Name(String brand_Name) {
		this.brand_Name = brand_Name;
	}

	public String getBrand_Avail_Status() {
		return brand_Avail_Status;
	}

	public void setBrand_Avail_Status(String brand_Avail_Status) {
		this.brand_Avail_Status = brand_Avail_Status;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand_Avail_Status == null) ? 0 : brand_Avail_Status.hashCode());
		result = prime * result + (int) (brandId ^ (brandId >>> 32));
		result = prime * result + ((brand_Name == null) ? 0 : brand_Name.hashCode());
		result = prime * result + Float.floatToIntBits(quantity);
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
		Brand other = (Brand) obj;
		if (brand_Avail_Status == null) {
			if (other.brand_Avail_Status != null)
				return false;
		} else if (!brand_Avail_Status.equals(other.brand_Avail_Status))
			return false;
		if (brandId != other.brandId)
			return false;
		if (brand_Name == null) {
			if (other.brand_Name != null)
				return false;
		} else if (!brand_Name.equals(other.brand_Name))
			return false;
		if (Float.floatToIntBits(quantity) != Float.floatToIntBits(other.quantity))
			return false;
		return true;
	}

}
