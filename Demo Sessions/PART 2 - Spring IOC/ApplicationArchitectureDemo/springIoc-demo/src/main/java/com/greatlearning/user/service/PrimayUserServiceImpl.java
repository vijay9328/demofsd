package com.greatlearning.user.service;

import com.greatlearning.user.dao.UserDao;
import com.greatlearning.user.model.User;

public class PrimayUserServiceImpl implements UserService {

	private UserDao dao;
	
	public PrimayUserServiceImpl(UserDao dao) {
		this.dao = dao;
	}
	
	public void save(User user) {
		System.out.println("**** Primary ****");
		//Business logic
		this.dao.save(user);
	}
}
