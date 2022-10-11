package com.playmarket.playmarketapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.playmarket.playmarketapi.model.User;
import com.playmarket.playmarketapi.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User create(User user) {
		List<User> userList = userRepository.findByWalletId(user.getWalletId());
		if(userList != null && !userList.isEmpty()) {
			return userList.get(0);
		}
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
