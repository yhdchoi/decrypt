package com.yhdc.decrypt.response;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.yhdc.decrypt.model.User;

@Component
public class ResponseMsg {

	public Message MessageListTemplate(StatusEnum statusEnum , String msg, List<User> user) {

		Message message = new Message();
		message.setStatus(statusEnum);
		message.setMessage(msg);
		message.setData(user);

		return message;
	}
	
	public Message MessageUserTemplate(StatusEnum statusEnum , String msg, User user) {

		Message message = new Message();
		message.setStatus(statusEnum);
		message.setMessage(msg);
		message.setData(user);

		return message;
	}
	
	public Message MessageUserDelTemplate(StatusEnum statusEnum , String msg) {

		Message message = new Message();
		message.setStatus(statusEnum);
		message.setMessage(msg);

		return message;
	}

	public HttpHeaders HeaderInsert() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

		return headers;
	}
}
