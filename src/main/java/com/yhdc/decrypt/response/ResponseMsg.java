package com.yhdc.decrypt.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseMsg {

// COMMON TEMPLATES
//	public HttpHeaders HeaderInsert() {
//
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
//
//		return headers;
//	}

	public Message UserTemplate(StatusEnum statusEnum, String msg, Object data) {
		Message message = new Message();
		message.setStatus(statusEnum);
		message.setMessage(msg);
		message.setData(data);

		return message;
	}

	public Message BoardTemplate(StatusEnum statusEnum, String msg, Object data) {
		Message message = new Message();
		message.setStatus(statusEnum);
		message.setMessage(msg);
		message.setData(data);

		return message;
	}


	public ResponseEntity<Message> MessageTemplate(Object data, StatusEnum errorStatus, StatusEnum passStatus) {
//		HttpHeaders headers = HeaderInsert();
		Message message = null;
		HttpStatus status = null;

		if (data == null) {
			message = UserTemplate(errorStatus, "Unsuccessful", data);
			status = HttpStatus.BAD_REQUEST;
		} else {
			message = UserTemplate(passStatus, "Successful", data);
			status = HttpStatus.OK;
		}

		return new ResponseEntity<>(message, status);
	}

	public ResponseEntity<Message> MessageDelTemplate(int returnCode, StatusEnum errorStatus,
			StatusEnum passStatus) {
//		HttpHeaders headers = HeaderInsert();
		Message message = null;
		HttpStatus status = null;

		if (returnCode == 0) {
			message = UserTemplate(errorStatus, "Unsuccessful", null);
			status = HttpStatus.BAD_REQUEST;
		} else {
			message = UserTemplate(passStatus, "Successful", null);
			status = HttpStatus.OK;
		}

		return new ResponseEntity<>(message, status);
	}

}
