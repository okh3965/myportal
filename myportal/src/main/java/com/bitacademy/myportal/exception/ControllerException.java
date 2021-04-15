package com.bitacademy.myportal.exception;

import javax.servlet.http.HttpServletRequest;

// 사용자 정의 예외
public class ControllerException extends RuntimeException {
	
	// field
	private HttpServletRequest req; // 예외 상황의 요청정보 저장해 둘 필드
	
	// constructor
	public ControllerException(String message) {
		super(message);
	}

	public ControllerException(String message,
			HttpServletRequest req) {
		super(message);
		this.req = req;
	}
	
	// getter, setter
	public HttpServletRequest getReq() {
		return req;
	}

	public void setReq(HttpServletRequest req) {
		this.req = req;
	}
	
	
	
	
}
