package com.yhdc.backendapi.servtest;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.service.ReplyService;

@SpringBootTest
public class ReplyServTest {

	@Autowired
	private ReplyService replyService;

	@Transactional
	@Test
	public void delete() {
		
		replyService.remove(2L);
		
	}
}
