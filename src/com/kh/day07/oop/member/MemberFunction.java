package com.kh.day07.oop.member;

import java.util.Scanner;

public class MemberFunction {
	
	//기능용
	
	//필드
	private Member [] memb;
	private int index;
	

	//생성자
	public MemberFunction() {
		memb = new Member[3];
		index = 0;
	}
	
	
	
	
	
	
	
	public int printMenu() {
		//회원관리 프로그램
		//1.회원정보입력
		//2.회원정보출력
		//3.프로그램 종료
		//메뉴입력 : 
		Scanner sc = new Scanner(System.in);
		System.out.println("회원관리 프로그램");
		System.out.println("1.회원정보입력");
		System.out.println("2.회원정보출력");
		System.out.println("3.프로그램 종료");
		System.out.println("메뉴입력 :");
		int choice = sc.nextInt();
		return choice;
	}
	
	
	
	
	
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========회원 정보 입력========");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("주소 : ");
		sc.nextLine(); //공백 개행 제거
		String memberAddress = sc.nextLine();
		
//		memb[0] = new Member();
//		memb[0].setMemberId(memberId);
//		memb[0].setMemberPw(memberPw);
//		memb[0].setMemberEmail(memberEmail);
//		memb[0].setMemberAddress(memberAddr);
		
		//위에 다섯줄과 같은것.
		memb[index] = new Member(memberId, memberPw, memberEmail, memberAddress);
		index++;
	}
	
	
	
	
	
	public void printInfo() {
		
		System.out.println("========회원 정보 출력========");
		
		for(int i=0; i < index; i++) {
			System.out.printf("%s님의 비밀번호는 %s이고, 이메일은 %s이며, 주소는 %s\n입니다.",
					memb[i].getMemberId(), memb[i].getMemberPw(), memb[i].getMemberEmail(), memb[i].getMemberAddress());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
