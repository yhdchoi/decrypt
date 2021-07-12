package com.yhdc.backendapi.repotest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.repository.BoardRepository;

@SpringBootTest
public class BoardRepoTest {

	@Autowired
	private BoardRepository boardRepository;

//	@Test
//	public void insert() {
//
//		IntStream.rangeClosed(1, 100).forEach(i -> {
//
//			Long no = (long) (Math.random() * 100) + 1;
//
//			Member member = Member.builder().id(no).build();
//
//			Board board = Board.builder().title("Title..." + i).content(
//					"Board content..." + i)
//					.privacy(false).member(member).build();
//
//			boardRepository.save(board);
//
//		});
//	}
	
	@Test
	public void testGetList() {
		
		List<Board> result = boardRepository.findAll();
		
		System.out.println(result);
	}
	
//	@Test
//	public void testGetWithMember() {
//		
//		List<Board> result = boardRepository.getBoardWithMember(9L);
//		
//		System.out.println(result);
//	}
}
