package com.yhdc.backendapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.backendapi.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
