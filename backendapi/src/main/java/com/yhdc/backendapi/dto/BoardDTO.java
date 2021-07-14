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
public class BoardDTO {

	private Long id;
	
	private String title;
	private String content;
	
	private Long mid;
	private List<Long> cid;
	
	private LocalDateTime regDate;
	private LocalDateTime modDate;
}
