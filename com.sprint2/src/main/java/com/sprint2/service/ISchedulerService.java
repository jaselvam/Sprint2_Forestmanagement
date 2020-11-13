package com.sprint2.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.sprint2.model.Scheduler;



public interface ISchedulerService 
{

	Scheduler getSchedulerById(@PathVariable Integer schedulerId);
	
	Scheduler addScheduler(@RequestBody Scheduler scheduler);
	
	Scheduler updateScheduler(@RequestBody Scheduler scheduler);
	
	boolean deleteSchedulerbyId(@PathVariable Integer schedulerId);
	
	List<Scheduler> getAllSchedulers();
}

