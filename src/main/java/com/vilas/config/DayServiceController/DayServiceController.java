package com.vilas.config.DayServiceController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vilas.config.DayService.DayService;
import com.vilas.entity.Emp;

@RestController
public class DayServiceController {
	
	@Autowired
	DayService dayservice;
	
	@GetMapping("/{empID}")
	Emp getDay(@PathVariable("empID") int id)
	{
		System.out.println("Day Service controller called ...");
		return dayservice.getTotalDays(id);
	}

}
