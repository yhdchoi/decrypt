package com.yhdc.backendapi.repotest;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.model.Member;
import com.yhdc.backendapi.repository.MemberRepository;

@SpringBootTest
public class MemberRepoTest {

	@Autowired
	private MemberRepository memberRepository;

	@Test
	public void insert() {
		IntStream.rangeClosed(1, 10).forEach(i -> {

			Member member = Member.builder().username("USER" + i).password("password" + i)
					.email("user" + i + "@aaa.com").lastname("lastname" + i).firstname("Firstname" + i)
					.phone("1231231234").address("Abc St. Toronto Canada").role("developer").active(true).build();

			memberRepository.save(member);
		});
	}
}