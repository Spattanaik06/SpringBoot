package com.springboot.test.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mysql")

public class MySqlDao implements InterfaceUserDao
{

	public MySqlDao() 
	{
		super();
		System.out.println("mysql object created...");
	}

	@Override
	public String getInformation(Integer id) {
		if(id==100)
		{
			return "Raja";
		}
		else if(id==200)
		{
			return "Rani";
		}
		return null;
	}

}
