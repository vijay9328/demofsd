package com.greatlearning.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.spring.controller.UserController;
import com.greatlearning.spring.dao.InMemoryUserDaoImpl;
import com.greatlearning.spring.dao.UserDao;
import com.greatlearning.spring.model.User;
import com.greatlearning.spring.service.PrimaryUserServiceImpl;
import com.greatlearning.spring.service.UserService;

public class UsercClientCLI {
	
	public static void main(String[] args) {
		
		User dao = null;
		UserService service = null;
		UserController controller = null;
		
		//Without Spring IOC
		//dao = new InMemoryUserDaoImpl();
		//service = new PrimaryUserServiceImpl(dao);
		
		//UserController controller = new UserController();
		//controller.setUserService(service);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		controller = context.getBean("controller", UserController.class);

		User user1 = new User(1L, "Rahul", 23);
		controller.saveUser(user1);
	}
}
