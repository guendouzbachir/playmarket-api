package com.playmarket.playmarketapi.service;

import java.util.List;

import com.playmarket.playmarketapi.model.User;

public interface UserService {
	
	User create(User user);
	List<User> getUsers();
	
}
