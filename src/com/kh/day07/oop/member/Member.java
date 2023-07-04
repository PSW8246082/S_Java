package com.kh.day07.oop.member;

public class Member {
	//입력받을거 3개정도 만들고
	//캡슐화의 원칙 적용해서 구성
	//저장용
	
	private String memberId;
	private String memberPw;
	private String memberEmail;
	private String memberAddress;
	

	
	
	
	
	
	
	
    //오버로딩 : 이름이 같고 매개변수의 타입과 개수가 다르다(둘중에 하나만 달라도ok)
	//생성자 : 객체를 초기화한다.
	public Member() {
		
	}
	public Member(String memberId, String memberPw, String memberEmail, String memberAddress ) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
	}
	
	
	
	
	
	
	
	
	
	
	//getter 메소드 (값을 가져오는 것 = return 필요함) (return 값이 있으면 -> void못씀)            
		public String getMemberId() {
			return this.memberId;
		}
		public String getMemberPw() {
			return this.memberPw;
		}
		public String getMemberEmail() {
			return this.memberEmail;
		}
		public String getMemberAddress() {
			return this.memberAddress;
		}
		
	//setter 메소드
		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}
		public void setMemberPw(String memberPw) {
			this.memberPw = memberPw;
		}
		public void setMemberEmail(String memberEmail) {
			this.memberEmail = memberEmail;
		}
		public void setMemberAddress(String memberAddress) {
			this.memberAddress = memberAddress;
		}
	
	
}
