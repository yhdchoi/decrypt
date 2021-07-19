package com.yhdc.backendapi.repotest;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.model.PrivacyType;
import com.yhdc.backendapi.model.User;
import com.yhdc.backendapi.repository.BoardRepository;

@SpringBootTest
public class BoardRepoTest {

	@Autowired
	private BoardRepository boardRepository;

	@Test
	public void insert() {
		IntStream.rangeClosed(1, 10).forEach(i -> {
			Long id = (long) (Math.random() * 10) + 1;
			User user = User.builder().id(id).build();

			Board board = Board.builder().title("Title..." + i).content("Board content..." + i)
					.privacy(PrivacyType.PUBLIC).build();

			boardRepository.save(board);
		});
	}
}
