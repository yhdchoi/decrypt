package com.yhdc.decrypt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.decrypt.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUsername(String username);	
	
}
