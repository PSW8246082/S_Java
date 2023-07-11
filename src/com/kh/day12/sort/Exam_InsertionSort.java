package com.kh.day12.sort;

public class Exam_InsertionSort {

	public static void main(String[] args) {
		
		int [] nums = {5, 7, 2, 1, 4};
		
//		왼쪽이랑 비교를 해서 왼쪽이 크면 바꿈, 작으면 왼쪽으로 감.
//		비교 횟수는 증가함
//		위치도 증가
//		비교하는 인덱스는 감소
		
		//삽입정렬
		
		// 1) {5, 7, 2, 1, 4}
		
		// 2) {5, 2, 7, 1, 4}
		// 2) {2, 5, 7, 1, 4}
		
		// 3) {2, 5, 1, 7, 4}
		// 3) {2, 1, 5, 7, 4}
		// 3) {1, 2, 5, 7, 4}
		
		// 4) {1, 2, 5, 4, 7}
		// 4) {1, 2, 4, 5, 7}  정렬이 끝났어도 동작함.
		// 4) {1, 2, 4, 5, 7}
		// 4) {1, 2, 4, 5, 7}

		
		//삽입정렬
		for(int i = 1; i < nums.length; i++) {
			for(int j = i; j > 0; j--) {
				if(nums[j-1] > nums[j]) {
					int temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		
		
		
		//출력
		for(int i : nums) {
			System.out.print(i + " ");
		}
		
		
		

	}

}
