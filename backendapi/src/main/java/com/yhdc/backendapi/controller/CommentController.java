package com.yhdc.backendapi.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.backendapi.dto.page.CommentPageDto;
import com.yhdc.backendapi.model.Comment;
import com.yhdc.backendapi.repository.CommentRepository;
import com.yhdc.backendapi.utils.Utilities;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/comment/")
@RequiredArgsConstructor
public class CommentController {

	private final CommentRepository commentRepository;
	private final Utilities utilities;

	// Search List
	@GetMapping("/list")
	public ResponseEntity<CommentPageDto<Comment>> commentSearchList(@RequestParam(required = false, defaultValue = "") String searchText,
			@PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

		Page<Comment> comments = commentRepository.findByContentContaining(searchText, pageable);

		int startPage = utilities.getStartPage(comments);
		int endPage = utilities.getEndPage(comments);

		CommentPageDto<Comment> commentPage = new CommentPageDto<>(comments, startPage, endPage);

		return new ResponseEntity<CommentPageDto<Comment>>(commentPage, HttpStatus.OK);
	}

	// Detail
	@GetMapping("/detail/{id}")
	public ResponseEntity<Comment> detail(@PathVariable Long id) {
		Comment comment = commentRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE COMMENT DOES NOT EXIST.");
		});

		return new ResponseEntity<Comment>(comment, HttpStatus.OK);
	}

	// New Comment
	@PostMapping("/register")
	public ResponseEntity<Comment> registerComment(@Valid @RequestBody Comment newComment) {
		Comment comment = commentRepository.save(newComment);

		return new ResponseEntity<Comment>(comment, HttpStatus.OK);
	}

	// Update Comment
	@Transactional
	@PutMapping("/update/{id}")
	public ResponseEntity<Comment> updateComment(@PathVariable Long id, @Valid @RequestBody Comment newComment) {
		Comment comment = commentRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE COMMENT DOES NOT EXIST.");
		});

		comment.setContent(newComment.getContent());

		return new ResponseEntity<Comment>(comment, HttpStatus.OK);
	}

	// Delete Comment
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteComment(@PathVariable Long id) {
		try {
			commentRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			return new ResponseEntity<String>("THE COMMENT DOES NOT EXIST.", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<String>("DELETED", HttpStatus.OK);
	}
}
