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
		User userEntity = userRepository.findById(id).get();
		return userEntity;
	}

// NEW
	@Transactional
	public User postUser(User user) {
		User newUserEntity = userRepository.save(user);
		return newUserEntity;
	}

// UPDATE USERNAME, EMAIL, ROLE
	@Transactional
	public User putUser(Long id, User user) {
		User userEntity = userRepository.findById(id).get();
		userEntity.setUsername(user.getUsername());
		userEntity.setEmail(user.getEmail());
		userEntity.setRole(user.getRole());
		return userEntity;
	}

// UPDATE PASSWORD
	@Transactional
	public User patchUserPassword(Long id, String newPassword) {
		User userEntity = userRepository.findById(id).get();
		userEntity.setPassword(newPassword);
		return userEntity;
	}

// DELETE
	@Transactional
	public int deleteUser(Long id) {
		User delUser = userRepository.findById(id).get();

		if (delUser == null) {
			return 0;
		} else {
			userRepository.delete(delUser);
		}
		return 1;
	}
}
