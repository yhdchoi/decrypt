package com.yhdc.backendapi.controller;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yhdc.backendapi.dto.page.MsgPageDto;
import com.yhdc.backendapi.model.Message;
import com.yhdc.backendapi.service.MessageService;
import com.yhdc.backendapi.utils.Utilities;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/msg/")
@RequiredArgsConstructor
public class MessageController {

	private final MessageService messageService;
	private final Utilities utilities;

	// Search List
	@GetMapping("/list")
	public ResponseEntity<MsgPageDto<Message>> msgSearchList(
			@RequestParam(required = false, defaultValue = "") String searchText,
			@PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

		Page<Message> msgs = messageService.msgSearchList(searchText, searchText, pageable);

		int startPage = utilities.getStartPage(msgs);
		int endPage = utilities.getEndPage(msgs);

		MsgPageDto<Message> msgPage = new MsgPageDto<>(msgs, startPage, endPage);

		return new ResponseEntity<MsgPageDto<Message>>(msgPage, HttpStatus.OK);
	}

	// Detail
	@GetMapping("/detail/{id}")
	public ResponseEntity<Message> detail(@PathVariable Long id) {

		Message msg = messageService.detail(id);

		return new ResponseEntity<Message>(msg, HttpStatus.OK);
	}

	// New
	@PostMapping("/register")
	public ResponseEntity<Integer> registerMessage(@Valid @RequestBody Message newMsg) {

		int result = messageService.registerMessage(newMsg);

		return new ResponseEntity<Integer>(result, HttpStatus.OK);
	}

	// Delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteMessage(@PathVariable Long id) {

		String result = messageService.deleteMessage(id);

		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

}
