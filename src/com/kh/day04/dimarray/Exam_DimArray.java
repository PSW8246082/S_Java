package com.kh.day04.dimarray;

public class Exam_DimArray {
	public static void main(String [] args)
	{
		int num = 0;
		int [] nums = new int[10]; 
		
//		2차원 배열 
//		하나의 값을 지정할때 두개의 인덱스가 필요하다
		int [][] dimNums = new int[2][5];
		
//		dimNums의 크기는 앞의 숫자
//		dimNums[n] 인덱스의 크기는 뒤의숫자
		System.out.println("dimNums의 크기(앞) : " + dimNums.length);
		System.out.println("dimNums 인덱스의 크기(뒤) : " + dimNums[0].length);
		System.out.println("dimNums 인덱스의 크기(뒤) : " + dimNums[1].length);
		
		int [][] arrs = new int[4][4];
		
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;
//		
//		arrs[1][0] = 5;
//		arrs[1][1] = 6;
//		arrs[1][2] = 7;
//		arrs[1][3] = 8;
//		
//		arrs[2][0] = 9;
//		arrs[2][1] = 10;
//		arrs[2][2] = 11;
//		arrs[2][3] = 12;
//		
//		arrs[3][0] = 13;
//		arrs[3][1] = 14;
//		arrs[3][2] = 15;
//		arrs[3][3] = 16;
		
		
		
		
		
		int k= 1;
		
		// 입력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < 4; j++) {
				arrs [i][j] = k;
				k++;
			}
		}
		
		//출력
		for(int j=0; j<arrs.length; j++) {
			for(int i=0; i<arrs[j].length; i++) {
				System.out.print(arrs[j][i] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
