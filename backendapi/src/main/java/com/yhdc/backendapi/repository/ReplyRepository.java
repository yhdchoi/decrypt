package com.yhdc.backendapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.backendapi.model.Comment;
import com.yhdc.backendapi.model.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
	
	List<Reply> findByComment(Comment comment);

}
