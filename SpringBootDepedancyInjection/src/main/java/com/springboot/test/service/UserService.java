package com.springboot.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.test.dao.InterfaceUserDao;

@Component
public class UserService 
{
	InterfaceUserDao dao;

	public UserService(InterfaceUserDao dao) {
		super();
		this.dao = dao;
		System.out.println("Parameter constructor invoked");
	}
	
	
//	@Autowired
//	public UserService() 
//	{
//		super();
//		System.out.println("no Argument constructor invoked");
//		// TODO Auto-generated constructor stub
//	}



	public void information(int id)
	{
		String string=dao.getInformation(id);
		System.out.println("User name is : "+string);
	}

}
