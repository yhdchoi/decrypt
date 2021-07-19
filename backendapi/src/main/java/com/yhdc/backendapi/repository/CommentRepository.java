package com.yhdc.backendapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.backendapi.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

	Page<Comment> findByContentContaining(String content, Pageable pageable);

	// Get all with board_id
//	@Query("SELECT c, b FROM Comment c LEFT JOIN c.board b WHERE b.id = :id")
//	List<Comment> getCommentWithBoard(@Param("id") Long id);

	// Get board_id with CommentId
//	@Query("SELECT c.board.id FROM Comment AS c WHERE c.id = :id")
//	Long getBoardIdWithCommentId(@Param("id") Long id);

//	@Modifying
//	@Query("DELETE FROM Comment c where c.id = :id")
//	void deleteByBoard(@Param("id") Long id);

}
