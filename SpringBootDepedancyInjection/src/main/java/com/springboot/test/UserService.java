package com.springboot.test;

import org.springframework.stereotype.Component;

import com.springboot.test.dao.InterfaceUserDao;
@Component
public class UserService 
{
	InterfaceUserDao dao;

	public UserService(InterfaceUserDao dao) {
		super();
		this.dao = dao;
	}
	public void information(int id)
	{
		String string=dao.getInformation(id);
		System.out.println("User name is : "+string);
	}

}
