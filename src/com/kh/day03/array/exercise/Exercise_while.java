package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_while {
	
	public void whileExercise1() {
		
		
//		*참고 :  for(;;) {}   for문으로 무한 반복하는 구문
		
		
		
		
//		while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 
//		입력한 수의 합을 출력하시오.
		
		//정수 하나 입력 : 3
		//정수 하나 입력 : 4
		//정수 하나 입력 : 7
		//정수 하나 입력 : -1
		//입력하신 수의 합은 14 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int input = 0;
		

		
//	   방법1	
//		while(true) {
//			System.out.print("정수를 하나 입력하세요. : ");
//			input = sc.nextInt();
//			
//			if(input != -1) {
//				sum += input;
//			} else {
//				break;
//			}
//		}
//		System.out.println("입력하신 수의 합은 : " + sum);
		
		
		
		
		
		
		
		
		
//		-----------------------------------------------------------------------
	
		
		
		
//		방법2
//		System.out.print("정수를 하나 입력하세요. : ");
//		input = sc.nextInt();
//		while(input != -1) {
//			sum += input;
//			System.out.print("정수를 하나 입력하세요. : ");
//			input = sc.nextInt();
//		}
//		System.out.println("입력하신 수의 합은 : " + sum);
//		
		
		
		
		
		
		
		
		
		
//------------------------------------------------------------------------		
		
		
		
		
		
		
//		방법3
		while(input != -1) {
			System.out.print("정수 하나 입력 : ");
			input = sc.nextInt();
			sum += input;
		}
		System.out.println("입력하신 수의 합은 " + (sum+1) + "입니다.");
		
		
		
		
		
	}
	
	
	
	
	
	public void whileExercise2() {
		
		
//		while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
//		1 ~ 100 사이의 홀수의 합 : 000
		
		
		
		
		
//		int i = 0;
//		int sum = 0;
//		
//		
//		while(i < 100) {
//			
//			sum += i;
//			i += 2;  //2씩 증가
//		}
//		
//		
//		System.out.println("1 ~ 100 사이의 홀수의 값 : " + sum);
//		
//		
//	}
//
//}




//---------------------------------------------------------------------------------




//		오류 확인 왜 값이 다르지...
		int i = 0;
		int sum = 0;
		
		
		while(i < 100) {
			
			if(i % 2 != 0) {
				
			sum += i;
			
		}	
			i++;
	}
		
		System.out.println("1 ~ 100 사이의 홀수의 값 : " + sum);
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
