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

import com.yhdc.backendapi.model.Reply;
import com.yhdc.backendapi.service.ReplyService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/reply/")
@RequiredArgsConstructor
@Log4j2
public class ReplyController {

	private final ReplyService replyService;

	@GetMapping("/list")
	public ResponseEntity<List<Reply>> getList() {

		List<Reply> result = replyService.getList();

		return new ResponseEntity<List<Reply>>(result, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Reply> getReply(@PathVariable Long id) {

		log.info(id);

		Reply result = replyService.getReply(id);

		return new ResponseEntity<Reply>(result, HttpStatus.OK);
	}
	
// TODO: GET REPLIES FOR BOARD
	
	

	@PostMapping("/new")
	public ResponseEntity<Long> register(@RequestBody Reply reply) {

		log.info(reply);

		Long result = replyService.register(reply);

		return new ResponseEntity<Long>(result, HttpStatus.OK);
	}

	@PutMapping("/modify")
	public ResponseEntity<Long> modify(@RequestBody Reply reply) {

		log.info(reply);

		Long result = replyService.modify(reply);

		return new ResponseEntity<Long>(result, HttpStatus.OK);
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> remove(@PathVariable Long id) {

		log.info(id);

		String result = replyService.remove(id);

		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

}
