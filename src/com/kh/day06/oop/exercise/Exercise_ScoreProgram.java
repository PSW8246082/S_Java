package com.kh.day06.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	
	static int index = 0;
	
	public static void main(String [] args)
	{
	
//		====== 메인 메뉴 ======
//		1. 성적입력
//		2. 성적출력
//		3. 종료
//		선택 : 1
//		Exercise_ScoreProgram score = new Exercise_ScoreProgram();
//		score.kor = 

		
//		Student stuOne = new Student();
		Student [] stds = new Student[3];
		
		
			
		finish :
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			printMenu();
			
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 : 
					inputScore(stds);
					break;
				case 2 : 
					printScore(stds);
					break;
				case 3 : 
					showGoodBye(); 
					break finish;
				default : printException();
			}
		}		
	}
	
	
	
	

// *참고	
//	next() :공백없는 문자열 ex)이름
//  nextLine() : 공백있는 문자열 ex)주소
	
	
	
	
	
	
	
//---------------------------------------------------------------------------------------------
	
	//한명씩 입력받는 법..
	
	
	
	public static void printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputScore(Student [] stds) {
//		====== 성적 입력 =======
//		국어 : 100
//		영어 : 90
//		수학 : 80
		
		Scanner sc = new Scanner(System.in);

			stds[index] = new Student();
			
			System.out.println("====== 이름 입력 =======");
			System.out.print("이름 : ");
			stds[index].name = sc.next();
			System.out.println("====== 성적 입력 =======");
			System.out.print("국어 : ");
			stds[index].kor = sc.nextInt();
			System.out.print("영어 : ");
			stds[index].eng = sc.nextInt();
			System.out.print("수학 : ");
			stds[index].math = sc.nextInt();
			if(index < stds.length) index++;	
			
		

		
//		stds[0] = new Student();
//		
//		System.out.println("====== 이름 입력 =======");
//		System.out.print("이름 : ");
//		stds[0].name = sc.next();
//		System.out.println("====== 성적 입력 =======");
//		System.out.print("국어 : ");
//		stds[0].kor = sc.nextInt();
//		System.out.print("영어 : ");
//		stds[0].eng = sc.nextInt();
//		System.out.print("수학 : ");
//		stds[0].math = sc.nextInt();
	}
	
	public static void printScore(Student [] stds) {
//		====== 성적 출력 ======
//		국어 : 100
//		영어 : 90
//		수학 : 80
//		총점 : 270
//		평균 : 90.00
		
		for(int i=0; i<index; i++) {
			System.out.println("====== 성적 출력 ======");
			System.out.printf("이름 : %s\n", stds[i].name);
			System.out.printf("국어 : %d\n", stds[i].kor);
			System.out.printf("영어 : %d\n", stds[i].eng);
			System.out.printf("수학 : %d\n", stds[i].math);
			System.out.printf("총점 : %d\n", stds[i].getTotal());
			System.out.printf("평균 : %.2f\n", stds[i].getAvg());
		}
	
		
//		System.out.println("====== 성적 출력 ======");
//		System.out.printf("이름 : %s/n", stds[0].name);
//		System.out.printf("국어 : %d\n", stds[0].kor);
//		System.out.printf("영어 : %d\n", stds[0].eng);
//		System.out.printf("수학 : %d\n", stds[0].math);
////		System.out.printf("총점 : %d\n", kor+eng+math);
////		System.out.printf("평균 : %.2f\n", (double)(kor+eng+math)/3);
	}
	
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다."); 
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
	}
	
	
	
	
	
//-------------------------------------------------------------------------------------------	
	
//	연달아 3명의 값을 입력해야함
	
//	public static void printMenu() {
//		System.out.println("====== 메인 메뉴 ======");
//		System.out.println("1. 성적입력");
//		System.out.println("2. 성적출력");
//		System.out.println("3. 종료");
//		System.out.print("선택 : ");
//	}
//	
//	public static void inputScore(Student [] stds) {
////		====== 성적 입력 =======
////		국어 : 100
////		영어 : 90
////		수학 : 80
//		
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<stds.length; i++) {
//			stds[i] = new Student();
//			
//			System.out.println("====== 이름 입력 =======");
//			System.out.print("이름 : ");
//			stds[i].name = sc.next();
//			System.out.println("====== 성적 입력 =======");
//			System.out.print("국어 : ");
//			stds[i].kor = sc.nextInt();
//			System.out.print("영어 : ");
//			stds[i].eng = sc.nextInt();
//			System.out.print("수학 : ");
//			stds[i].math = sc.nextInt();
//			
//		}
//
//		
////		stds[0] = new Student();
////		
////		System.out.println("====== 이름 입력 =======");
////		System.out.print("이름 : ");
////		stds[0].name = sc.next();
////		System.out.println("====== 성적 입력 =======");
////		System.out.print("국어 : ");
////		stds[0].kor = sc.nextInt();
////		System.out.print("영어 : ");
////		stds[0].eng = sc.nextInt();
////		System.out.print("수학 : ");
////		stds[0].math = sc.nextInt();
//	}
//	
//	public static void printScore(Student [] stds) {
////		====== 성적 출력 ======
////		국어 : 100
////		영어 : 90
////		수학 : 80
////		총점 : 270
////		평균 : 90.00
//		
//		for(int i=0; i<stds.length; i++) {
//			System.out.println("====== 성적 출력 ======");
//			System.out.printf("이름 : %s\n", stds[i].name);
//			System.out.printf("국어 : %d\n", stds[i].kor);
//			System.out.printf("영어 : %d\n", stds[i].eng);
//			System.out.printf("수학 : %d\n", stds[i].math);
//			System.out.printf("총점 : %d\n", stds[i].getTotal());
//			System.out.printf("평균 : %.2f\n", stds[i].getAvg());
//		}
//	
//		
////		System.out.println("====== 성적 출력 ======");
////		System.out.printf("이름 : %s/n", stds[0].name);
////		System.out.printf("국어 : %d\n", stds[0].kor);
////		System.out.printf("영어 : %d\n", stds[0].eng);
////		System.out.printf("수학 : %d\n", stds[0].math);
//////		System.out.printf("총점 : %d\n", kor+eng+math);
//////		System.out.printf("평균 : %.2f\n", (double)(kor+eng+math)/3);
//	}
//	
//	public static void showGoodBye() {
//		System.out.println("프로그램이 종료되었습니다."); 
//	}
//	
//	public static void printException() {
//		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
//	}
//	
//-----------------------------------------------------------------------------------------
	
}
