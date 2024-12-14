package com.springboot.test.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao implements InterfaceUserDao
{
	Integer id;

	@Override
	public String getInformation(Integer id) 
	{
		if(id==100)
		{
			return "Raja";
		}
		else 
		{
			return "Rani";
		}
		
	}

}
