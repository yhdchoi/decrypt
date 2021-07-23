package com.yhdc.backendapi.service;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhdc.backendapi.model.Comment;
import com.yhdc.backendapi.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {

	private final CommentRepository commentRepository;

	// Search List
	@Transactional(readOnly = true)
	public Page<Comment> commentSearchList(String content,
			@PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {
		
		Page<Comment> comments = commentRepository.findByContentContaining(content, pageable);

		return comments;
	}

	// Detail
	@Transactional(readOnly = true)
	public Comment detail(Long id) {
		
		Comment comment = commentRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE COMMENT [" + id + "] DOES NOT EXIST.");
		});
		return comment;
	}

	// New Comment
	@Transactional
	public Comment registerComment(Comment newComment) {
		Comment comment = commentRepository.save(newComment);

		return comment;
	}

	// Update Comment
	@Transactional
	public Comment updateComment(Long id, Comment newComment) {
		Comment comment = commentRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE COMMENT [" + id + "] DOES NOT EXIST.");
		});
		comment.setContent(newComment.getContent());

		return comment;
	}

	// Delete Comment
	@Transactional
	public String deleteComment(Long id) {
		try {
			commentRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			return "THE COMMENT [" + id + "] DOES NOT EXIST.";
		}
		return "DELETED";
	}
}
