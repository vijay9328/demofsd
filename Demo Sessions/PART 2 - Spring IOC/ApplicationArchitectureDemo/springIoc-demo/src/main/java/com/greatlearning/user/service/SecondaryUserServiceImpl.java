package com.greatlearning.user.service;

import com.greatlearning.user.dao.UserDao;
import com.greatlearning.user.model.User;

public class SecondaryUserServiceImpl implements UserService {
	private UserDao dao;
	
	public SecondaryUserServiceImpl(UserDao dao) {
		this.dao = dao;
	}

	public void save(User user) {
		System.out.println("**** Secondary ****");
		
		this.dao.save(user);
	}
}
