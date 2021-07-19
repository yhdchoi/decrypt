package com.yhdc.backendapi.repotest;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.model.Comment;
import com.yhdc.backendapi.model.PrivacyType;
import com.yhdc.backendapi.model.Reply;
import com.yhdc.backendapi.repository.ReplyRepository;

@SpringBootTest
public class ReplyRepoTest {

	@Autowired
	private ReplyRepository replyRepository;

	@Test
	public void insert() {
		IntStream.rangeClosed(1, 10).forEach(i -> {
			Long id = (long) (Math.random() * 10) + 1;
			Comment comment = Comment.builder().id(id).build();

			Reply reply = Reply.builder().content("Reply content..." + i).privacy(PrivacyType.PUBLIC).build();

			replyRepository.save(reply);
		});
	}
}
