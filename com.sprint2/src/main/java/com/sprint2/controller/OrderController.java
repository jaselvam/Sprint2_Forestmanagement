package com.sprint2.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sprint2.model.Order;
import com.sprint2.service.*;



//connect from postman as http://localhost:8080/swagger-ui.html
@Controller
@RequestMapping("/Order")
public class OrderController {
	Logger logger=LoggerFactory.getLogger(OrderController.class);
	
	//autowire the OrderService class
	@Autowired
	private OrderService OrderService;
	
	//creating a get mapping that retrieves the detail of a specific Order
	@GetMapping("/{orderNumber}")
	public @ResponseBody Order getOrderByorderNumber(@PathVariable Integer orderNumber)
	{
		logger.info("order service was instalized");
		return OrderService.getOrderByorderNumber(orderNumber);
		
	}
	//creating post mapping that post the Order detail in the database
	@PostMapping("/")
	public @ResponseBody Order addOrder(@RequestBody Order Order)
	{
		return OrderService.addOrder(Order);
	}
	//creating put mapping that updates the Order detail
	@PutMapping("/")
	public @ResponseBody Order updateOrder(@RequestBody Order Order)
	{
		return OrderService.updateOrder(Order);
		
	}
	//creating a delete mapping that deletes a specified Order
	@DeleteMapping("/{orderNumber}")
	public @ResponseBody boolean deleteOrderbyorderNumber(@PathVariable Integer orderNumber)
	{
		return OrderService.deleteOrderbyorderNumber(orderNumber);
	}
	//creating a get mapping that retrieves all the Order detail from the database
	@GetMapping("/")
	public @ResponseBody List<Order> getAllOrder()
	{
		List<Order> Orderlist=OrderService.getAllOrders();
		return Orderlist;
	}
	
	
	
	
	
	
}

