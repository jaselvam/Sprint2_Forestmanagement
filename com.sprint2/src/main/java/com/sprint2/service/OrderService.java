package com.sprint2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint2.Exceptions.InvalidOperation;
import com.sprint2.model.Order;
import com.sprint2.repository.*;
import com.sprint2.utility.OrderValidation;

//defining the business logic
@Service
public class OrderService {
	@Autowired
	private OrderRepository OrderRepository;
	
	//getting Order record by using the method getOrderByorderNumber() of JpaRepository
	public Order getOrderByorderNumber(Integer orderNumber)
	{
		try 
		{
			return OrderRepository.findById(orderNumber).get();
		}
		catch(InvalidOperation ie)
		{
			ie.printStackTrace();
			return null;
		}
	}
	
	//Adding Order record by using the method addOrder() of JpaRepository
	public Order addOrder(Order Order) {
		
		
		if(Order!=null && Order.getDeliveryDate().matches(OrderValidation.dateregex))
		{
			return OrderRepository.save(Order);
		}
		else
		{	
			throw new InvalidOperation("cannot add Orders");
			
		}
	
	}
	
	//updating Order record by using the method updateOrder() of JpaRepository
	public Order updateOrder(Order Order) {
		if( Order!=null && Order.getDeliveryDate().matches(OrderValidation.dateregex))
		{
			OrderRepository.save(Order);
			return Order;
		}
		else
		{
			throw new InvalidOperation("Order not updated");
			
		}
	}
	
	//deleting a specific Order record by using the method deleteOrderbyorderNumber() of JpaRepository
	public boolean deleteOrderbyorderNumber(Integer orderNumber) 
	{
		if(orderNumber!=null)
		{
			OrderRepository.deleteById(orderNumber);
			return true;
			
		}
		else
		{
			throw new InvalidOperation("Order cannot deleted");
			
		}
	
	}
	
	//getting all the Order details by using method List<Order>() of JpaRepository
	public List<Order> getAllOrders() {
		List<Order> Orderlist=new ArrayList<Order>();
		OrderRepository.findAll().forEach(order->Orderlist.add(order));
		return Orderlist;
	
	}	
}