package com.yhdc.backendapi.servtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.model.Member;
import com.yhdc.backendapi.service.MemberService;

@SpringBootTest
public class MemberServTest {

	@Autowired
	private MemberService memberService;

	@Test
	public void getMember() {

		Member member = memberService.getMember(9L);

		System.out.println(member);
	}

//	@Transactional
//	@Test
//	public void deleteMember() {
//
//		Member member = memberService.getMember(9L);
//
//		System.out.println(member);
//
//		String result = memberService.remove(9L);
//
//		System.out.println(result);
//	}

}
