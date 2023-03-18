package com.open.service;

import org.springframework.stereotype.Service;

import com.open.model.MemberVO;

@Service //service임을 나타내는 어노테이션 반드시 추가해야 함!!
public interface MemberService {
	
	//회원가입
	public void memberJoin(MemberVO member) throws Exception;

}
