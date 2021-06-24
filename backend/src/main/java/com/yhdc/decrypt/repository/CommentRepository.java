package com.yhdc.decrypt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.decrypt.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
