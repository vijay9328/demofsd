package com.greatlearning.spring.model;

import java.util.Objects;

public class User implements Comparable<User>{
	private final long id;
	private String name;
	private int age;
	private String emailAddress;
	
	public User(Long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int compareTo(User other) {
		return (int) (this.id - other.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", emailAddress=" + emailAddress + "]";
	}
}
