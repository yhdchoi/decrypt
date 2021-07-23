package com.yhdc.backendapi.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

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

import com.yhdc.backendapi.dto.BoardPageDto;
import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.service.BoardService;
import com.yhdc.backendapi.utils.Utilities;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/board/")
@RequiredArgsConstructor
public class BoardController {

	private final BoardService boardService;
	private final Utilities utilities;

	// Search List
	@GetMapping("/list")
	public ResponseEntity<BoardPageDto<Board>> boardSearchList(@RequestParam String title, @RequestParam String content,
			@PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

		Page<Board> boards = boardService.boardSearchList(title, content, pageable);

		int startPage = utilities.getStartPage(boards);
		int endPage = utilities.getEndPage(boards);

		BoardPageDto<Board> boardPage = new BoardPageDto<>(boards, startPage, endPage);

		return new ResponseEntity<BoardPageDto<Board>>(boardPage, HttpStatus.OK);
	}

	// Detail
	@GetMapping("/detail/{id}")
	public ResponseEntity<Board> detail(@PathVariable Long id) {

		Board board = boardService.detail(id);

		return new ResponseEntity<Board>(board, HttpStatus.OK);
	}

	// New Board
	@PostMapping("/register")
	public ResponseEntity<Integer> registerBoard(@Valid @RequestBody Board newBoard) {

		int result = boardService.registerBoard(newBoard);

		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}

	// Update Board
	@Transactional
	@PutMapping("/update/{id}")
	public ResponseEntity<Integer> updateBoard(@PathVariable Long id, @Valid @RequestBody Board newBoard) {

		int result = boardService.updateBoard(id, newBoard);

		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}

	// Delete Board
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteBoard(@PathVariable Long id) {

		String result = boardService.deleteBoard(id);

		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
}
