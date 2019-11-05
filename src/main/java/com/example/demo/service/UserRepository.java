package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public class UserRepository {

	private List<User> users = new ArrayList<>();
	
	public UserRepository() {
		users.add(new User(1, "Ashish", "ashish@gmail.com"));
		users.add(new User(2, "Arun", "arun@gmail.com"));
		users.add(new User(3, "Akhil", "akhil@gmail.com"));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	
	public User findOne(int id) {
		for (User user : users) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}
	
	public void insert(User user) {
		users.add(user);
	}
	
}
