package com.yhdc.backendapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yhdc.backendapi.model.Comment;
import com.yhdc.backendapi.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {

	private final CommentRepository commentRepository;

	public List<Comment> getList() {

		List<Comment> result = commentRepository.findAll();

		return result;
	}

	public Comment getComment(Long cno) {

		Comment result = commentRepository.getById(cno);

		return result;
	}
	
	//TODO: get all comments for board

	public Long register(Comment comment) {

		commentRepository.save(comment);

		return comment.getCno();
	}

	public Long modify(Comment comment) {

		commentRepository.save(comment);

		return comment.getCno();
	}

	public String remove(Long cno) {

		//TODO: delete all related replies
		commentRepository.deleteById(cno);

		String result = "success";

		return result;
	}
}
