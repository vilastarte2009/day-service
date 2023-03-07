package com.vilas.config.DayService;

import org.springframework.stereotype.Service;

import com.vilas.entity.Emp;

@Service
public class DayService 
{
	
	public Emp getTotalDays(int id)
	{
		
		return new Emp(id,null,0,30,0,0);
	}

}
