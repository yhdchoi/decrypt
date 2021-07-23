package com.yhdc.backendapi.dto.page;

import org.springframework.data.domain.Page;

import com.yhdc.backendapi.model.Comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentPageDto<T> {

	private Page<Comment> comments;
	private int startPage;
	private int endPage;
}
