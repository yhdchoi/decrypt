package com.yhdc.decrypt.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhdc.decrypt.model.User;
import com.yhdc.decrypt.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	private final UserRepository userRepository;
	
	// LIST
	@Transactional(readOnly = true)
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
	
	
	// GET
	@Transactional(readOnly = true)
	public User getUserById(Long id) {				
		User userEntity = userRepository.getById(id);		
		return userEntity;
	}
	
	@Transactional(readOnly = true)
	public User getUserByUsername(String username) {				
		User userEntity = userRepository.findByUsername(username)
				.orElseThrow(() -> new IllegalArgumentException("Please check the username again."));
		
		return userEntity;
	}
	
	
	// NEW
	@Transactional
	public User postUser(User user) {		
		User newUserEntity = userRepository.save(user);
		return newUserEntity;
	}
	
	
	// UPDATE username, email, role
	@Transactional
	public User putUser(String username, String newUsername, String newEmail, String newRole) {
		User userEntity = userRepository.findByUsername(username)
				.orElseThrow(() -> new IllegalArgumentException("Please check the username again."));
		
		if (newUsername != null || newUsername != "") {
			userEntity.setUsername(newUsername);			
		}
		if (newEmail != null || newEmail != "") {
			userEntity.setEmail(newEmail);			
		}
		if (newRole!= null || newRole != "") {
			userEntity.setRole(newRole);			
		}
		return userEntity;
	}
	
	
	// UPDATE password
	@Transactional
	public User patchUserPassword(String username, String newPassword) {
		User userEntity = userRepository.findByUsername(username)
				.orElseThrow(() -> new IllegalArgumentException("Please check the username again."));
			userEntity.setPassword(newPassword);		
		return userEntity;
	}
	
	
	// DELETE
	@Transactional
	public void deleteUser(String username) {
		User delUser = userRepository.findByUsername(username)
				.orElseThrow(() -> new IllegalArgumentException("Please check the username again."));

		userRepository.delete(delUser);
	}
}
