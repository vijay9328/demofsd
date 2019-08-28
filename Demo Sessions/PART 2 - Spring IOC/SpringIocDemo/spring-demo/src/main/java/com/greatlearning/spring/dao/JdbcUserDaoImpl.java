package com.greatlearning.spring.dao;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.greatlearning.spring.model.User;

@Component("daoJDBC")
public class JdbcUserDaoImpl implements UserDao {

	@Override
	public void save(User user) {
		System.out.println("******* JdbcUserDaoImpl: Query- insert into user (name, age, emailAddress) values ( , , ) *******");
		//jdbc implementation
		System.out.println("**** User: " + user + "***** User is stored in database");
	}
	
	public void save() {
		System.out.println("No Args");
	}
	
	@Override
	public Set<User> getAllUsers() {
		System.out.println("******* JdbcUserDaoImpl: Query- Select * from user *******");
		//jdbc implementation
		return null;
	}

}
