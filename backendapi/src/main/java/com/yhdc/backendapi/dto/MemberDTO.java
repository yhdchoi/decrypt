package com.yhdc.backendapi.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.yhdc.backendapi.model.Board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberDTO {

	private Long id;
	private String username;
	private String email;

	private String lastname;
	private String firstname;

	private String phone;
	private String address;

	private String role;

	private List<Board> bid;

	private LocalDateTime regDate;
	private LocalDateTime modDate;
	
	
}
