package com.kh.day08.oop.abstractpkg.exercise;

import java.util.Scanner;

public class GoodCalc extends Calculator{
	
//	The type GoodCalc must implement the inherited abstract method Calculator.add(int, int)
//	오버라이딩 하세요.
	
//	추상화 해보세요..
//	1. extends붙이기
//	2. 오버라이딩 하기(GoodCalc 빨간색 밑줄에 마우스 가져가면 add 할 수 있음!)
	
	

	@Override
	public int add(int a, int b) {
		// a, b 를 합하여 리턴
		
//		int sum = a + b;
//		return sum;
		
		return a+b;  //짧게 쓰는법
	}

	@Override
	public int substract(int a, int b) {
		// a, b 를 빼서 리턴
		
//		int minus = a - b;
//		return minus;
		
		return a-b;  //짧게 쓰는법
	}

	@Override
	public double average(int[] a) {
		// 배열을 입력받아 평균을 구한 뒤 그 값을 리턴
		// 평균 = 전체합 / 갯수
		// 전체합은 배열에서 하나씩 꺼내서 합해줘야 하므로 누적합 해야함
		// 누적합 => sum += num;
		
		int sum = 0;
		
		for(int i=0; i < a.length; i++) 
			sum += a[i];
			double avg = sum / (double)a.length;
			return avg;
		
		
	}
	


}
