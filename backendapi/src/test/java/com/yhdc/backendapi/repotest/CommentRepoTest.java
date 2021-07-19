package com.yhdc.backendapi.repotest;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.model.Comment;
import com.yhdc.backendapi.model.PrivacyType;
import com.yhdc.backendapi.repository.CommentRepository;

@SpringBootTest
public class CommentRepoTest {

	@Autowired
	private CommentRepository commentRepository;

	@Test
	public void insert() {
		IntStream.rangeClosed(1, 10).forEach(i -> {
			Long id = (long) (Math.random() * 10) + 1;
			Board board = Board.builder().id(id).build();

			Comment comment = Comment.builder().content("Comment content..." + i).privacy(PrivacyType.PUBLIC).build();

			commentRepository.save(comment);
		});
	}
}
