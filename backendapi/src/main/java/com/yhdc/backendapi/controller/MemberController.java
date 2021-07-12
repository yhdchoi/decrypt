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

import com.yhdc.backendapi.model.Member;
import com.yhdc.backendapi.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/member/")
@RequiredArgsConstructor
@Log4j2
public class MemberController {

	private final MemberService memberService;

	@GetMapping("/list")
	public ResponseEntity<List<Member>> getList() {

		List<Member> result = memberService.getList();

		return new ResponseEntity<List<Member>>(result, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Member> getMember(@PathVariable Long id) {

		log.info(id);

		Member result = memberService.getMember(id);

		return new ResponseEntity<Member>(result, HttpStatus.OK);
	}

	@PostMapping("/new")
	public ResponseEntity<Long> register(@RequestBody Member member) {

		log.info(member);

		Long result = memberService.register(member);

		return new ResponseEntity<Long>(result, HttpStatus.OK);
	}

	@PutMapping("/modify/{id}")
	public ResponseEntity<Long> modify(@RequestBody Member member) {

		log.info(member);

		Long result = memberService.modify(member);

		return new ResponseEntity<Long>(result, HttpStatus.OK);
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> remove(@PathVariable Long id) {

		log.info(id);

		String result = memberService.remove(id);

		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

}
