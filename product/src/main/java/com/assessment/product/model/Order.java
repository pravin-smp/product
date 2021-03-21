package com.assessment.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "`order`")
public class Order {
	
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "OrderPlacedDt")
	private String Order_Placed_Dt;
	
	@Column(name = "OrderDispatchedDt")
	private String Order_Dispatched_Dt;
	
	@Column(name = "OrderDeliveredDt")
	private String Order_Delivered_Dt;
	
	@Column(name = "OrderStatus")
	private String Order_Status;
	
	@Column(name = "CustomerId")
	private long CustomerId;
	
	@Column(name="ProductId")
	private long ProductId;	
	
	@Column(name = "paymentsource")
	private String payment_source;
	
	@Column(name = "paymentstatus")
	private String payment_status;
	
	

	public Order() {

	}

	public long getOrder_Id() {
		return id;
	}

	public void setOrder_Id(long order_Id) {
		id = order_Id;
	}

	public String getOrder_Placed_Dt() {
		return Order_Placed_Dt;
	}

	public void setOrder_Placed_Dt(String order_Placed_Dt) {
		Order_Placed_Dt = order_Placed_Dt;
	}

	public String getOrder_Dispatched_Dt() {
		return Order_Dispatched_Dt;
	}

	public void setOrder_Dispatched_Dt(String order_Dispatched_Dt) {
		Order_Dispatched_Dt = order_Dispatched_Dt;
	}

	public String getOrder_Delivered_Dt() {
		return Order_Delivered_Dt;
	}

	public void setOrder_Delivered_Dt(String order_Delivered_Dt) {
		Order_Delivered_Dt = order_Delivered_Dt;
	}

	public String getOrder_Status() {
		return Order_Status;
	}

	public void setOrder_Status(String order_Status) {
		Order_Status = order_Status;
	}

	public long getCustomer_Id() {
		return CustomerId;
	}

	public void setCustomer_Id(long customer_Id) {
		CustomerId = customer_Id;
	}

	public long getProduct_Id() {
		return ProductId;
	}

	public void setProduct_Id(long product_Id) {
		ProductId = product_Id;
	}

	public String getPayment_source() {
		return payment_source;
	}

	public void setPayment_source(String payment_source) {
		this.payment_source = payment_source;
	}

	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (CustomerId ^ (CustomerId >>> 32));
		result = prime * result + ((Order_Delivered_Dt == null) ? 0 : Order_Delivered_Dt.hashCode());
		result = prime * result + ((Order_Dispatched_Dt == null) ? 0 : Order_Dispatched_Dt.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((Order_Placed_Dt == null) ? 0 : Order_Placed_Dt.hashCode());
		result = prime * result + ((Order_Status == null) ? 0 : Order_Status.hashCode());
		result = prime * result + (int) (ProductId ^ (ProductId >>> 32));
		result = prime * result + ((payment_source == null) ? 0 : payment_source.hashCode());
		result = prime * result + ((payment_status == null) ? 0 : payment_status.hashCode());
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
		Order other = (Order) obj;
		if (CustomerId != other.CustomerId)
			return false;
		if (Order_Delivered_Dt == null) {
			if (other.Order_Delivered_Dt != null)
				return false;
		} else if (!Order_Delivered_Dt.equals(other.Order_Delivered_Dt))
			return false;
		if (Order_Dispatched_Dt == null) {
			if (other.Order_Dispatched_Dt != null)
				return false;
		} else if (!Order_Dispatched_Dt.equals(other.Order_Dispatched_Dt))
			return false;
		if (id != other.id)
			return false;
		if (Order_Placed_Dt == null) {
			if (other.Order_Placed_Dt != null)
				return false;
		} else if (!Order_Placed_Dt.equals(other.Order_Placed_Dt))
			return false;
		if (Order_Status == null) {
			if (other.Order_Status != null)
				return false;
		} else if (!Order_Status.equals(other.Order_Status))
			return false;
		if (ProductId != other.ProductId)
			return false;
		if (payment_source == null) {
			if (other.payment_source != null)
				return false;
		} else if (!payment_source.equals(other.payment_source))
			return false;
		if (payment_status == null) {
			if (other.payment_status != null)
				return false;
		} else if (!payment_status.equals(other.payment_status))
			return false;
		return true;
	}
	
	
	
	

}
