package com.kh.day03.array;

public class Exam_ArraySoft {
	
	public static void main(String [] args) 
	{
		
//		{ 1, 3, 6, 10, 4, 7, 5, 2, 9, 8 }
		
//		정렬 알고리즘의 종류
//		1. 삽입 정렬
//		2. 선택 정렬
//		3. 버블 정렬
//		4. 퀵 정렬
//		5. ....

		
		int num1 = 5;
		int num2 = 15;
		
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		
		num1 = num2;      //num1 : 15
		num2 = num1;      //num2 : 15
		
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		
//		두 개의 자리를 바꿔줄 때는 임시변수(temp)가 반드시 필요하다.
		int temp = num1;  //temp : 5
		num1 = num2;      //num1 : 15
		num2 = num1;      //num2 : 15
		
		
		
		
		
		
//		3, 2, 1 이 되도록 바꿔보시오.
		
		int [] nums = {2, 1, 3};
		
//		오답
//		int temp1 = nums[0];
//		int temp2 = nums[1];
//		int temp3 = nums[2];
//		
//		System.out.println(temp3 + temp1 + temp2);
		
		temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		
		
		System.out.println();
		
		
		temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
