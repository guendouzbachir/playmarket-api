package com.playmarket.playmarketapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playmarket.playmarketapi.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByWalletId(String walletId);
}
