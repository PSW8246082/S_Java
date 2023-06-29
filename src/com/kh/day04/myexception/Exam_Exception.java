package com.kh.day04.myexception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String [] args) {
		
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 하나 입력 : ");
			int input1 = sc.nextInt();
			System.out.println("정수 하나 더 입력 : ");
			int input2 = sc.nextInt();
			System.out.println("나눠드릴게요~!");
			int result = input1 / input2;
			System.out.printf("몫은 %d 입니다~! ", result);
		} 
		catch(ArithmeticException e)
		{
//			오류메세지 그대로 출력해줌
//			e.printStackTrace();
//			System.out.println("0으로 나누기 오류");
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
//		이렇게만 작성하면 오류 뜸
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at com.kh.day04.myexception.Exam_Exception.main(Exam_Exception.java:13)
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 하나 입력 : ");
//		int input1 = sc.nextInt();
//		System.out.println("정수 하나 더 입력 : ");
//		int input2 = sc.nextInt();
//		System.out.println("나눠드릴게요~!");
//		int result = input1 / input2;
//		System.out.printf("몫은 %d 입니다~! ", result);
		
	}

}
