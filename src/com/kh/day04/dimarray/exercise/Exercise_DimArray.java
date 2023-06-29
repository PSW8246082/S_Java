package com.kh.day04.dimarray.exercise;

public class Exercise_DimArray {
	
	public void exercise1()
	{	
//		 5, 4, 3, 2, 1,
//		 10, 9, 8, 7, 6,
//		 15,14,13,12,11,
//		 20,19,18,17,16,
//		 25,24,23,22,21,
		
		int[][] arry1 = new int[5][5];
		int k =1;
		
//		arry1[0][4] = 1;
//		arry1[0][3] = 2;
//		arry1[0][2] = 3;
//		arry1[0][1] = 4;
//		arry1[0][0] = 5;
//		
//		arry1[1][4] = 6;
//		arry1[1][3] = 7;
//		arry1[1][2] = 8;
//		arry1[1][1] = 9;
//		arry1[1][0] = 10;
//		
//		arry1[2][4] = 11;
//		arry1[2][3] = 12;
//		arry1[2][2] = 13;
//		arry1[2][1] = 14;
//		arry1[2][0] = 15;
		
//		입력
		for(int i=0; i<arry1.length; i++) {
			for(int j=arry1.length-1; j>=0; j--) {
				arry1[i][j] = k;
				k++;
			}
		}
		
		 
//		출력
			for(int j=0; j<arry1.length; j++) {
				for(int i=0; i<arry1.length; i++) {
					System.out.printf("%2d,", arry1[j][i]);
				}
				System.out.println();
			}
			
	}
	
//-------------------------------------------------------------------------	
	
	public void exercise2()
	{
//		 5,10,15,20,25,
//		 4, 9,14,19,24,
//		 3, 8,13,18,23,
//		 2, 7,12,17,22,
//		 1, 6,11,16,21,
		
		int[][] arry1 = new int[5][5];
		int k =1;
		
//		arry1[4][0] = 1;
//		arry1[3][0] = 2;
//		arry1[2][0] = 3;
//		arry1[1][0] = 4;
//		arry1[0][0] = 5;
//		
//		arry1[4][1] = 6;
//		arry1[3][1] = 7;
//		arry1[2][1] = 8;
//		arry1[1][1] = 9;
//		arry1[0][1] = 10;
//		
//		arry1[4][2] = 11;
//		arry1[3][2] = 12;
//		arry1[2][2] = 13;
//		arry1[1][2] = 14;
//		arry1[0][2] = 15;
		
//		입력
		for(int j=0; j<arry1.length; j++) {
			for(int h=arry1.length-1; h>=0; h--) {
				arry1[h][j] = k;
				k++;
			}
		}
		
		
//		출력
			for(int j=0; j<arry1.length; j++) {
				for(int i=0; i<arry1.length; i++) {
					System.out.printf("%2d,", arry1[j][i]);
				}
				System.out.println();
			}
		
		
	}
	
//---------------------------------------------------------------------------	
	
	public void exercise3()
	{
//		 1, 6,11,16,21,
//		 2, 7,12,17,22,
//		 3, 8,13,18,23,
//		 4, 9,14,19,24,
//		 5,10,15,20,25,
//		 
		int[][] arry1 = new int[5][5];
		int k =1;
		
//		arry1[0][0] = 1;
//		arry1[1][0] = 2;
//		arry1[2][0] = 3;
//		arry1[3][0] = 4;
//		arry1[4][0] = 5;
//		
//		arry1[0][1] = 6;
//		arry1[1][1] = 7;
//		arry1[2][1] = 8;
//		arry1[3][1] = 9;
//		arry1[4][1] = 10;
//		
//		arry1[0][2] = 11;
//		arry1[1][2] = 12;
//		arry1[2][2] = 13;
//		arry1[3][2] = 14;
//		arry1[4][2] = 15;
		
//		입력
		for(int h=0; h<arry1.length; h++) {
			for(int s=0; s<arry1.length; s++) {
				arry1[s][h] = k;
				k++;
			}
		}
		
		
//		출력
			for(int j=0; j<arry1.length; j++) {
				for(int i=0; i<arry1.length; i++) {
					System.out.printf("%2d,", arry1[j][i]);
				}
				System.out.println();
			}
		
	}
	public void exercise4()
	{
		int[][] arry1 = new int[5][5];
		int k =1;
		
//		짝수 : 증가 / 홀수 : 감소
		
//		1, 2, 3, 4, 5,
//		10, 9, 8, 7, 6,
//		11,12,13,14,15,
//		20,19,18,17,16,
//		21,22,23,24,25,
		
//		arry1[0][0] = 1;
//		arry1[0][1] = 2;
//		arry1[0][2] = 3;
//		arry1[0][3] = 4;
//		arry1[0][4] = 5;
//		
//		arry1[1][4] = 1;
//		arry1[1][3] = 2;
//		arry1[1][2] = 3;
//		arry1[1][1] = 4;
//		arry1[1][0] = 5;
//		
//		arry1[2][0] = 11;
//		arry1[2][1] = 12;
//		arry1[2][2] = 13;
//		arry1[2][3] = 14;
//		arry1[2][4] = 15;
//		
//		arry1[3][4] = 16;
//		arry1[3][3] = 17;
//		arry1[3][2] = 18;
//		arry1[3][1] = 19;
//		arry1[3][0] = 20;
//		
//		arry1[4][0] = 11;
//		arry1[4][1] = 12;
//		arry1[4][2] = 13;
//		arry1[4][3] = 14;
//		arry1[4][4] = 15;
		
//		입력
		for(int j=0; j<arry1.length; j++) {
			if(j % 2 == 0) {
				for(int i=0; i<arry1.length; i++) {
					arry1[j][i] = k;
					k++;
				}	
			} else {
				for(int i=arry1.length-1; i>=0; i--) {
					arry1[j][i] = k;
					k++;
				}	
			}
			
		}
		
		
//		출력
			for(int j=0; j<arry1.length; j++) {
				for(int i=0; i<arry1.length; i++) {
					System.out.printf("%2d,", arry1[j][i]);
				}
				System.out.println();
			}
	}
	
//------------------------------------------------------------------------------------	
	
	public void exercise5() 
	{
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		
//		double [][] score = new double[4][2];
		double sum = 0; 
		
		double [][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		
//		score[0][0] = 3.3; 
//		score[0][1] = 3.4;
//		
//		score[1][0] = 3.5; 
//		score[1][1] = 3.6;
//		
//		score[2][0] = 3.7; 
//		score[2][1] = 4.0;
//		
//		score[3][0] = 4.1; 
//		score[3][1] = 4.2;
		
		
//		내가푼것
//		for(int j=0; j<score.length; j++) {
//			for(int i=0; i<score[j].length; i++) {
//				sum += score[j][i];
//			}
//		}
//		System.out.println("4년 전체 평점 평균은 : " + (double)sum/(score.length*score[0].length));
	
		
		
		
		
////		학원정답
		for(int j=0; j<score.length; j++) {
		for(int i=0; i<score[j].length; i++) {
			sum += score[j][i];
		}
		
	}
		
		int frontLength = score.length;
		int backLength = score[0].length;
		double result = sum / (frontLength * backLength);
//	System.out.printf("4년 전체 평균 : %.2f\n", result);
	System.out.println("4년 전체 평점 평균은 : " + result);
		
		

		
		
	}

}
