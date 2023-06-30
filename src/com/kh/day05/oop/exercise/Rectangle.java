package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Rectangle {
	
//	너비와 높이를 입력 받아 사각형의 넓이를 출력하는 프로그램을 작성하라. 
//	너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 
//	Rectangle 클래스를 만들어라.

//	강사님 정답
	
//	------------------------------------필드
	public int width = 0;
	public int height = 0;
	
	
//	--------------------------생성자-----------
	
	public Rectangle() {
			
		}
	
	
	
//	---------------------------------- 메소드---------------------
	public int getArea() {
		
		return width * height;
		
	}
	
	
	
	
	
//	------------------------------------------------------------------------------------
//	내 문제풀이 (오답..ㅎ)
	
//// ---------------------- 필드 ------------------------
//	int width = 0;
//	int height = 0;
//	
//	Scanner sc = new Scanner(System.in);
//	
//	width = sc.nextInt();
//	System.out.println("너비를 입력해주세요.");
//	
//	height = sc.nextInt();
//	System.out.println("높이를 입력해주세요.");
//	
//	
////-------------------- 생성자 ---------------------
//	public Rectangle() {
//		
//	}
//		
//		
////------------------------- 메소드----------------------
//	
//	public int getArea() {
//		return width * height;
//	}
	
	
	
	
	
	
}
