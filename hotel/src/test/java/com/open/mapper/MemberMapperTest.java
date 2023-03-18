package com.open.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.open.mapper.MemberMapper;
import com.open.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class) //Junit �봽�젅�엫�썙�겕 �뀒�뒪�듃 �떎�뻾 諛⑸쾿 �솗�옣
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //�옄�룞�쑝濡� 留뚮뱾�뼱 以� �븷�뵆由ъ��씠�뀡 而⑦뀓�뒪�듃 �꽕�젙 �뙆�씪 �쐞移� 吏��젙
public class MemberMapperTest {
	
	@Autowired
	private MemberMapper memberMapper; //MemberMapper.java �씤�꽣�럹�씠�뒪 �쓽議댁꽦 二쇱엯
	
	//�쉶�썝媛��엯 荑쇰━ �뀒�뒪�듃 硫붿꽌�뱶
	@Test
	public void memberJoin() throws Exception {
		MemberVO member = new MemberVO();
		
	/*	member.setId("test1"); //id
		member.setPassword("test"); //password
		member.setName("test"); //name
		member.setEmail("test"); //eamil
	*/
		
		memberMapper.memberJoin(member); //荑쇰━ 硫붿꽌�뱶 �떎�뻾
	}

}
