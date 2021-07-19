package com.yhdc.backendapi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.backendapi.model.User;
import com.yhdc.backendapi.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth/")
@RequiredArgsConstructor
public class AuthController {

	private final UserService userService;

	// Logout
	@PostMapping("/join")
	public ResponseEntity<Integer> joinForm(@RequestBody User newUser) {

		userService.registerUser(newUser);

		return new ResponseEntity<Integer>(1, HttpStatus.OK);
	}

	// Login
	@PostMapping("/login")
	public ResponseEntity<Integer> login(@RequestBody User user, HttpSession session) {

		User principal = userService.loginUser(user);
		
		if(principal != null) {
			session.setAttribute("principla", principal);
		}

		return new ResponseEntity<Integer>(1, HttpStatus.OK);
	}

}
