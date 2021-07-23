package com.yhdc.backendapi.service;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhdc.backendapi.model.Reply;
import com.yhdc.backendapi.repository.ReplyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyService {

	private final ReplyRepository replyRepository;

	// Search List
	@Transactional(readOnly = true)
	public Page<Reply> replySearchList(String content,
			@PageableDefault(size = 10, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

		Page<Reply> replies = replyRepository.findByContentContaining(content, pageable);

		return replies;
	}

	// Detail
	@Transactional(readOnly = true)
	public Reply detail(Long id) {

		Reply reply = replyRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE REPLY [" + id + "] DOES NOT EXIST.");
		});
		
		return reply;
	}

	// New Comment
	@Transactional
	public Integer registerReply(Reply newReply) {
		
		replyRepository.save(newReply);

		return 1;
	}

	// Update Comment
	@Transactional
	public Integer updateReply(Long id, Reply newReply) {
		
		Reply reply = replyRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE REPLY [" + id + "] DOES NOT EXIST.");
		});
		reply.setContent(newReply.getContent());

		return 1;
	}

	// Delete Comment
	@Transactional
	public String deleteReply(Long id) {
		
		try {
			replyRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			return "THE REPLY [" + id + "] DOES NOT EXIST.";
		}
		
		return "SUCCESSFULLY DELETED";
	}
}
