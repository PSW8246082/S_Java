package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_Array2 {
	public static void main(String [] args)
	{
		
//		배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 
//		평균을 구하는 프로그램을 작성하라.
		
		Scanner sc = new Scanner(System.in);
		int [] arrs = new int[5];
		
		for(int i = 0; i < arrs.length; i++) 
		{
			arrs[i] = sc.nextInt();
		}
		
		
//		배열에 저장된 값을 이용하여 평균 구하기
//		for, arrs, length, typeTrans, 누적합 등을 이용하여 구하기
		
		int sum = 0;
		
		for(int j = 0; j < arrs.length; j++)
		{
			sum += arrs[j];
		}
		
		
//		소숫점이 나올 수 있도록 강제 형변환 해주기(double)
		System.out.println("평균 : " +  (double)sum/arrs.length);
		
		
		
		
		
		
	}
	
}
