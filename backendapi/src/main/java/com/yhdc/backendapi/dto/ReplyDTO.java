package com.yhdc.backendapi.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReplyDTO {

	private Long id;	
	
	private String writer;
	private String content;
	
	private Long cid;
	
	private LocalDateTime regDate;
	private LocalDateTime modDate;
}
