package com.yhdc.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.backend.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
