package com.springboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springboot.test.dao.InterfaceUserDao;

@Component

public class UserService 
{
	@Autowired
	@Qualifier("mysql")
	InterfaceUserDao dao;

//	public UserService(InterfaceUserDao dao) {
//		super();
//		this.dao = dao;
//		System.out.println("Parameter constructor invoked");
//	}
	
	

//	public UserService() 
//	{
//		super();
//		System.out.println("no Argument constructor invoked");
//		// TODO Auto-generated constructor stub
//	}
	


//    @Autowired
//    @Qualifier("mysql")
//	public void setDao(InterfaceUserDao dao) {
//		this.dao = dao;
//		System.out.println("setter Injection done by autowired");
//	}




	public void information(int id)
	{
		String string=dao.getInformation(id);
//		System.out.println(dao.getClass().getName());
		System.out.println("User name is : "+string);
	}

}
