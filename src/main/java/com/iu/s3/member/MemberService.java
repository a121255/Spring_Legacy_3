package com.iu.s3.member;

public class MemberService {
	private MemberDAO memberDAO;   
	//의존성 주입 : 의존성 있는 객체 넣어주는 것
	// 주입방법 
	
	
	//2) 생성자
	public MemberService() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	
	// 1) setter

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	public void test() {
		memberDAO.test();
		System.out.println("MemberService");
	}
	

	
}
