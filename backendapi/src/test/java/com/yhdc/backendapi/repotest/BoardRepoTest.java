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

		IntStream.rangeClosed(1, 100).forEach(i -> {

			Long no = (long) (Math.random() * 50) + 1;

			Member member = Member.builder().mno(no).build();

			Board board = Board.builder().title("Title..." + i).content(
					"Lorem ipsum dolor sit amet consectetur adipisicing elit. Deleniti repudiandae quae praesentium architecto tempora suscipit nesciunt sunt hic optio vitae.")
					.privacy(false).member(member).build();

			boardRepository.save(board);

		});
	}
}
