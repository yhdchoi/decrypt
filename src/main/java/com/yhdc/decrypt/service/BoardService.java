package com.yhdc.decrypt.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhdc.decrypt.model.Board;
import com.yhdc.decrypt.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardService {

	private final BoardRepository boardRepository;

// LIST
	@Transactional(readOnly = true)
	public List<Board> getAllBoard() {
		return boardRepository.findAll();
	}

// GET
	@Transactional(readOnly = true)
	public Board getBoardById(Long id) {
		Board boardEntity = boardRepository.findById(id).get();
		return boardEntity;
	}

	@Transactional(readOnly = true)
	public List<Board> getBoardByTitle(String title) {
		List<Board> boardEntity = boardRepository.findByTitle(title);

		return boardEntity;
	}

// NEW
	@Transactional
	public Board postBoard(Board board) {
		Board newBoardEntity = boardRepository.save(board);
		return newBoardEntity;
	}

// UPDATE TITLE, BODY
	@Transactional
	public Board putBoard(Long id, Board board) {
		Board boardEntity = boardRepository.findById(id).get();
		boardEntity.setTitle(board.getTitle());
		boardEntity.setBody(board.getBody());
		return boardEntity;
	}

// DELETE
	@Transactional
	public int deleteBoard(Long id) {
		Board delBoard = boardRepository.getById(id);

		if (delBoard == null) {
			return 0;
		} else {
			boardRepository.delete(delBoard);
		}
		return 1;
	}
}
