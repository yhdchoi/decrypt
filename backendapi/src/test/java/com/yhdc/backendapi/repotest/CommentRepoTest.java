package com.yhdc.backendapi.repotest;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.model.Board;
import com.yhdc.backendapi.model.Comment;
import com.yhdc.backendapi.model.Member;
import com.yhdc.backendapi.repository.CommentRepository;

@SpringBootTest
public class CommentRepoTest {

	@Autowired
	private CommentRepository commentRepository;

//	@Test
//	public void insert() {
//
//		IntStream.rangeClosed(1, 200).forEach(i -> {
//
//			Long id = (long) (Math.random() * 100) + 1;
//			Long no = (long) (Math.random() * 100) + 1;
//
//			Member member = Member.builder().id(id).build();
//
//			Board board = Board.builder().id(no).build();
//
//			Comment comment = Comment.builder().member(member).board(board).content("Comment content..." + i)
//					.privacy(false).build();
//
//			commentRepository.save(comment);
//		});
//	}
	
	
	@Test
	public void testGetWithMember() {
		
		List<Comment> result = commentRepository.getCommentWithMember(7L);
		
		System.out.println(result);
	}
}
