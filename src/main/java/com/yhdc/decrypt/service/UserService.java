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
	public User putUser(Long id, String username, String email, String role) {
		User userEntity = userRepository.getById(id);

		if (username != null || username != "") {
			userEntity.setUsername(username);
		}
		if (email != null || email != "") {
			userEntity.setEmail(email);
		}
		if (role != null || role != "") {
			userEntity.setRole(role);
		}
		return userEntity;
	}

	// UPDATE password
	@Transactional
	public User patchUserPassword(Long id, String newPassword) {
		User userEntity = userRepository.getById(id);
		userEntity.setPassword(newPassword);
		return userEntity;
	}

	// DELETE
	@Transactional
	public int deleteUser(Long id) {
		User delUser = userRepository.getById(id);

		if (delUser == null) {
			return 0;
		} else {
			userRepository.delete(delUser);
		}

		return 1;
	}
}
