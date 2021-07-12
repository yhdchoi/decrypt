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

	// LIST
	public List<Reply> getList() {

		List<Reply> result = replyRepository.findAll();

		return result;
	}

	// GET
	public Reply getReply(Long id) {

		Reply result = replyRepository.getById(id);

		return result;
	}

	// GET with MemberID
	public List<Reply> getRepliesWithMember(Long id) {

		List<Reply> result = replyRepository.getReplyWithMember(id);

		return result;
	}

	// GET With ReplyID
	public List<Reply> getRepliesWithComment(Long id) {

		List<Reply> result = replyRepository.getReplyWithComment(id);

		return result;
	}

	// POST
	public Long register(Reply reply) {

		replyRepository.save(reply);

		Long result = reply.getId();

		return result;
	}

	// PUT
	public Long modify(Reply reply) {

		replyRepository.save(reply);

		Long result = reply.getId();

		return result;
	}

	// DELETE
	public String remove(Long id) {

		replyRepository.deleteById(id);

		String result = "success";

		return result;
	}
	
	//TODO DELETE All With MemberID
	
	//TODO DELETE All With CommentID
}
