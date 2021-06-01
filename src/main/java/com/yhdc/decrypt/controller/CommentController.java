package com.yhdc.decrypt.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.decrypt.model.Comment;
import com.yhdc.decrypt.response.Message;
import com.yhdc.decrypt.response.ResponseMsg;
import com.yhdc.decrypt.response.StatusEnum;
import com.yhdc.decrypt.service.CommentService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class CommentController {

	private final CommentService commentService;
	private final ResponseMsg responseMsg;

// GET
	@CrossOrigin
	@GetMapping("/comments")
	public ResponseEntity<Message> getAllComment() {

		// TODO: Check Permit

		List<Comment> comment = commentService.getAllComment();
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(comment, StatusEnum.NOT_FOUND,
				StatusEnum.FOUND);

		return reponseMessage;
	}

	@CrossOrigin
	@GetMapping("/comment/{id}")
	public ResponseEntity<Message> getBoardById(@PathVariable Long id) {

		// TODO: Security Check Permit

		Comment comment = commentService.getCommentById(id);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(comment, StatusEnum.NOT_FOUND,
				StatusEnum.FOUND);

		return reponseMessage;
	}

// POST
	@CrossOrigin
	@PostMapping("/newcomment")
	public ResponseEntity<Message> postBoard(@RequestBody Comment newcomment) {

		// TODO: Check Permit

		Comment comment = commentService.postComment(newcomment);		
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(comment, StatusEnum.BAD_REQUEST,
				StatusEnum.CREATED);

		return reponseMessage;
	}

// PUT
	@CrossOrigin
	@PutMapping("/comment/{id}")
	public ResponseEntity<Message> putUser(@PathVariable Long id, @RequestBody Comment comment) {

		// TODO: Check Permit

		Comment updatedComment = commentService.putComment(id, comment);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(updatedComment, StatusEnum.BAD_REQUEST,
				StatusEnum.OK);

		return reponseMessage;
	}

// DELETE
	@CrossOrigin
	@DeleteMapping("/comment/{id}")
	public ResponseEntity<Message> deleteBoard(@PathVariable Long id) {

		// TODO: Check Permit

		int returnCode = commentService.deleteComment(id);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageDelTemplate(returnCode,
				StatusEnum.INTERNAL_SERVER_ERROR, StatusEnum.OK);

		return reponseMessage;
	}
}
