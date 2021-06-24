package com.yhdc.decrypt.response;

public enum StatusEnum {

	OK(200, "OK"),
	CREATED(201, "CREATED"),
	NO_CONTENT(205, "NO_CONTENT"),
	FOUND(302, "FOUND"),
    BAD_REQUEST(400, "BAD_REQUEST"),
    UNAUTHORIZED(401, "UNAUTHORIZED"),
    FORBIDDEN(403, "FORBIDDEN"),
    NOT_FOUND(404, "NOT_FOUND"),
    NOT_ACCEPTABLE(406, "NOT_ACCEPTABLE"),
    REQUEST_TIMEOUT(408, "REQUEST_TIMEOUT"),
    INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR");

    int statusCode;
    String code;

    StatusEnum(int statusCode, String code) {
        this.statusCode = statusCode;
        this.code = code;
    }
}
