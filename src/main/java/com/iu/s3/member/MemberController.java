package com.iu.s3.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/**")	//value라는 속성 딱 하나만 들어가면 생략 가능
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
	@RequestMapping("test")
	public void test() {
		memberService.test();
	}

	
	
	//로그인
	
	//회원가입

}
