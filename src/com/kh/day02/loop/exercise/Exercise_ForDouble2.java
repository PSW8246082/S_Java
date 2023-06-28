package com.kh.day02.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args)
	{
		
		
		//0시 0분부터 23시 59분까지 출력하기
		
		for(int k = 0; k < 24; k++) {
			for(int h = 0; h<60; h++) {
				
//				System.out.println(k + "시 " + h + "분");
				
				//자리 수 맞춰서 출력하기 printf
				System.out.printf("%2d시 %2d분\n", k, h);
				
//				\n은 개행
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
