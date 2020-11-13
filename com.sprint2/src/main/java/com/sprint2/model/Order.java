package com.sprint2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity
@Entity
//defining class name as Table name
@Table(name="Forest_Order")
public class Order {
	
	// Defining orderNumber as primary key
	@Id
	@GeneratedValue
	private Integer orderNumber;
	private String deliveryPlace;
	private String deliveryDate;
	private String quantity;
	
	
	public Order() {
		super();
	}


	


	public Order(Integer orderNumber, String deliveryPlace, String deliveryDate, String quantity) {
		super();
		this.orderNumber = orderNumber;
		this.deliveryPlace = deliveryPlace;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
	}




	
	public Order(String deliveryPlace, String deliveryDate, String quantity) {
		super();
		this.deliveryPlace = deliveryPlace;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
	}





	public Integer getOrderNumber() {
		return orderNumber;
	}





	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}





	public String getDeliveryPlace() {
		return deliveryPlace;
	}





	public void setDeliveryPlace(String deliveryPlace) {
		this.deliveryPlace = deliveryPlace;
	}





	public String getDeliveryDate() {
		return deliveryDate;
	}





	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}





	public String getQuantity() {
		return quantity;
	}





	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}





	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", deliveryPlace=" + deliveryPlace + ", deliveryDate="
				+ deliveryDate + ", quantity=" + quantity + "]";
	}





	
	
	
}
