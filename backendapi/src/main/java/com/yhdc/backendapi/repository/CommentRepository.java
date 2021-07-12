package com.yhdc.backendapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yhdc.backendapi.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

	//Get all with member_id
	@Query("SELECT c, m FROM Comment c LEFT JOIN c.member m WHERE m.id = :id")
	List<Comment> getCommentWithMember(@Param("id") Long id);

	//Get all with board_id
	@Query("SELECT c, b FROM Comment c LEFT JOIN c.board b WHERE b.id = :id")
	List<Comment> getCommentWithBoard(@Param("id") Long id);

}
