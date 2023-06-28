package com.kh.day02.basic;

public class Exam_PrintSample {
	public static void main(String [] args)
	{
		System.out.println("개행이 포함된 출력 메소드");
		System.out.print("개행이 없는 출력 메소드");
		System.out.println("<-바로 옆에 붙어버림");
		
		
		// %d: 정수
		// \n : 개행
		// \t : 탭만큼 띄우기
		// %f : 실수
		// %s : 문자열
		// %c : 문자
		
		System.out.printf("정수 출력 : %d\n", 11);
		System.out.printf("정수 출력 : %3d\n", 11);   //세자리 출력
		System.out.printf("실수 출력 : %f\n", 10.26);
		System.out.printf("실수 출력 : %3f\n", 10.26);
		
		
		
		System.out.printf("문자열 출력 : %s\n", "자바 printf 문자열 출력");
		System.out.printf("문자열 출력 : %c반 %s과정 %.2f개강 %.2f종강 %b 입니다.\n", 
				'F', "공공데이터 개발자", 5.15, 10.26, true );
		
		
	}

}
