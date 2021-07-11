package com.yhdc.backendapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yhdc.backendapi.model.Member;
import com.yhdc.backendapi.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;

	public List<Member> getList() {

		List<Member> result = memberRepository.findAll();

		return result;
	}

	public Member getMember(Long mno) {

		Member result = memberRepository.getById(mno);

		return result;
	}
	
	

	public Long register(Member member) {

		memberRepository.save(member);

		return member.getMno();
	}

	public Long modify(Member member) {

		memberRepository.save(member);

		return member.getMno();
	}
	
	//TODO: password reset

	public String remove(Long mno) {
		
		//TODO: delete all related boards, comments, replies
		memberRepository.deleteById(mno);

		String result = "successs";

		return result;
	}
}
