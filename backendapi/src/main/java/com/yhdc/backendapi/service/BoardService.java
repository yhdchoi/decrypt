package com.yhdc.backendapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepository;

	public List<Board> getList() {

		List<Board> result = boardRepository.findAll();

		return result;
	}

	public Board getBoard(Long bno) {

		Board result = boardRepository.getById(bno);

		return result;
	}
	
	//TODO: get all boards for member

	public Long register(Board board) {

		boardRepository.save(board);

		return board.getBno();
	}

	public Long modify(Board board) {

		boardRepository.save(board);

		return board.getBno();
	}

	public String remove(Long bno) {

		//TODO: delete all related comments and replies
		boardRepository.deleteById(bno);

		String result = "success";

		return result;
	}

}
