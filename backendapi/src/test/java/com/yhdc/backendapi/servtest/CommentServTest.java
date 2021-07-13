package com.yhdc.backendapi.servtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.repository.CommentRepository;

@SpringBootTest
public class CommentServTest {

	@Autowired
	private CommentRepository commentRepository;
	
	
}
