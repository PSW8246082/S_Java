package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	
	
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
		
		
	
//		학원 정답
		
		
		
//				
		//종료시킴....무한 반복문을 나올 수 있게 하는 방법....종료시키는 위치 중요
//		암기 :   break finish;
		finish :
			
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
			printMenu();
			
			int inputNum = sc.nextInt();
	
			
			switch(inputNum) {
			case 1 :
				Student.intputScore();
				break;
			case 2 :
				Student.printScore();
				break;
			case 3 : 
				showGoodBye();
			break finish; 
			
			default : printException();
			}
			
		}
		
		
		
		
		
	
		
		
		
		
		
		
		
		
//-------------------------------------------------------------------------
		
//		내 문제풀이 (오답...ㅎ)
		

//		int [] scoreArry = new int[3];
//		
//		
//		
//		for(;;) {
//			System.out.println("===== 메인 메뉴 ====");
//			System.out.println(" 1. 성적 입력 ");
//			System.out.println(" 2. 성적 출력 ");
//			System.out.println(" 3. 종료 ");
//			System.out.print(" 선택 : ");
//			
//			Scanner sc = new Scanner(System.in);
//			
//			int inputNum = sc.nextInt();
//			int sum = scoreArry[0] +scoreArry[1] + scoreArry[2];
//			
//			if(inputNum == 1) {
//				System.out.println("===== 성적 입력 ====");
//				System.out.print(" 국어 : ");
//				scoreArry[0] = sc.nextInt();
//				System.out.print(" 영어 : ");
//				scoreArry[1] = sc.nextInt();
//				System.out.print(" 수학 : ");
//				scoreArry[2] = sc.nextInt();
//			}
//			
//			else if(inputNum == 2) {
//				System.out.println("국어 : " + scoreArry[0]);
//				System.out.println("영어 : " + scoreArry[1]);
//				System.out.println("수학 : " + scoreArry[2]);
//				System.out.println("총점 : " + sum);
//				System.out.println("평균 : " + (double)(sum/scoreArry.length));
//				
//			}
//			else if(inputNum == 3) {
//				System.out.println("프로그램이 종료되었습니다.");
//				break;
//			}
//			else {
//				System.out.println("잘못입력하셨습니다. 메뉴 선택 바랍니다.");
//			}
//		}
		
		
	
		
		
		
	}
	
	
//--------------------------------------------------------------------------------------

 
//	main 밖에 위치함 , kor eng math 변수 main 밖에서 초기화 시켜줘야함..
	
//	모듈화 하기
	public static void printMenu() {
		System.out.println("===== 메인 메뉴 ====");
		System.out.println(" 1. 성적 입력 ");
		System.out.println(" 2. 성적 출력 ");
		System.out.println(" 3. 종료 ");
		System.out.print(" 선택 : ");
	}
	
//  Student 파일에 넣어줌....	
//	public static void intputScore() {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("===== 성적 입력 ====");
//		System.out.print(" 국어 : " );
//		Student.kor = sc.nextInt(); // 웅니 kor eng math 변수 선언 안됐어용 선언부터해주셔야해용
//		System.out.print(" 영어 : ");
//		Student.eng = sc.nextInt();
//		System.out.print(" 수학 : ");
//		Student.math = sc.nextInt();
//		}
	
	
//	public static void printScore() {
//		
//		int sum = Student.kor + Student.eng + Student.math;
//		
//		System.out.println("===== 성적 출력 ====");
//		System.out.println("국어 : " + Student.kor);
//		System.out.println("영어 : " + Student.eng);
//		System.out.println("수학 : " + Student.math);
//		System.out.println("총점 : " + sum); //왜 문자화 되어서 더해지지?
//		System.out.println("평균 : " + (double)(sum)/3);
//	}
	
	
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴 선택 바랍니다.");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}


