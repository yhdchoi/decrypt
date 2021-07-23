package com.yhdc.backendapi.repotest;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yhdc.backendapi.model.User;
import com.yhdc.backendapi.model.enums.GenderType;
import com.yhdc.backendapi.model.enums.RoleType;
import com.yhdc.backendapi.model.enums.StatusType;
import com.yhdc.backendapi.repository.UserRepository;

@SpringBootTest
public class UserRepoTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void insert() {
		IntStream.rangeClosed(1, 50).forEach(i -> {

			User user = User.builder().username("USER" + i).password("password" + i).email("user" + i + "@aaa.com")
					.gender(GenderType.EMPTY).role(RoleType.USER).status(StatusType.ACTIVE).build();

			userRepository.save(user);
		});
	}
}