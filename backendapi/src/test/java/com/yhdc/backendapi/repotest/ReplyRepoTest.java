package com.yhdc.backendapi.repotest;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.model.Comment;
import com.yhdc.backendapi.model.Reply;
import com.yhdc.backendapi.repository.ReplyRepository;

@SpringBootTest
public class ReplyRepoTest {

	@Autowired
	private ReplyRepository replyRepository;

	@Test
	public void insert() {
		IntStream.rangeClosed(1, 200).forEach(i -> {

			Long no = (long) (Math.random() * 100) + 1;

			Comment comment = Comment.builder().cno(no).build();

			Reply reply = Reply.builder().writer("User" + i).content(
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Deleniti repudiandae quae praesentium architecto tempora suscipit nesciunt sunt hic optio vitae.")
					.privacy(false).comment(comment).build();

			replyRepository.save(reply);
		});
	}
}
