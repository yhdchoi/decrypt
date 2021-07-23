package com.yhdc.backendapi.dto.page;

import org.springframework.data.domain.Page;

import com.yhdc.backendapi.model.Board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardPageDto<T> {

	private Page<Board> boards;
	private int startPage;
	private int endPage;
}
