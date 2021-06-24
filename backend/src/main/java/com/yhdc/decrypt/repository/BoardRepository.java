package com.yhdc.decrypt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.decrypt.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{
	
	List<Board> findByTitle(String title);

}
