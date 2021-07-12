package com.yhdc.backendapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.backendapi.model.Comment;
import com.yhdc.backendapi.service.CommentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/comment/")
@RequiredArgsConstructor
@Log4j2
public class CommentController {

	private final CommentService commentService;

	@GetMapping("/list")
	public ResponseEntity<List<Comment>> getList() {

		List<Comment> result = commentService.getList();

		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Comment> getComment(@PathVariable Long id) {

		Comment result = commentService.getComment(id);

		return new ResponseEntity<Comment>(result, HttpStatus.OK);
	}
	
	//TODO: get comments for board
	

	@PostMapping("/new")
	public ResponseEntity<Long> register(@RequestBody Comment comment) {

		log.info(comment);

		Long result = commentService.register(comment);

		return new ResponseEntity<Long>(result, HttpStatus.OK);
	}

	@PutMapping("/modify")
	public ResponseEntity<Long> modify(@RequestBody Comment comment) {

		log.info(comment);

		Long result = commentService.modify(comment);

		return new ResponseEntity<Long>(result, HttpStatus.OK);
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> remove(@PathVariable Long id) {

		log.info(id);
		
		String result = commentService.remove(id);

		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
}
