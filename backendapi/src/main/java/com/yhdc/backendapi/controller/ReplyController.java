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

import com.yhdc.backendapi.dto.page.ReplyPageDto;
import com.yhdc.backendapi.model.Reply;
import com.yhdc.backendapi.service.ReplyService;
import com.yhdc.backendapi.utils.Utilities;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reply/")
@RequiredArgsConstructor
public class ReplyController {

	private final ReplyService replyService;
	private final Utilities utilities;

	// Search List
	@GetMapping("/list")
	public ResponseEntity<ReplyPageDto<Reply>> replySearchList(@RequestParam String content,
			@PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

		Page<Reply> replies = replyService.replySearchList(content, pageable);

		int startPage = utilities.getStartPage(replies);
		int endPage = utilities.getEndPage(replies);

		ReplyPageDto<Reply> replyPage = new ReplyPageDto<>(replies, startPage, endPage);

		return new ResponseEntity<ReplyPageDto<Reply>>(replyPage, HttpStatus.OK);
	}

	// Detail
	@GetMapping("/detail/{id}")
	public ResponseEntity<Reply> detail(@PathVariable Long id) {

		Reply reply = replyService.detail(id);

		return new ResponseEntity<Reply>(reply, HttpStatus.OK);
	}

	// New Comment
	@PostMapping("/register")
	public ResponseEntity<Integer> registerReply(@Valid @RequestBody Reply newReply) {

		int result = replyService.registerReply(newReply);

		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}

	// Update Comment
	@Transactional
	@PutMapping("/update/{id}")
	public ResponseEntity<Integer> updateReply(@PathVariable Long id, @Valid @RequestBody Reply newReply) {

		int result = replyService.updateReply(id, newReply);

		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}

	// Delete Comment
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteReply(@PathVariable Long id) {

		String result = replyService.deleteReply(id);

		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

}
