package com.kh.day02.loop.exercise;

public class Exercise_While2 {
	public static void main(String [] args)
	{
		
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