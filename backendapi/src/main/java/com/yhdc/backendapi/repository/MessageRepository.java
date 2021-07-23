package com.yhdc.backendapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.backendapi.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
	
	// SearchList
	Page<Message> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);
	
	// List
	Page<Message> findByRecieverId(Long recieverId, Pageable pageable);

}
