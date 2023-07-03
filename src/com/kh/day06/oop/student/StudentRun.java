package com.kh.day06.oop.student;

import java.util.Scanner;

public class StudentRun {
	
	static int index;
	
	public static void main(String [] args) {
		// 학생 성적 확인 프로그램
		// 1. 학생 성적 입력
		// 2. 학생 성적 출력
		// 3. 재평가 여부 확인
		// 4. 프로그램 종료
		// 메뉴 입력 : 4
		
		// 1. 선택시
		// 1번째 학생 정보 입력
		// 학생 이름 입력 : 일용자
		// 1차 점수 입력 : 60
		// 2차 점수 입력 : 55
		// => 1명씩 입력받도록 하거나
		// 2명 한꺼번에 입력받도록 하세요
		
		// 2.선택시
		// 1번째 학생 정보 출력
		// 일용자 학생의 점수는
		// 1차 점수 : 60, 2차 점수 : 55 입니다.
		
		
		// 3.선택시
		// 1번째 일용자 학생의 확인 결과
		
		// 통과했습니다.
		
		// 1차시험 재평가 대상자입니다.
		
		// 2차시험 재평가 대상자입니다.
		
		// 1차시험 재평가 대상자입니다.
		// 2차시험 재평가 대상자입니다.
		
		
		// 4.선택시
		// 프로그램이 종료되었습니다.
		
		
		//재평가 기준 설명
		// 0. 재평가의 여부는 1차, 2차가 각각 다르다.
		// 1. 점수가 40점 미만인 경우 과락으로 재평가  대상자가 된다.
		// 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 통과한다.
		// 3. 1차 점수와 2차 점수의 평균이 60점 미만인 경우 60점 미만의 과목은 재평가를 본다.
		// 1차 점수 : 60점, 2차 점수 : 60점
		// 1차 점수 : 100점, 2차 점수 : 20점(2차만 재평가)
		// 1차 점수 : 59점, 2차 점수 : 60점(1차만 재평가);
		// 결론 : 평균 60점이 넘어야함, 넘었는데 재평가보는 경우있음.
		// 평균 60점이 넘지 않으면 재평가(60점 미만만 재평가)
		
		
		Student [] std = new Student[2];
		
		
		
		finish :
		while(true) {
			
			int inputNum = printMenu();
			
			switch(inputNum) {
			case 1 : 
				inputScore(std);
				break;
			case 2 : 
				printScore(std);
				break;
			case 3 : 
				checkPass(std);
				break;
			case 4 : System.out.println("프로그램이 종료되었습니다.");
				break finish;	
			}
		}
	
		
		
		
		
		
		
		
//	------------메인 중괄호	
	}
	
	
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("=======메뉴======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");	
		System.out.print("메뉴 입력 : ");
		
		int inputNum = sc.nextInt();
		System.out.println(1);
	    System.out.println('A');
	    System.out.println("Hello Java");
	    System.out.println(true);
		return inputNum;
		
	}

	
	public static void inputScore(Student [] std) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<std.length; i++) {
			System.out.println();
			System.out.println("==="+(i+1)+"번째 학생 정보 입력===");
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("1차 점수 입력 : ");
			int firstScore = sc.nextInt();
			System.out.print("2차 점수 입력 : ");
			int secondScore = sc.nextInt();
			
			std[i] = new Student();
			std[i].setName(name);
			std[i].setFirstScore(firstScore);
			std[i].setSecondScore(secondScore);
		}
	}
	
	
	public static void printScore(Student std[]) {
		for(int i=0; i<std.length; i++) {
			System.out.println();
			System.out.println("===첫번째 학생 정보 입력===");
			System.out.println(std[i].getName() + "학생의 1차 점수 : "
					+ std[i].getFirstScore() + "점, 2차 점수 : " 
					+ std[i].getSecondScore() + "점 입니다.");	
		}
	}
	
	

	
	
	public static void checkPass(Student std[]) {
		for(int i=0; i<std.length; i++) {
			
			System.out.println();
			System.out.println("===재평가 여부 확인===");
			System.out.println((i+1)+"번째 " + std[i].getName() + " 학생의 확인 결과");
			
			
			if(std[i].getAvg() >= 60) {
				if(std[i].getFirstScore() < 40) {
					System.out.println("1차시험 재평가 대상자입니다.");
				} 
				else if (std[i].getSecondScore() < 40) {
					System.out.println("2차시험 재평가 대상자입니다.");
				} 
				else {
				System.out.println("통과했습니다.");
			    }
				
			} else {
				if(std[i].getFirstScore() < 60) {
					System.out.println("1차시험 재평가 대상자입니다.");
				}	
				if (std[i].getSecondScore() < 60) {
					System.out.println("2차시험 재평가 대상자입니다.");
				} 
			}
	
			
	  }
	}
	
	
	
	
	

	
	
//---------------------------------------------------------------------------------------------
	//내 문제풀이..
	
//	public static void checkPass(Student std[]) {
//		for(int i=0; i<std.length; i++) {
//			System.out.println();
//			System.out.println("===재평가 여부 확인===");
//			System.out.println((i+1)+"번째 " + std[i].name + " 학생의 확인 결과");
//		
//			
//			if(std[i].getAvg()> 60) {
//				System.out.println("통과했습니다.");
//			} 
//			else if(std[i].firstScore < 60 && std[i].secondScore >= 60) {
//				System.out.println("1차시험 재평가 대상자입니다.");
//			}
//			else if(std[i].firstScore > 40 && std[i].secondScore < 40) {
//				System.out.println("2차시험 재평가 대상자입니다.");
//			}
//			else if(std[i].firstScore < 40 && std[i].secondScore < 40) {
//				System.out.println("1차 / 2차시험 재평가 대상자입니다.");
//			}
//		}	
//	}
//	
	
	
//	--------------------------------------------------------
	//내 문제풀이..오답..ㅎ
//	public static void inputScore(Student std[]) {
//		Scanner sc = new Scanner(System.in);
//		
//		 std[index] = new Student();
//		 
//		 System.out.println("=======이름 입력======");
//		 std[index].name = sc.next();
//		 
//		 System.out.print("첫번째 성적 : ");
//		 std[index].firstScore = sc.nextInt();
//		 
//		 System.out.print("두번째 성적 : ");
//		 std[index].secondScore = sc.nextInt();
//		
//		 if(index < std.length) {
//			 index++;
//		 }
//	}
//	--------------------------------------------------------	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	----------클래스 중괄호
}
