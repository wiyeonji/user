package com.open.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.mapper.MemberMapper;
import com.open.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberMapper memberMapper;

	@Override
	public void memberJoin(MemberVO member) throws Exception {
		memberMapper.memberJoin(member);
		
	}
	
	
	

}
