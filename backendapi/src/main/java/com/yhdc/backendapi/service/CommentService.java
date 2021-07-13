package com.yhdc.backendapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.yhdc.backendapi.model.Comment;
import com.yhdc.backendapi.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {

	private final CommentRepository commentRepository;

	// GET List
	public List<Comment> getList() {

		List<Comment> result = commentRepository.findAll();

		return result;
	}

	// GET Comment
	public Comment getComment(Long id) {

		Comment result = commentRepository.getById(id);

		return result;
	}

	// GET By Board
	public List<Comment> getCommentsWithBoard(Long id) {

		List<Comment> result = commentRepository.getCommentWithBoard(id);

		return result;
	}

	// POST
	public Long register(Comment comment) {

		commentRepository.save(comment);

		return comment.getId();
	}

	// MODIFY
	@Transactional
	public Long modify(Comment comment) {

		commentRepository.save(comment);

		return comment.getId();
	}

	// DELETE
	@Transactional
	public String remove(Long id) {

		//TODO delete all related replies
		commentRepository.deleteById(id);

		String result = "success";

		return result;
	}
}
