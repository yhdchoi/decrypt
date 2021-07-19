package com.yhdc.backendapi.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.yhdc.backendapi.model.Board;

@Component
public class BoardValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Board.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {

		Board b = (Board) obj;

		if (b.getContent().isBlank()) {
			e.rejectValue("content", "key", "The content cannot be empty.");
		}
	}

}
