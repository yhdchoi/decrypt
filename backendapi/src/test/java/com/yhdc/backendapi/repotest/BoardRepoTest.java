package com.yhdc.backendapi.repotest;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.model.Member;
import com.yhdc.backendapi.repository.BoardRepository;

@SpringBootTest
public class BoardRepoTest {

	@Autowired
	private BoardRepository boardRepository;

	@Test
	public void insert() {
		IntStream.rangeClosed(1, 10).forEach(i -> {
			Long id = (long) (Math.random() * 10) + 1;			
			Member member = Member.builder().id(id).build();
			
			Board board = Board.builder().member(member).title("Title..." + i).content("Board content..." + i)
					.privacy(false).build();

			boardRepository.save(board);
		});
	}
}
