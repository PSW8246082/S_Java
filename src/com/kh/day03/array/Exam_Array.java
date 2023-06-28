package com.kh.day03.array;

public class Exam_Array {
	public static void main(String [] args) 
	{
//		변수의 선언
		int num;
		
//		변수의 초기화
		num = 0;
//		int num = 0;
		
//		같은 데이터 타입만 순차적으로 배열에 담을 수 있음
//		인덱스는 0부터 시작한다.
		
//		배열의 선언 (2가지 방식)
//		int [] nums;
		int nums[];  
		
//		배열의 할당
		nums = new int[10];  
		
		
//		nums는 배열의 주소이다.
//		[]는 연산이고 숫자가 들어가서 한칸씩 이동하여 값을 가져온다.
		
		nums[0] = 2;
		System.out.println(nums[0]);
		System.out.println("배열의 크기 : " +  nums.length);
		
		
//		int의 기본값 : 0,  String의 기본값 : null
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
