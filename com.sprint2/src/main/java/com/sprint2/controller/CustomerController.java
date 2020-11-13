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

import com.sprint2.model.Customer;
import com.sprint2.service.CustomerService;




@RequestMapping("/customer")
@Controller
public class CustomerController implements ICustomerController {
	Logger logger=LoggerFactory.getLogger(CustomerController.class);
	//autowire the CustomerService class
	@Autowired
	private CustomerService customerService;
	
	//creating a get mapping that retrieves all the Customer detail from the database
	@GetMapping(value= {"/"})
	public @ResponseBody List<Customer> servicegetAllCustomer()
	{
		logger.info("customer service was instalized");
		List<Customer> customer =customerService.servicegetAllCustomer();
		
		return customer;
		
	}
	

	//creating a get mapping that retrieves  the  details of the specific Customer

	@GetMapping("/{customerId}")
	public @ResponseBody    Customer servicegetCustomerById(@PathVariable int customerId)
	{
		logger.info("customer service was instalized for getCustomerById");
		return customerService.servicegetCustomerById(customerId);
	}
	
	//creating a Post mapping that post  the   Customer details in the database
	
	@PostMapping("/")
	public  @ResponseBody  Customer serviceaddCustomer(@RequestBody Customer customer)
	{
		logger.info("customer service add method was intalized");
		return customerService.serviceaddCustomer(customer);
		
	}
	
	//creating a put mapping that updates  the  Customer detail
	@PutMapping("/{customerId}")
	public @ResponseBody  Customer serviceupdateCustomer(@RequestBody Customer customer)
	{
		logger.info("customer service was instalized for update method");
		return customerService.serviceupdateCustomer( customer);
	
	}
	
	//creating a delete  mapping that delete  the  details of the specific Customer
	@DeleteMapping("/{customerId}")
	public @ResponseBody  String serviceremoveCustomer(@PathVariable int customerId)
	{
		logger.info("customer service was instalized for remove method");
		return customerService.serviceremoveCustomer(customerId);
	}

	
	
}
