package com.sprint2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sprint2.model.Land;



public interface ILandController 
{
	//------------------------ 1.Land Application --------------------------
	/**************************************************************************************************************
				 -Function Name	:	getLandBylandId(Integer landId)
				 - Input Parameters	:  Integer landId
				 - Return Type		:	Land
				 - Author			:	Lohitha
				 - Creation Date	:	10/11/2020
				 -Description		:	getting land details from the database 
	 ********************************************************************************************************/
	public @ResponseBody Land getLandBylandId(@PathVariable Integer landId);
	
	//------------------------ 1.Land Application --------------------------
	/*******************************************************************************************************
	 - Function Name	:	addLand(Land Land)
	 - Input Parameters	:	Land Land
	 - Return Type		:	Land 
	 - Author			:	Lohitha
	 - Creation Date	:	10/11/2020
	 - Description		:	Adding land details into the database
	 ********************************************************************************************************/
	public @ResponseBody Land addLand(@RequestBody Land Land);
	
	//------------------------ 1. Land Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	updateLand(Land Land)
			 - Input Parameters	:	Land Land
			 - Return Type		:	Land 
			 - Author			:	Lohitha
			 - Creation Date	:	10/11/2020
			 - Description		:	updating the land details
			 ********************************************************************************************************/
	public @ResponseBody Land updateLand(@RequestBody Land Land);
	
	//------------------------ 1.Land Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	deleteLandbylandId(Integer landId) 
			 - Input Parameters	:	Integer landId
			 - Return Type		:	boolean
			 - Author			:	Lohitha
			 - Creation Date	:	10/11/2020
			 - Description		:	deleting land details
			 ********************************************************************************************************/
	public @ResponseBody boolean deleteLandbylandId(@PathVariable Integer landId);
	
	//------------------------ 1. Land Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	getAllLand() 
			 - Input Parameters	:	No
			 - Return Type		:	List<Land>
			 - Author			:	Lohitha
			 - Creation Date	:	10/11/2020
			 - Description		:	Getting all the lands present in the database
			 ********************************************************************************************************/
	public @ResponseBody List<Land> getAllLand();
	
}

