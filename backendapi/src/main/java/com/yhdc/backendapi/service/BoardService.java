package com.yhdc.backendapi.service;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.model.enums.PrivacyType;
import com.yhdc.backendapi.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepository;

	// Search List
	@Transactional(readOnly = true)
	public Page<Board> boardSearchList(String title, String content, Pageable pageable) {
		Page<Board> boards = boardRepository.findByTitleContainingOrContentContaining(title, content, pageable);

		return boards;
	}

	// Detail
	@Transactional(readOnly = true)
	public Board detail(Long id) {
		Board board = boardRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE BOARD [" + id + "] DOES NOT EXIST.");
		});
		return board;
	}

	// New
	@Transactional
	public Integer registerBoard(Board newBoard) {

		newBoard.setPrivacy(PrivacyType.PUBLIC);

		boardRepository.save(newBoard);

		return 1;
	}

	// Update
	@Transactional
	public Integer updateBoard(Long id, Board newBoard) {
		Board board = boardRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE BOARD [" + id + "] DOES NOT EXIST.");
		});

		board.setTitle(newBoard.getTitle());
		board.setContent(newBoard.getContent());

		return 1;
	}

	// Delete
	@Transactional
	public String deleteBoard(Long id) {
		try {
			boardRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			return "THE BOARD [" + id + "] DOES NOT EXIST.";
		}
		return "DELETED";
	}
}
