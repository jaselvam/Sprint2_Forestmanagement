package com.sprint2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sprint2.model.Customer;



public interface ICustomerController {
	
	//-----------------------------------------------------------Customer Module------------------------------------------------//
		/*************************************************************************************************************************
		 * -Function Name       :  servicegetAllCustomer()
		 * Input Parameters     :    
		 * Return type          :    List<Customer>
		 * Author               :    Pallavi Priya
		 * Creation Date        :   /11/2020
		 * Description          :    getting all  customer details.
		 **************************************************************************************************************************/
	
	public  List<Customer> servicegetAllCustomer();
	
	//-----------------------------------------------------------Customer Module------------------------------------------------//
		/*************************************************************************************************************************
		 * -Function Name       :  servicegetCustomer(int customerId)
		 * Input Parameters     :    int customer
		 * Return type          :    Customer
		 * Author               :    Pallavi Priya
		 * Creation Date        :    /11/2020
		 * Description          :    Getting the  customer details  by the given customerId.
		 **************************************************************************************************************************/
	public     Customer servicegetCustomerById( int customerId);
	
	//-----------------------------------------------------------Customer Module------------------------------------------------//
		/*************************************************************************************************************************
		 * -Function Name       :  serviceAddCustomer(Customer customer)
		 * Input Parameters     :    Customer customer
		 * Return type          :    Customer
		 * Author               :    Pallavi Priya
		 * Creation Date        :    /11/2020
		 * Description          :    Adding customer details and returns the customer.
		 **************************************************************************************************************************/
	public   Customer serviceaddCustomer( Customer customer);
	
	//-----------------------------------------------------------Customer Module------------------------------------------------//
		/*************************************************************************************************************************
		 * -Function Name       :  serviceupdateCustomer(Customer customer)
		 * Input Parameters     :    Customer customer
		 * Return type          :    Customer
		 * Author               :    Pallavi Priya
		 * Creation Date        :    27/10/2020
		 * Description          :    updating all customer details and returns the customer.
		 **************************************************************************************************************************/
	public  Customer serviceupdateCustomer( Customer customer);
	
	//-----------------------------------------------------------Customer Module------------------------------------------------//
		/*************************************************************************************************************************
		 * -Function Name       :  serviceremoveCustomer(Customer customer)
		 * Input Parameters     :    int customer
		 * Return type          :    String
		 * Author               :    Pallavi Priya
		 * Creation Date        :    27/10/2020
		 * Description          :    removing the customer details  of the given customerId.
		 **************************************************************************************************************************/
	public  String serviceremoveCustomer( int customerId);
}

