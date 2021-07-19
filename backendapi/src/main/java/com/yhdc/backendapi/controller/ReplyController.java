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

import com.yhdc.backendapi.model.Reply;
import com.yhdc.backendapi.repository.ReplyRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reply/")
@RequiredArgsConstructor
public class ReplyController {

	private final ReplyRepository replyRepository;

	// Search List
	@GetMapping("/list")
	public ResponseEntity<Page<Reply>> replySearchList(@RequestParam String content,
			@PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {
		Page<Reply> replies = replyRepository.findByContentContaining(content, pageable);

		return new ResponseEntity<Page<Reply>>(replies, HttpStatus.OK);
	}

	// Detail
	@GetMapping("/read/{id}")
	public ResponseEntity<Reply> read(@PathVariable Long id) {
		Reply reply = replyRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE COMMENT DOES NOT EXIST.");
		});

		return new ResponseEntity<Reply>(reply, HttpStatus.OK);
	}

	// New Comment
	@PostMapping("/register")
	public ResponseEntity<Reply> registerReply(@Valid @RequestBody Reply newReply) {
		Reply reply = replyRepository.save(newReply);

		return new ResponseEntity<Reply>(reply, HttpStatus.OK);
	}

	// Update Comment
	@Transactional
	@PutMapping("/update/{id}")
	public ResponseEntity<Reply> updateReply(@PathVariable Long id, @Valid @RequestBody Reply newReply) {
		Reply reply = replyRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE REPLY DOES NOT EXIST.");
		});

		reply.setContent(newReply.getContent());

		return new ResponseEntity<Reply>(reply, HttpStatus.OK);
	}

	// Delete Comment
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteReply(@PathVariable Long id) {
		try {
			replyRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			return new ResponseEntity<String>("THE REPLY DOES NOT EXIST.", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<String>("DELETED", HttpStatus.OK);
	}

}
