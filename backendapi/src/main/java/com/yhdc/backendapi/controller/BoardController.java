package com.yhdc.backendapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/board/")
@RequiredArgsConstructor
@Log4j2
public class BoardController {

	private final BoardService boardService;

// GET ALL
	@GetMapping("/list")
	public ResponseEntity<List<Board>> getList() {

		List<Board> result = boardService.getList();

		return new ResponseEntity<>(result, HttpStatus.OK);
	}

// GET BOARD
	@GetMapping("/{id}")
	public ResponseEntity<Board> getBoard(@PathVariable("id") Long id) {

		log.info(id);

		Board result = boardService.getBoard(id);

		return new ResponseEntity<Board>(result, HttpStatus.OK);
	}
	
// GET ALL WITH MEMBER_ID
	@GetMapping("/list/{id}")
	public ResponseEntity<List<Board>> getListWithMember(@PathVariable("id") Long id){
		
		log.info(id);
		
		List<Board> result = boardService.getListWithMember(id);
		
		return new ResponseEntity<List<Board>>(result, HttpStatus.OK);
	}

// POST NEW
	@PostMapping("/new")
	public ResponseEntity<Long> register(@RequestBody Board board) {

		log.info(board);

		Long result = boardService.register(board);

		return new ResponseEntity<>(result, HttpStatus.OK);
	}

// MODIFY BOARD
	@PutMapping("/modify/{id}")
	public ResponseEntity<Long> modify(@RequestBody Board board) {

		log.info(board);

		Long result = boardService.modify(board);

		return new ResponseEntity<>(result, HttpStatus.OK);
	}

// DELETE
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> remove(@PathVariable Long id) {

		log.info(id);

		String result = boardService.remove(id);

		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
