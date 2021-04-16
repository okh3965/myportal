package com.bitacademy.myportal.service;

import com.bitacademy.myportal.vo.MemberVo;

public interface MemberService {
	public boolean join(MemberVo vo); // 가입(insert)
	public MemberVo getUser(String email, String password); // login
	public MemberVo getUser(String email); // 중복 이메일 체크
	

}
