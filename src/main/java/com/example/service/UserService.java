package com.example.service;

import com.example.model.User;

import java.util.List;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	List<User> findAllUsers();
}
