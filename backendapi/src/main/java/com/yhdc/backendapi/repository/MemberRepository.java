package com.yhdc.backendapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yhdc.backendapi.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	
	

}
