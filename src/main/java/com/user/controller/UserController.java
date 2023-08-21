package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.UserService;
import com.user.vo.User;

@RestController
public class UserController {
	
	private UserService service;

	@Autowired
	public UserController(UserService service) {
		this.service = service;
	}
	
	@GetMapping("/users")
	public User[] consumeAllUsers() {
		return service.consumeAllUser();
	}
	
	@GetMapping("/users/{id}")
	public User consumeUser(@PathVariable int id) {
		return service.consumeUser(id);
	}
	
	

}
