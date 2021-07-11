package com.yhdc.backendapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.model.Member;

public interface BoardRepository extends JpaRepository<Board, Long> {
	
	List<Board> findByMember(Member member);
}
