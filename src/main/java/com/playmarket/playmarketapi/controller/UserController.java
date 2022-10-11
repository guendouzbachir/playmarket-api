package com.playmarket.playmarketapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playmarket.playmarketapi.model.User;
import com.playmarket.playmarketapi.repository.UserRepository;
import com.playmarket.playmarketapi.service.UserService;
import com.playmarket.playmarketapi.service.UserServiceImpl;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/playmatket")
@AllArgsConstructor
public class UserController {
	
	private final UserRepository userRepository;

	UserController(UserRepository userRepository) {
	    this.userRepository = userRepository;
	}
	
	@PostMapping("/create-user")
	@CrossOrigin(origins = "*")
	public User create(@RequestBody User user) {
		List<User> userList = userRepository.findByWalletId(user.getWalletId());
		if(userList != null && !userList.isEmpty()) {
			return userList.get(0);
		}
		return userRepository.save(user);
	}
	
	@GetMapping("/users")
	@CrossOrigin(origins = "*")
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
}
