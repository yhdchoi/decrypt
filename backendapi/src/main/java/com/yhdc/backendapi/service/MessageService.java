package com.yhdc.backendapi.service;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhdc.backendapi.model.Message;
import com.yhdc.backendapi.model.enums.PrivacyType;
import com.yhdc.backendapi.repository.MessageRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessageService {

	private final MessageRepository messageRepository;

	// Search List
	@Transactional(readOnly = true)
	public Page<Message> msgSearchList(String title, String content, Pageable pageable) {
		Page<Message> msgs = messageRepository.findByTitleContainingOrContentContaining(title, content, pageable);

		return msgs;
	}
	
	// List
	@Transactional(readOnly = true)
	public Page<Message> msgList(Long recieverId, Pageable pageable) {
		Page<Message> msgs = messageRepository.findByRecieverId(recieverId, pageable);

		return msgs;
	}

	// Detail
	@Transactional(readOnly = true)
	public Message detail(Long id) {
		Message board = messageRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("THE MESSAGE [" + id + "] DOES NOT EXIST.");
		});
		return board;
	}

	// New
	@Transactional
	public Integer registerMessage(Message newMsg) {

		newMsg.setPrivacy(PrivacyType.PUBLIC);

		messageRepository.save(newMsg);

		return 1;
	}

	// Delete 
	@Transactional
	public String deleteMessage(Long id) {
		try {
			messageRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			return "THE COMMENT [" + id + "] DOES NOT EXIST.";
		}
		return "DELETED";
	}
}
