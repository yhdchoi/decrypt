package com.yhdc.backendapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yhdc.backendapi.model.Reply;
import com.yhdc.backendapi.repository.ReplyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyService {

	private final ReplyRepository replyRepository;

	public List<Reply> getList() {

		List<Reply> result = replyRepository.findAll();

		return result;
	}

	public Reply getReply(Long rno) {

		Reply result = replyRepository.getById(rno);

		return result;
	}
	
	
//TODO: get replies for comment	
//	public List<Reply> getReplyByBno(Long cno) {
//		
//		List<Reply> result = replyRepository.findRepliesByCno(cno);
//		
//		return result;
//	}

	public Long register(Reply reply) {

		replyRepository.save(reply);

		Long result = reply.getRno();

		return result;
	}

	public Long modify(Reply reply) {

		replyRepository.save(reply);

		Long result = reply.getRno();

		return result;
	}

	public String remove(Long rno) {

		replyRepository.deleteById(rno);

		String result = "success";

		return result;
	}
}
