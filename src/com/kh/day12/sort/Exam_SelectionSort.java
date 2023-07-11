package com.kh.day12.sort;

public class Exam_SelectionSort {

	public static void main(String[] args) {
		
		//선택정렬
		int [] nums = {5, 7, 2, 1, 4};

//		첫번째랑 제일 작은 수랑 비교를 해서 제일 작은 수를 맨왼쪽으로 보내줌
//		인덱스 값을 저장하는 min
		
		// 1) {1, 7, 2, 5, 4}
		
		// 2) {1, 2, 7, 5, 4}
		
		// 3) {1, 2, 4, 5, 7}
		
		// 4) {1, 2, 4, 5, 7}
		
		
		int min;
		
		for(int i = 0; i <nums.length; i++) {
			min = i;
			for(int j = i+1; j < nums.length; j++) {
				if(nums[min] > nums[j]) {
					min = j;
				}
			}
			int temp = nums[min];
			nums[min] = nums[i];
			nums[i] = temp;
		}
		
		
		
		for(int i : nums) {
			System.out.print(i + " ");
		}
		
		

	

		

	}

}
