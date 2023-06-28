package com.kh.day03.array;

public class Exam_InsertionSort {
	public static void main(String [] args)
	{
		
//		삽입정렬이란?
//		정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘!
//		배열의 N번 인덱스 값을 0번에서 n-1번 인덱스 까지 비교!
		
//		{2, 5, 4, 1, 3}
//		
//		1) 2 하고 5를 비교했을 때 -> 안바뀌어도 된다.
//		첫번쨰 비교 후 결과 : {2, 5, 4, 1, 3}
//		
//		2) 2번 인덱스와 0번 1번 인덱스 비교 -> 5하고 4는 교환해야함 
//		두번째 비교 후 결과 : {2, 4, 5, 1, 3}
//		
//		3) 3번 인덱스와 그 이하 인덱스 비교 -> 교환 3번 이루어짐
//		세번째 비교 후 결과 : {2, 4, 1, 5, 3}
//		세번째 비교 후 결과 : {2, 1, 4, 5, 3}
//		세번째 비교 후 결과 : {1, 2, 4, 5, 3}
//		
//		
//		4) 5번 인덱스와 그 이하 인덱스 비교 -> 5와 3 / 4와 3 교환(교환 2번 이루어짐)
//		네번째 비교 후 결과 : {1, 2, 4, 3, 5}
//		네번째 비교 후 결과 : {1, 2, 3, 4, 5}

		
		
		
		
		
//		위 과정을 코딩 프로그램으로 바꾸기......
		
		int [] arrs = {2, 5, 4, 1, 3};
		
		
		
//		규칙성 찾기
		
		for(int i = 1; i < arrs.length; i++) {
			
			for(int j = i; j > 0; j--) {
				
				if(arrs[j-1] > arrs[j]) {
					
					int temp = arrs[j];
					arrs[j] = arrs[j-1];
					arrs[j-1] = temp;	
					
				}
				
			}
			
		}
		
		
		
//		배열 출력
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	
		
		
		
		
//------------------------------------------------------------------------		
		
//
//		{2, 5, 4, 1, 3}
//		
//		if(arrs[0] > arrs[1]) {
//			
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;	
//			
//		}
//		
//		if(arrs[1] > arrs[2]) {
//			
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;	
//			
//		}
//		
//		
//		{2, 4, 5, 1, 3}
//		
//		if(arrs[2] > arrs[3]) {
//			
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;	
//			
//		}
//		
//		
//		{2, 4, 1, 5, 3}
//		
//		if(arrs[1] > arrs[2]) {
//			
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;	
//			
//		}
//		
//		{2, 1, 4, 5, 3}
//		
//		if(arrs[0] > arrs[1]) {
//			
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;	
//			
//		}
//		
//		
//		{1, 2, 4, 5, 3}  
//		
//		if(arrs[3] > arrs[4]) {
//			
//			int temp = arrs[4];
//			arrs[4] = arrs[3];
//			arrs[3] = temp;	
//			
//		}
//		
//		
//		{1, 2, 4, 3, 5}  
//		
//		if(arrs[2] > arrs[3]) {
//			
//			int temp = arrs[3];
//			arrs[3] = arrs[2];
//			arrs[2] = temp;	
//			
//		}
//		
//		
//		{1, 2, 3, 4, 5}  
//		
//		계속 비교 진행은 하지만 if문에 걸려서 동작하지 않음..
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}

}
