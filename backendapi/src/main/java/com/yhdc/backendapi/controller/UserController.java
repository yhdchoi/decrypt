package com.yhdc.backendapi.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.backendapi.dto.page.UserPageDto;
import com.yhdc.backendapi.model.User;
import com.yhdc.backendapi.service.UserService;
import com.yhdc.backendapi.utils.Utilities;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user/")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;
	private final Utilities utilities;

	// Search and List
	@GetMapping("/list/search")
	public ResponseEntity<UserPageDto<User>> userSearchList(
			@RequestParam(required = false, defaultValue = "") String username, 
			@RequestParam(required = false, defaultValue = "") String email,
			@PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

		Page<User> users = userService.userSearchList(username, email, pageable);

		int startPage = utilities.getStartPage(users);
		int endPage = utilities.getEndPage(users);

		UserPageDto<User> userPage = new UserPageDto<>(users, startPage, endPage);

		return new ResponseEntity<UserPageDto<User>>(userPage, HttpStatus.OK);
	}

	// Detail
	@GetMapping("/detail/{id}")
	public ResponseEntity<User> detail(@PathVariable Long id) {

		User user = userService.detail(id);

		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	// Update
	@PutMapping("/update/{id}")
	public ResponseEntity<Integer> updateUser(@PathVariable Long id, @RequestBody User updateUser) {

		int result = userService.updateUser(id, updateUser);

		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}

	// Delete
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id) {

		String result = userService.deleteUser(id);

		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
}
