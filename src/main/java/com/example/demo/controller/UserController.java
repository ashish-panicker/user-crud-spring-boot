package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository repo;
	
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		repo.insert(user);
	}
	
	@GetMapping("/users/{id}")
	public User findUser(@PathVariable int id) {
		return repo.findOne(id);
	}
	
	@GetMapping("/users")
	public List<User> findAllUsers(){
		return  repo.findAll();
	}

}
