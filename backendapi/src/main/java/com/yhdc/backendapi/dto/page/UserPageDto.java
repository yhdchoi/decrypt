package com.yhdc.backendapi.dto.page;

import org.springframework.data.domain.Page;

import com.yhdc.backendapi.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPageDto<T> {

	private Page<User> users;
	private int startPage;
	private int endPage;
}
