package com.yhdc.backendapi.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommentDTO {

	private Long id;
	
	private String writer;
	private String content;
	
	private Long bid;
	private List<Long> rid;
	
	private LocalDateTime regDate;
	private LocalDateTime modDate;
}
