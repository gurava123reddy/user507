package com.user.service;

import java.util.List;

import com.user.vo.User;

public interface UserService {

	public User[] consumeAllUser();
	public User consumeUser(int id);
	
}
