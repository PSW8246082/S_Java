package com.kh.day09.wrapperpkg;

public class Exam_Wrapper {

	public static void main(String[] args) {
	
		int num = 0;
		//static 메소드를 이용해서(객체생성 안하고) 
		Integer su = Integer.valueOf(0);
		su = null;
		
//		오류 : The constructor Integer(int) is deprecated since version 9
//		해당 기능은 없어졌으므로 사용하지 마세요.
//		su = new Integer(0);
		
		
		//박싱과 언박싱
		su = Integer.valueOf(1026);
		su = 1026;  //오토 - 박싱

		int suNum = su.intValue();
		suNum = su; //오토 - 언박싱
		
		
		// 해당 숫자를 int에 넣어 쓰고싶을때
		String openDay = "20230515";
		int openDate = Integer.parseInt(openDay);
		
		
		//문자 대소문자 변환
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('A'));
		
		
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "은 숫자");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "은 영문자");
		}
		
	}

}
