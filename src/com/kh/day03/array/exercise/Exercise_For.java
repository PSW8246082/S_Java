package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For {
	
	
	public void forExercise1() {
		
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
				// 1+2+3+4+5+6+7+8+9+10=55
				
				
				
				// 방법1
				int sum = 0;
				
			
					
					for(int i = 1; i <= 10; i++) {
						
						
						sum += i;   
						
						System.out.print(i);
						
						if(i <= 9) {
							System.out.print(" + ");
						} else {
							System.out.print( " = ");
						}
					
						
					
					}
					System.out.print(sum);
				
				
				
				
				
				

				
				//------------------------------------------------------------------
				
				
				
				
				
				
				
				
				
				
//		      방법2
//				int i=0;
//				int sum = 0;
//				
		//	
//					
//					for(i = 1; i <= 10; i++) {
//						
//						
//						sum += i;             
//						
//						if(i < 10) {
//							System.out.print(i+ " + ");
//						} else {
//							System.out.print(i);
//						}
//					
//						
//					}
//					
//					
//				System.out.print( " = " + sum);
					
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void forExercise2() {
		
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
				// 그 수의 구구단을 출력하세요.
				// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
				
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("정수 하나 입력 : ");
				int dan = sc.nextInt();
				
				
				if(dan >= 1 && dan <= 9) {
					

					System.out.println(dan + "단");
					
					for(int i = 1; i < 10; i++) {
						
						System.out.println(dan +" * " + i + " = " + dan*i);
				} 
					

					
				} else {
					System.out.print("1 ~ 9 사이의 양수를 입력해야만 합니다. ");
				}

				
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
