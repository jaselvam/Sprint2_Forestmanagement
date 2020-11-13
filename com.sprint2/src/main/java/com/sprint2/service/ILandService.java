package com.sprint2.service;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.sprint2.model.Land;



public interface ILandService 
{
	Land getLandBylandId(@PathVariable Integer landId);
	
	Land addLand(@RequestBody Land Land);
	
	Land updateLand(@RequestBody Land Land);
	
	 boolean deleteLandbylandId(@PathVariable Integer landId);
	
	 List<Land> getAllLand();
	
}
