package com.yhdc.backendapi.controller;

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

	// New User
	@PostMapping("/user/signup")
	public ResponseEntity<Integer> registerUser(@RequestBody User newUser) {

		userService.registerUser(newUser);

		return new ResponseEntity<Integer>(1, HttpStatus.OK);
	}
	
	// Google OAuth
	@PostMapping("/user/signup/glg")
	public ResponseEntity<Integer> signupGoogle(@RequestBody User glgProfile) {


		return new ResponseEntity<Integer>(1, HttpStatus.OK);
	}
}
