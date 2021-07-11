package com.yhdc.backendapi.repotest;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.model.Comment;
import com.yhdc.backendapi.repository.CommentRepository;

@SpringBootTest
public class CommentRepoTest {

	@Autowired
	private CommentRepository commentRepository;

	@Test
	public void insert() {

		IntStream.rangeClosed(1, 100).forEach(i -> {

			Long no = (long) (Math.random() * 50) + 1;

			Board board = Board.builder().bno(no).build();

			Comment comment = Comment.builder().writer("User" + i).content(
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Deleniti repudiandae quae praesentium architecto tempora suscipit nesciunt sunt hic optio vitae.")
					.privacy(false).board(board).build();

			commentRepository.save(comment);
		});

	}
}
