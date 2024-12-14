package com.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDepedancyInjectionApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDepedancyInjectionApplication.class, args);
		UserService bean = run.getBean(UserService.class);
		bean.information(200);
	}
	

}
