package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String [] args) 
	{
		
//		====== 메인 메뉴 ======
//				1. 성적입력
//				2. 성적출력
//				3. 종료
//				선택 : 1
//				====== 성적 입력 =======
//				국어 : 100
//				영어 : 90
//				수학 : 80
//				====== 메인 메뉴 ======
//				1. 성적입력
//				2. 성적출력
//				3. 종료
//				선택 : 2
//				====== 성적 출력 ======
//				국어 : 100
//				영어 : 90
//				수학 : 80
//				총점 : 270
//				평균 : 90.00
		
		
		
		
//		int kor = 0;
//		int eng = 0;
//		int math = 0;
//		
////				
//		//종료시킴....무한 반복문을 나올 수 있게 하는 방법....암기 :   break finish;
//		finish :
//		while(true) {
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("===== 메인 메뉴 ====");
//			System.out.println(" 1. 성적 입력 ");
//			System.out.println(" 2. 성적 출력 ");
//			System.out.println(" 3. 종료 ");
//			System.out.print(" 선택 : ");
//			
//			int inputNum = sc.nextInt();
//			
//			
//			switch(inputNum) {
//			case 1 :
//				System.out.println("===== 성적 입력 ====");
//				System.out.print(" 국어 : ");
//				kor = sc.nextInt(); // 웅니 kor eng math 변수 선언 안됐어용 선언부터해주셔야해용
//				System.out.print(" 영어 : ");
//				eng = sc.nextInt();
//				System.out.print(" 수학 : ");
//				math = sc.nextInt();
//				break;
//			case 2 :
//				System.out.println("===== 성적 출력 ====");
//				System.out.println("국어 : " + kor);
//				System.out.println("영어 : " + eng);
//				System.out.println("수학 : " + math);
//				System.out.println("총점 : " + (kor + eng + math)); //왜 문자화 되어서 더해지지?
//				System.out.println("평균 : " + (double)(kor + eng + math/3));
//				break;
//			case 3 : System.out.println("프로그램이 종료되었습니다.");
//			break finish;
//			default : System.out.println("잘못입력하셨습니다. 메뉴 선택 바랍니다.");
//			}
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------
		
//		내 문제풀이 (오답...ㅎ)
		

		int [] scoreArry = new int[3];
		
		
		
		for(;;) {
			System.out.println("===== 메인 메뉴 ====");
			System.out.println(" 1. 성적 입력 ");
			System.out.println(" 2. 성적 출력 ");
			System.out.println(" 3. 종료 ");
			System.out.print(" 선택 : ");
			
			Scanner sc = new Scanner(System.in);
			
			int inputNum = sc.nextInt();
			int sum = scoreArry[0] +scoreArry[1] + scoreArry[2];
			
			if(inputNum == 1) {
				System.out.println("===== 성적 입력 ====");
				System.out.print(" 국어 : ");
				scoreArry[0] = sc.nextInt();
				System.out.print(" 영어 : ");
				scoreArry[1] = sc.nextInt();
				System.out.print(" 수학 : ");
				scoreArry[2] = sc.nextInt();
			}
			
			else if(inputNum == 2) {
				System.out.println("국어 : " + scoreArry[0]);
				System.out.println("영어 : " + scoreArry[1]);
				System.out.println("수학 : " + scoreArry[2]);
				System.out.println("총점 : " + sum);
				System.out.println("평균 : " + (double)sum/scoreArry.length);
				
			}
			else {
				break;
			}
		}
		
		
	
		
		
		
	}

}
