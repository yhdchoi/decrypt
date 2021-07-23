package com.yhdc.backendapi.dto.page;

import org.springframework.data.domain.Page;

import com.yhdc.backendapi.model.Message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MsgPageDto<T> {

	private Page<Message> replies;
	private int startPage;
	private int endPage;
}
