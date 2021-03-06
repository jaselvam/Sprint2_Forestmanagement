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

import com.sprint2.model.Scheduler;
import com.sprint2.service.SchedulerService;




// marking SchedulerController class as Controller 
@Controller
@RequestMapping("/Scheduler")
public class SchedulerController implements ISchedulerController
{
	Logger logger=LoggerFactory.getLogger(SchedulerController.class);
	//Autowire the SchedulerService class 
	@Autowired
	private SchedulerService schedulerService;
	
	//Creating a get mapping that retrieves the detail of a specific Scheduler
	@GetMapping("/{schedulerId}")
	public @ResponseBody Scheduler getSchedulerById(@PathVariable Integer schedulerId)
	{
		logger.info("Scheduler service was instalized");
		return schedulerService.getSchedulerById(schedulerId);
		
	}
	
	//Creating post mapping that posts the Scheduler detail into the database
	@PostMapping("/")
	public @ResponseBody Scheduler addScheduler(@RequestBody Scheduler scheduler)
	{
		return schedulerService.addScheduler(scheduler);
	}
	
	//Creating put mapping that updates the Scheduler details
	@PutMapping("/")
	public @ResponseBody Scheduler updateScheduler(@RequestBody Scheduler scheduler)
	{
		return schedulerService.updateScheduler(scheduler);
		
	}
	
	//Creating a delete mapping that deletes a specified Scheduler
	@DeleteMapping("/{schedulerId}")
	public @ResponseBody boolean deleteScheduler(@PathVariable Integer schedulerId)
	{
		return schedulerService.deleteSchedulerbyId(schedulerId);
	}
	
	//Creating a get mapping that retrieves all the Scheduler details from the database
	@GetMapping("/")
	public @ResponseBody List<Scheduler> getAllScheduler()
	{
		List<Scheduler> schedulerlist=schedulerService.getAllSchedulers();
		return schedulerlist;
	}
}
