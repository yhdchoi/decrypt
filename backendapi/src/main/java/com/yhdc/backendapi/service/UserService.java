package com.yhdc.backendapi.service;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhdc.backendapi.model.User;
import com.yhdc.backendapi.model.enums.EnableType;
import com.yhdc.backendapi.model.enums.RoleType;
import com.yhdc.backendapi.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	// Form Login
	@Transactional(readOnly = true)
	public User loginUser(User user) {

		User principal = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());

		return principal;
	}

	// Search and List User
	public Page<User> userSearchList(String username, String email,
			@PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

		Page<User> users = userRepository.findByUsernameContainingOrEmailContaining(username, email, pageable);

		return users;
	}

	// Detail
	@Transactional(readOnly = true)
	public User detail(Long id) {

		User user = userRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE USER [" + id + "] DOES NOT EXIST.");
		});

		return user;
	}

	// New User
	@Transactional
	public Integer registerUser(User newUser) {

		newUser.setRole(RoleType.USER);
		newUser.setEnable(EnableType.ENABLE);

		userRepository.save(newUser);

		return 1;
	}

	// Update User
	@Transactional
	public Integer updateUser(Long id, User updateUser) {
		User user = userRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE USER [" + id + "] DOES NOT EXIST.");
		});

		user.setEmail(updateUser.getEmail());
		user.setPassword(updateUser.getPassword());

		return 1;
	}

	// Delete User
	@Transactional
	public String deleteUser(Long id) {
		try {
			userRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			return "THE USER [" + id + "] DOES NOT EXIST.";
		}
		return "THE USER [" + id + "] HAS BEEN DELETED";

	}
}
