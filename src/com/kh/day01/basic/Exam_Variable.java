package com.kh.day01.basic;

public class Exam_Variable {
	public static void main(String [] args)
	{
		final double PI = 3.14;
		//final을 썼기 때문에 상수가 된 것.
		double radius = 10.0;
		//원 넓이
		double circleArea = radius * radius * PI;
		//원의 면적 출력
		System.out.println("원의 면적 : " + circleArea);
		
		
		
		char a = 'A';
		char b = 'B';
		System.out.println(a+b);
	}
}
