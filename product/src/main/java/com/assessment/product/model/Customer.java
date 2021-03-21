package com.assessment.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "customer")
public class Customer {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	@Column(name = "customer_Name")
    private String customer_Name;
	@Column(name = "zip_Coded")
	private long  zip_Coded;
	
	
	public Customer() {
		
	}
	public long getCustomer_Id() {
		return customerId;
	}
	public void setCustomer_Id(long customer_Id) {
		this.customerId = customer_Id;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public long getZip_Coded() {
		return zip_Coded;
	}
	public void setZip_Coded(long zip_Coded) {
		this.zip_Coded = zip_Coded;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (customerId ^ (customerId >>> 32));
		result = prime * result + ((customer_Name == null) ? 0 : customer_Name.hashCode());
		result = prime * result + (int) (zip_Coded ^ (zip_Coded >>> 32));
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
		Customer other = (Customer) obj;
		if (customerId != other.customerId)
			return false;
		if (customer_Name == null) {
			if (other.customer_Name != null)
				return false;
		} else if (!customer_Name.equals(other.customer_Name))
			return false;
		if (zip_Coded != other.zip_Coded)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customer_Name=" + customer_Name + ", zip_Coded=" + zip_Coded
				+ "]";
	}
	
	

}
