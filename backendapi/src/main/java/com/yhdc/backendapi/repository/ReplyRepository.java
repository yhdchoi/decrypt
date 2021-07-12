package com.yhdc.backendapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yhdc.backendapi.model.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

	// GET all with member_id
	@Query("SELECT r, m FROM Reply r LEFT JOIN r.member m WHERE m.id = :id")
	List<Reply> getReplyWithMember(@Param("id") Long id);

	// GET all with comment_id
	@Query("SELECT r, c FROM Reply r LEFT JOIN r.comment c WHERE c.id = :id")
	List<Reply> getReplyWithComment(@Param("id") Long id);

	// DELETE all with member_id
	@Query("DELETE r FROM Reply r LEFT JOIN r.member m WHERE m.id = :id")
	List<Reply> deleteReplyWithMember(@Param("id") Long id);
	
	
}
