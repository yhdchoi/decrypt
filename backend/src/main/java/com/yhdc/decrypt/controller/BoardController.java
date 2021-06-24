package com.yhdc.decrypt.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.decrypt.model.Board;
import com.yhdc.decrypt.response.Message;
import com.yhdc.decrypt.response.ResponseMsg;
import com.yhdc.decrypt.response.StatusEnum;
import com.yhdc.decrypt.service.BoardService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class BoardController {

	private final BoardService boardService;
	private final ResponseMsg responseMsg;

// GET
	@CrossOrigin
	@GetMapping("/boards")
	public ResponseEntity<Message> getAllBoard() {

		// TODO: Check Permit

		List<Board> board = boardService.getAllBoard();
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(board, StatusEnum.NOT_FOUND,
				StatusEnum.FOUND);

		return reponseMessage;
	}

	@CrossOrigin
	@GetMapping("/board/{id}")
	public ResponseEntity<Message> getBoardById(@PathVariable Long id) {

		// TODO: Security Check Permit

		Board board = boardService.getBoardById(id);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(board, StatusEnum.NOT_FOUND,
				StatusEnum.FOUND);

		return reponseMessage;
	}

	@CrossOrigin
	@GetMapping("/board/{title}")
	public ResponseEntity<Message> getBoardByTitle(@RequestBody String title) {

		// TODO: Security Check Permit

		List<Board> board = boardService.getBoardByTitle(title);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(board, StatusEnum.NOT_FOUND,
				StatusEnum.FOUND);

		return reponseMessage;
	}

// POST
	@CrossOrigin
	@PostMapping("/newboard")
	public ResponseEntity<Message> postBoard(@RequestBody Board newboard) {

		// TODO: Check Permit

		Board board = boardService.postBoard(newboard);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(board, StatusEnum.BAD_REQUEST,
				StatusEnum.CREATED);

		return reponseMessage;
	}

// PUT
	@CrossOrigin
	@PutMapping("/board/{id}")
	public ResponseEntity<Message> putUser(@PathVariable Long id, @RequestBody Board board) {

		// TODO: Check Permit

		Board updatedBoard = boardService.putBoard(id, board);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageTemplate(updatedBoard, StatusEnum.BAD_REQUEST,
				StatusEnum.OK);

		return reponseMessage;
	}

// DELETE
	@CrossOrigin
	@DeleteMapping("/board/{id}")
	public ResponseEntity<Message> deleteBoard(@PathVariable Long id) {

		// TODO: Check Permit

		int returnCode = boardService.deleteBoard(id);
		ResponseEntity<Message> reponseMessage = responseMsg.MessageDelTemplate(returnCode,
				StatusEnum.INTERNAL_SERVER_ERROR, StatusEnum.OK);

		return reponseMessage;
	}

}
