package com.yhdc.decrypt.controller;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
import com.yhdc.decrypt.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class UserController {
	
	private final UserService userService;	

	@CrossOrigin
	@GetMapping("/users")
	public ResponseEntity<Message> getAllUser() {
		List<User> user = userService.getAllUser();
		
		Message message = new Message();
		message.setMessage("Success");
		message.setData(user);
		
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
		
		return new ResponseEntity<>(message, headers, HttpStatus.FOUND);
	}
	
	@CrossOrigin
	@GetMapping("/user/{id}")
	public ResponseEntity<Message> getUserById(@PathVariable Long id) {
		User user = userService.getUserById(id);
		
		Message message = new Message();
		message.setMessage("Success");
		message.setData(user);
        
		HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
    
		return new ResponseEntity<>(message, headers, HttpStatus.FOUND);
	}
	
	@CrossOrigin	//disable CORS policy
	@PostMapping("/user")
	public ResponseEntity<Message> postUser(@RequestBody User user) {
		User newUser = userService.postUser(user);
		Message message = new Message();
		message.setMessage("성공 코드");
		message.setData(newUser);
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        
		return new ResponseEntity<>(message, headers, HttpStatus.CREATED);
	}
	
	@CrossOrigin
	@PutMapping("/user/{username}")
	public ResponseEntity<Message> putUser(String username, String newUsername, String newEmail, String newRole) {
		User user = userService.putUser(username, newUsername, newEmail, newRole);
		
		Message message = new Message();
		message.setMessage("Success");
		message.setData(user);

		HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
				
		return new ResponseEntity<>(message, headers, HttpStatus.OK);
	}
	
	@CrossOrigin
	@PatchMapping("/user{username}")
	public ResponseEntity<Message> patchUser(String username, String password) {
		User user = userService.patchUserPassword(username, password);
		Message message = new Message();
		message.setMessage("Success");
		message.setData(user);
		
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
		
        
		return new ResponseEntity<>(message, headers, HttpStatus.OK);
	}
	
	@CrossOrigin
	@DeleteMapping("/user/{username}")
	public ResponseEntity<Message> deleteUser(String username) {
		userService.deleteUser(username);
		
		Message message = new Message();
		message.setMessage("Deleted");

		HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
		        
		return new ResponseEntity<>(message, headers, HttpStatus.OK);
	}
	
}
