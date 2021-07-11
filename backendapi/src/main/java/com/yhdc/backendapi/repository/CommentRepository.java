package com.yhdc.backendapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	
	//TODO: delete by bno

	List<Comment> findByBoard(Board board);
}
