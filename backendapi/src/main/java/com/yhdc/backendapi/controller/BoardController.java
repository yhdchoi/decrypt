package com.yhdc.backendapi.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/board/")
@RequiredArgsConstructor
public class BoardController {

	private final BoardRepository boardRepository;

	// Search List
	@GetMapping("/list")
	public ResponseEntity<Page<Board>> boardSearchList(@RequestParam String title, @RequestParam String content,
			@PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {
		Page<Board> boards = boardRepository.findByTitleContainingOrContentContaining(title, content, pageable);

		return new ResponseEntity<Page<Board>>(boards, HttpStatus.OK);
	}

	// Detail
	@GetMapping("/read/{id}")
	public ResponseEntity<Board> read(@PathVariable Long id) {
		Board board = boardRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE BOARD DOES NOT EXIST.");
		});

		return new ResponseEntity<Board>(board, HttpStatus.OK);
	}

	// New Board
	@PostMapping("/register")
	public ResponseEntity<Board> registerBoard(@Valid @RequestBody Board newBoard) {
		Board board = boardRepository.save(newBoard);

		return new ResponseEntity<Board>(board, HttpStatus.OK);
	}

	// Update Board
	@Transactional
	@PutMapping("/update/{id}")
	public ResponseEntity<Board> updateBoard(@PathVariable Long id, @Valid @RequestBody Board newBoard) {
		Board board = boardRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE BOARD DOES NOT EXIST.");
		});

		board.setTitle(newBoard.getTitle());
		board.setContent(newBoard.getContent());

		return new ResponseEntity<Board>(board, HttpStatus.OK);
	}

	// Delete Board
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteBoard(@PathVariable Long id) {
		try {
			boardRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			return new ResponseEntity<String>("THE BOARD DOES NOT EXIST.", HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<String>("DELETED", HttpStatus.OK);
	}
}
