package com.sprint2.controller;


import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sprint2.model.Order;



public interface IOrderController 
{
	//------------------------ 1. Order Application --------------------------
	/**************************************************************************************************************
				 -Function Name	:	getOrderByorderNumber(Integer orderNumber)
				 - Input Parameters	:  Integer orderNumber
				 - Return Type		:	Order
				 - Author			:	Lohitha
				 - Creation Date	:	10/11/2020
				 -Description		:	getting order details from the database 
	 ********************************************************************************************************/
	public @ResponseBody Order getOrderByorderNumber(@PathVariable Integer orderNumber);
	
	//------------------------ 1.Order Application --------------------------
	/*******************************************************************************************************
	 - Function Name	:	addOrder(Order Order)
	 - Input Parameters	:	Order Order
	 - Return Type		:	Order Order
	 - Author			:	Lohitha
	 - Creation Date	:	10/11/2020
	 - Description		:	Adding order details into the database
	 ********************************************************************************************************/
	public @ResponseBody Order addOrder(@RequestBody Order Order);
	
	//------------------------ 1. Order Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	updateOrder(Order Order)
			 - Input Parameters	:	Order Order
			 - Return Type		:	Order 
			 - Author			:	Lohitha
			 - Creation Date	:	10/11/2020
			 - Description		:	updating the order details
			 ********************************************************************************************************/
	public @ResponseBody Order updateOrder(@RequestBody Order Order);
	
	//------------------------ 1. Order Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	deleteOrderbyorderNumber(Integer orderNumber) 
			 - Input Parameters	:	Integer orderNumber
			 - Return Type		:	boolean
			 - Author			:	Lohitha
			 - Creation Date	:	10/11/2020
			 - Description		:	deleting order details
			 ********************************************************************************************************/
	public @ResponseBody boolean deleteOrderbyorderNumber(@PathVariable Integer orderNumber);
	
	//------------------------ 1. Order Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	getAllOrder() 
			 - Input Parameters	:	No
			 - Return Type		:	List<order>
			 - Author			:	Lohitha
			 - Creation Date	:	10/11/2020
			 - Description		:	Getting all the orders present in the database
			 ********************************************************************************************************/
	public @ResponseBody List<Order> getAllOrder();
	
}
