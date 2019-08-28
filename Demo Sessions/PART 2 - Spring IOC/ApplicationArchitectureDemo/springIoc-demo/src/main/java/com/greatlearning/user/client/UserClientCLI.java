package com.greatlearning.user.client;

import com.greatlearning.user.controller.UserController;
import com.greatlearning.user.dao.InMemoryUserDaoImpl;
import com.greatlearning.user.dao.JDBCUserDaoImpl;
import com.greatlearning.user.dao.UserDao;
import com.greatlearning.user.model.User;
import com.greatlearning.user.service.PrimayUserServiceImpl;
import com.greatlearning.user.service.SecondaryUserServiceImpl;
import com.greatlearning.user.service.UserService;

public class UserClientCLI {

	public static void main(String[] args) {
		User user1 = new User("Rahul");
		
		//
		UserDao dao = new JDBCUserDaoImpl();
		UserService service = new PrimayUserServiceImpl(dao);		
		UserController controller = new UserController(service);
		//
		
		controller.save(user1);
	}
}
