package com.kh.day12.sort;

public class Exam_BubbleSort {

	public static void main(String[] args) {
		
		int [] nums = {5, 7, 2, 1, 4};
		
//		5,7 / 7,2 / 2,1 / 1,4 비교..제일 큰 수 가 오른쪽에 가게 된다.
		
		// {5, 7, 2, 1, 4}
		// {5, 2, 7, 1, 4}
		// {5, 2, 1, 7, 4}
		// {5, 2, 1, 4, 7}
		
		// {2, 5, 1, 4, 7}
		// {2, 1, 5, 4, 7}
		// {2, 1, 4, 5, 7}
		
		
		// {1, 2, 4, 5, 7}
		// {1, 2, 4, 5, 7} 정렬이 끝나도 동작함
		
		// {1, 2, 4, 5, 7}
		
		
		//버블정렬(가장쉬움)(증가만 하면 됨)
		for(int i = 0; i < nums.length-1; i++) {
			for(int j = 0; j< (nums.length-1)-i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
	
		for(int i : nums) {
			System.out.print(i + " ");
		}
		
	
		
		

	}

}
