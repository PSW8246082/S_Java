package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Student {
	String name;
	static int kor;
	static int eng;
	static int math;
	
	
	
	public static void intputScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 성적 입력 ====");
		System.out.print(" 국어 : " );
		Student.kor = sc.nextInt(); // 웅니 kor eng math 변수 선언 안됐어용 선언부터해주셔야해용
		System.out.print(" 영어 : ");
		Student.eng = sc.nextInt();
		System.out.print(" 수학 : ");
		Student.math = sc.nextInt();
		}
	
	
	
	public static void printScore() {
	
	int sum = Student.kor + Student.eng + Student.math;
	
	System.out.println("===== 성적 출력 ====");
	System.out.println("국어 : " + Student.kor);
	System.out.println("영어 : " + Student.eng);
	System.out.println("수학 : " + Student.math);
	System.out.println("총점 : " + sum); //왜 문자화 되어서 더해지지?
	System.out.println("평균 : " + (double)(sum)/3);
}

}
