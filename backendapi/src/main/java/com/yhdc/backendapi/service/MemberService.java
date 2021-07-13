package com.yhdc.backendapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.yhdc.backendapi.model.Member;
import com.yhdc.backendapi.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;

	// GET
	public List<Member> getList() {

		List<Member> result = memberRepository.findAll();

		return result;
	}

	// GET
	public Member getMember(Long id) {

		Member result = memberRepository.getById(id);

		return result;
	}

	// POST
	public Long register(Member member) {

		memberRepository.save(member);

		return member.getId();
	}

	// MODIFY
	public Long modify(Member member) {

		memberRepository.save(member);

		return member.getId();
	}

	// DELETE
	@Transactional
	public String remove(Long id) {

		//TODO delete all related boards, comments, replies
		
		memberRepository.deleteById(id);

		String result = "successs";

		return result;
	}

	// TODO: password reset
}
