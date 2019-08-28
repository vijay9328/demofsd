package com.greatlearning.spring.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.greatlearning.spring.dao.UserDao;
import com.greatlearning.spring.model.User;

@Component("serviceSecondary")
public class SecondaryUserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
	//Without autowired using this constructor it is working fine
	/* 
	 * public SecondaryUserServiceImpl(UserDao dao) { this.dao = dao; }
	 */
	
	@Override
	public void save(User user) {
		System.out.println("******* Inside SecondaryUserServiceImpl: Save() *********");
		this.dao.save(user);
		this.dao.save();
	}

	@Override
	public Set<User> getAllUsers() {
		System.out.println("******* Inside SecondaryUserServiceImpl: GetAllUsers() *********");
		return this.dao.getAllUsers();
	}
}