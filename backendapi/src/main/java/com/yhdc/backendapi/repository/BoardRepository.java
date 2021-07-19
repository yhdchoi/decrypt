package com.yhdc.backendapi.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.backendapi.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

	// Search title
	List<Board> findByTitle(String title);

	// Search title and content
	Page<Board> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);

	// Get all with MemberId
//	@Query("SELECT b, m FROM Board b LEFT JOIN b.member m WHERE m.id = :id")
//	List<Board> getBoardWithMember(@Param("id") Long id);

	// Delete with MemberId
//	@Modifying
//	@Query("DELETE FROM Board b WHERE b.member.id = :id")
//	void deleteByMemberId(Long id);
}
