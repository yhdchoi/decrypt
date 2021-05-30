package com.yhdc.decrypt.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.decrypt.model.User;
import com.yhdc.decrypt.response.Message;
import com.yhdc.decrypt.response.ResponseMsg;
import com.yhdc.decrypt.response.StatusEnum;
import com.yhdc.decrypt.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UserController {

	private final UserService userService;
	private final ResponseMsg responseMsg;

// GET
	@CrossOrigin
	@GetMapping("/users")
	public ResponseEntity<Message> getAllUser() {

		// TODO: Check Permit

		List<User> user = userService.getAllUser();
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(user, StatusEnum.NOT_FOUND,
				StatusEnum.OK);

		return reponseMessage;
	}

	@CrossOrigin
	@GetMapping("/user/{id}")
	public ResponseEntity<Message> getUserById(@PathVariable Long id) {

		// TODO: Security Check Permit

		User user = userService.getUserById(id);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(user, StatusEnum.NOT_FOUND,
				StatusEnum.OK);

		return reponseMessage;
	}



// POST
	@CrossOrigin
	@PostMapping("/newuser")
	public ResponseEntity<Message> postUser(@RequestBody User newuser) {

		// TODO: Check Permit

		User user = userService.postUser(newuser);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(user, StatusEnum.BAD_REQUEST,
				StatusEnum.CREATED);

		return reponseMessage;
	}

// PUT PERSONAL INFO
	@CrossOrigin
	@PutMapping("/user/{id}")
	public ResponseEntity<Message> putUser(@PathVariable Long id, @RequestBody User user) {

		// TODO: Check Permit

		User updatedUser = userService.putUser(id, user);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(updatedUser, StatusEnum.BAD_REQUEST,
				StatusEnum.OK);

		return reponseMessage;
	}

// PATCH PASSWORD
	@CrossOrigin
	@PatchMapping("/user/{id}")
	public ResponseEntity<Message> patchUser(@PathVariable Long id, @RequestBody String password) {

		// TODO: Check Permit

		User user = userService.patchUserPassword(id, password);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(user, StatusEnum.BAD_REQUEST,
				StatusEnum.OK);

		return reponseMessage;
	}

// DELETE
	@CrossOrigin
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Message> deleteUser(@PathVariable Long id) {

		// TODO: Check Permit

		int returnCode = userService.deleteUser(id);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageDelTemplate(returnCode,
				StatusEnum.INTERNAL_SERVER_ERROR, StatusEnum.OK);

		return reponseMessage;
	}

}