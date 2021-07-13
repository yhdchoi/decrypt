package com.yhdc.backendapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yhdc.backendapi.model.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

	// GET all with comment_id
	@Query("SELECT r, c FROM Reply r LEFT JOIN r.comment c WHERE c.id = :id")
	List<Reply> getReplyWithComment(@Param("id") Long id);

//	@Modifying
//	@Query("DELETE FROM Reply r where r.comment.id = :id")
//	void deleteByCommentId(Long id);

}
