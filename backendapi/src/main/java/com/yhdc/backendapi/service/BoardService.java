package com.yhdc.backendapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.repository.BoardRepository;
import com.yhdc.backendapi.repository.CommentRepository;
import com.yhdc.backendapi.repository.ReplyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepository;
	private final CommentRepository commentRepository;
	private final ReplyRepository replyRepository;

	// LIST ALL
	public List<Board> getList() {

		List<Board> result = boardRepository.findAll();

		return result;
	}

	// GET BOARD
	public Board getBoard(Long id) {

		Board result = boardRepository.getById(id);

		return result;
	}

	// GET BY MEMBER
	public List<Board> getListWithMember(Long id) {

		List<Board> result = boardRepository.getBoardWithMember(id);

		return result;
	}

	// NEW Board
	public Long register(Board board) {

		boardRepository.save(board);

		return board.getId();
	}

	// MODIFY Board
	public Long modify(Board board) {

		boardRepository.save(board);

		return board.getId();
	}

	// DELETE Board
	public String remove(Long id) {

		// TODO: delete all related comments and replies
		
		boardRepository.deleteById(id);

		String result = "success";

		return result;
	}

}
