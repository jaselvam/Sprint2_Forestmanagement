package com.sprint2.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.sprint2.model.Contract;



public interface IContractService 
{
	 Contract getContractBycontractNumber(@PathVariable Integer contractNumber);
	
	 Contract addContract(@RequestBody Contract Contract);
	
	 Contract updateContract(@RequestBody Contract Contract);
	
	 boolean deleteContractbyContractNumber(@PathVariable Integer contractNumber);
	
	 List<Contract> getAllContract();
	
}
