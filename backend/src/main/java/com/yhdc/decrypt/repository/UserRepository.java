package com.yhdc.decrypt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.decrypt.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
