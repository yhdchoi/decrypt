package com.yhdc.backendapi.repotest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.repository.ReplyRepository;

@SpringBootTest
public class ReplyRepoTest {

	@Autowired
	private ReplyRepository replyRepository;

//	@Test
//	public void insert() {
//		IntStream.rangeClosed(1, 200).forEach(i -> {
//
//			Long id = (long) (Math.random() * 100) + 1;
//			Long no = (long) (Math.random() * 200) + 1;
//
//			Member member = Member.builder().id(id).build();
//
//			Comment comment = Comment.builder().id(no).build();
//
//			Reply reply = Reply.builder().member(member).comment(comment).content("Reply content..." + i).privacy(false)
//					.build();
//
//			replyRepository.save(reply);
//		});
//	}

//	@Test
//	public void testGetWithMember() {
//		
//		List<Reply> result = replyRepository.getReplyWithMember(3L);
//		
//		System.out.println(result);
//	}

	@Test
	public void testDeleteWithMember() {

		replyRepository.deleteReplyWithMember(3L);

		System.out.println(replyRepository.getReplyWithMember(3L));
	}
}
