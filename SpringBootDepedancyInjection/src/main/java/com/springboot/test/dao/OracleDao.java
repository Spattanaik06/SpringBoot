package com.springboot.test.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class OracleDao  implements InterfaceUserDao
{

	public OracleDao() 
	{
		super();
		 System.out.println("oracle object created...");
		// TODO Auto-generated constructor stub
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
