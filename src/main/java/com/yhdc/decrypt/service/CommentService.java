package com.yhdc.decrypt.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhdc.decrypt.model.Comment;
import com.yhdc.decrypt.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CommentService {

	private final CommentRepository commentRepository;

	// LIST
	@Transactional(readOnly = true)
	public List<Comment> getAllComment() {
		return commentRepository.findAll();
	}

	// GET
	@Transactional(readOnly = true)
	public Comment getCommentById(Long id) {
		Comment commentEntity = commentRepository.findById(id).get();
		return commentEntity;
	}

	// NEW
	@Transactional
	public Comment postComment(Comment comment) {
		Comment newCommentEntity = commentRepository.save(comment);
		return newCommentEntity;
	}

	// UPDATE TITLE, BODY
	@Transactional
	public Comment putComment(Long id, Comment comment) {
		Comment commentEntity = commentRepository.findById(id).get();
		commentEntity.setBody(comment.getBody());
		return commentEntity;
	}

	// DELETE
	@Transactional
	public int deleteComment(Long id) {
		Comment delComment = commentRepository.findById(id).get();

		if (delComment == null) {
			return 0;
		} else {
			commentRepository.delete(delComment);
		}
		return 1;
	}
}
