package com.greatlearning.spring.service;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.greatlearning.spring.dao.UserDao;
import com.greatlearning.spring.model.User;

//@Component("servicePrimary")
public class PrimaryUserServiceImpl implements UserService {

	private UserDao dao;
	
	public PrimaryUserServiceImpl(UserDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void save(User user) {
		System.out.println("******* Inside PrimaryUserServiceImpl: Save() *********");
		this.dao.save(user);
	}

	@Override
	public Set<User> getAllUsers() {
		System.out.println("******* Inside PrimaryUserServiceImpl: GetAllUsers() *********");
		return this.dao.getAllUsers();
	}
}
