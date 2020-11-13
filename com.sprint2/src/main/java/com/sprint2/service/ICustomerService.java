package com.sprint2.service;

import java.util.List;

import com.sprint2.model.Customer;



public interface ICustomerService {

	
	
	//-----------------------------------------------------------Customer Module------------------------------------------------//
		/*************************************************************************************************************************
		 * -Function Name       :  servicegetAllCustomer(Customer customer)
		 * Input Parameters     :   
		 * Return type          :    List<Customer>
		 * Author               :    Pallavi Priya
		 * Creation Date        :    /11/2020
		 * Description          :    Getting all customer details and return all the customers.
		 **************************************************************************************************************************/
	List<Customer> servicegetAllCustomer();
	
	//-----------------------------------------------------------Customer Module------------------------------------------------//
		/*************************************************************************************************************************
		 * -Function Name       :  servicegetCustomerById(Customer customer)
		 * Input Parameters     :    int  customerId
		 * Return type          :    Customer
		 * Author               :    Pallavi Priya
		 * Creation Date        :    /11/2020
		 * Description          :    Getting the customer details  by the given customerrId.
		 **************************************************************************************************************************/
	Customer servicegetCustomerById(int customerId);
	
	//-----------------------------------------------------------Customer Module------------------------------------------------//
		/*************************************************************************************************************************
		 * -Function Name       :  serviceAddCustomer(Customer customer)
		 * Input Parameters     :    Customer customer
		 * Return type          :    Customer
		 * Author               :    Pallavi Priya
		 * Creation Date        :    /11/2020
		 * Description          :    Adding customer details and returns the customer.
		 **************************************************************************************************************************/
	Customer serviceaddCustomer(Customer customer);
	
	//-----------------------------------------------------------Customer Module------------------------------------------------//
		/*************************************************************************************************************************
		 * -Function Name       :  serviceupdateCustomer(Customer customer)
		 * Input Parameters     :    Customer customer
		 * Return type          :    Customer
		 * Author               :    Pallavi Priya
		 * Creation Date        :    /11/2020
		 * Description          :    updating the customer details and returns the customer.
		 **************************************************************************************************************************/
	Customer serviceupdateCustomer(Customer customer);
	
	//-----------------------------------------------------------Customer Module------------------------------------------------//
		/*************************************************************************************************************************
		 * -Function Name       :  serviceremoveCustomer(Customer customer)
		 * Input Parameters     :    int customerId
		 * Return type          :    String
		 * Author               :    Pallavi Priya
		 * Creation Date        :   /11/2020
		 * Description          :    Removing the customer details  with the given customer Id.
		 **************************************************************************************************************************/
	 String serviceremoveCustomer(int customerId);
}

