package com.yhdc.decrypt.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
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
		HttpStatus status = null;
		HttpHeaders headers = responseMsg.HeaderInsert();
		Message message = null;

		// TODO: Check Permit

		List<User> user = userService.getAllUser();

		if (user == null) {
			message = responseMsg.MessageListTemplate(StatusEnum.NOT_FOUND, "Unsuccessful", user);
			status = HttpStatus.NOT_FOUND;
		} else {
			message = responseMsg.MessageListTemplate(StatusEnum.FOUND, "Successful", user);
			status = HttpStatus.FOUND;
		}

		return new ResponseEntity<>(message, headers, status);
	}

	@CrossOrigin
	@GetMapping("/user/{id}")
	public ResponseEntity<Message> getUserById(@PathVariable Long id) {
		HttpStatus status = null;
		HttpHeaders headers = responseMsg.HeaderInsert();
		Message message = null;

		// TODO: Check Permit

		User user = userService.getUserById(id);

		if (user == null) {
			message = responseMsg.MessageUserTemplate(StatusEnum.NOT_FOUND, "Unsuccessful", user);
			status = HttpStatus.NOT_FOUND;
		} else {
			message = responseMsg.MessageUserTemplate(StatusEnum.FOUND, "Successful", user);
			status = HttpStatus.FOUND;
		}

		return new ResponseEntity<>(message, headers, status);
	}

	@CrossOrigin
	@GetMapping("/user/{username}")
	public ResponseEntity<Message> getUserByUsername(@RequestBody String username) {
		HttpStatus status = null;
		HttpHeaders headers = responseMsg.HeaderInsert();
		Message message = null;

		// TODO: Check Permit

		User user = userService.getUserByUsername(username);

		if (user == null) {
			message = responseMsg.MessageUserTemplate(StatusEnum.NOT_FOUND, "Unsuccessful", user);
			status = HttpStatus.NOT_FOUND;
		} else {
			message = responseMsg.MessageUserTemplate(StatusEnum.FOUND, "Successful", user);
			status = HttpStatus.FOUND;
		}

		return new ResponseEntity<>(message, headers, status);
	}

// POST
	@CrossOrigin
	@PostMapping("/newuser")
	public ResponseEntity<Message> postUser(@RequestBody User newuser) {
		HttpStatus status = null;
		HttpHeaders headers = responseMsg.HeaderInsert();
		Message message = null;

		// TODO: Check Permit

		User user = userService.postUser(newuser);

		if (user == null) {
			message = responseMsg.MessageUserTemplate(StatusEnum.INTERNAL_SERVER_ERROR, "Unsuccessful", user);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		} else {
			message = responseMsg.MessageUserTemplate(StatusEnum.CREATED, "Successful", user);
			status = HttpStatus.CREATED;
		}

		return new ResponseEntity<>(message, headers, status);
	}

// PUT
	@CrossOrigin
	@PutMapping("/user/{id}")
	public ResponseEntity<Message> putUser(@PathVariable Long id, @RequestBody String username,
			@RequestBody String email, @RequestBody String role) {
		HttpStatus status = null;
		HttpHeaders headers = responseMsg.HeaderInsert();
		Message message = null;

		// TODO: Check Permit

		User user = userService.putUser(id, username, email, role);

		if (user == null) {
			message = responseMsg.MessageUserTemplate(StatusEnum.INTERNAL_SERVER_ERROR, "Unsuccessful", user);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		} else {
			message = responseMsg.MessageUserTemplate(StatusEnum.OK, "Successful", user);
			status = HttpStatus.OK;
		}

		return new ResponseEntity<>(message, headers, status);
	}

// PATCH
	@CrossOrigin
	@PatchMapping("/user/{username}")
	public ResponseEntity<Message> patchUser(@PathVariable Long id, @RequestBody String password) {
		HttpStatus status = null;
		HttpHeaders headers = responseMsg.HeaderInsert();
		Message message = null;

		// TODO: Check Permit

		User user = userService.patchUserPassword(id, password);

		if (user == null) {
			message = responseMsg.MessageUserTemplate(StatusEnum.INTERNAL_SERVER_ERROR, "Unsuccessful", user);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		} else {
			message = responseMsg.MessageUserTemplate(StatusEnum.OK, "Successful", user);
			status = HttpStatus.OK;
		}

		return new ResponseEntity<>(message, headers, status);
	}

// DELETE
	@CrossOrigin
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Message> deleteUser(@PathVariable Long id) {
		HttpStatus status = null;
		HttpHeaders headers = responseMsg.HeaderInsert();
		Message message = null;

		// TODO: Check Permit

		int returnCode = userService.deleteUser(id);

		if (returnCode == 0) {
			message = responseMsg.MessageUserDelTemplate(StatusEnum.BAD_REQUEST, "Check the username");
			status = HttpStatus.BAD_REQUEST;
		} else {
			message = responseMsg.MessageUserDelTemplate(StatusEnum.OK, "Successful");
			status = HttpStatus.OK;
		}

		return new ResponseEntity<>(message, headers, status);
	}

}
