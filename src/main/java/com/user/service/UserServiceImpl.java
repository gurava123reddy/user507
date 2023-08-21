package com.user.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.vo.User;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public User[] consumeAllUser() {
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://jsonplaceholder.typicode.com/users";		
		return restTemplate.getForObject(url, User[].class);
	}

	@Override
	public User consumeUser(int id) {
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://jsonplaceholder.typicode.com/users";		
		return restTemplate.getForObject(url, User.class, id);
		
	}
}
