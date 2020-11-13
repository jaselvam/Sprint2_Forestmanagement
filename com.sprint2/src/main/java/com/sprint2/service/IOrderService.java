package com.sprint2.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.sprint2.model.Order;



public interface IOrderService 
{
	Order getOrderByorderNumber(@PathVariable Integer orderNumber);
	
	Order addContract(@RequestBody Order Order);
	
	 Order updateOrder(@RequestBody Order Order);
	
	 boolean deleteOrderbyorderNumber(@PathVariable Integer orderNumber);
	
	 List<Order> getAllOrder();
	
}

