package com.yhdc.backendapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yhdc.backendapi.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

	// Get all with MemberId
	@Query("SELECT b, m FROM Board b LEFT JOIN b.member m WHERE m.id = :id")
	List<Board> getBoardWithMember(@Param("id") Long id);

	// Delete with MemberId
//	@Modifying
//	@Query("DELETE FROM Board b WHERE b.member.id = :id")
//	void deleteByMemberId(Long id);
}
