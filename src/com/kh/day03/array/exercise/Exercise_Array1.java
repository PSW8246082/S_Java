package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Array1 {
	
	
	public void exercise1() {
		
//		양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int [] nums = new int[5];
		
//		비교를 위한 변수 선언
		int max = 0;
		
//		for문으로 작성하기
//		nums[0] = sc.nextInt(); 
//		nums[1] = sc.nextInt(); 
//		nums[2] = sc.nextInt(); 
//		nums[3] = sc.nextInt(); 
//		nums[4] = sc.nextInt(); 
		
		
//		* 배열에 입력받은 값을 저장하는 방법
//		* 가장 큰 수 출력하는 방법
		
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			
			if(nums[i] > max) {
				max = nums[i];
			}
			
		}
		System.out.println("가장 큰 수는 " + max + " 입니다.");
		
	}
	
	
	
	
	
	
	
	public void exercise2() {
		
//		배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 
//		평균을 구하는 프로그램을 작성하라.
		
		Scanner sc = new Scanner(System.in);
		int [] arrs = new int[5];
		
		for(int i = 0; i < arrs.length; i++) 
		{
			arrs[i] = sc.nextInt();
		}
		
		
//		배열에 저장된 값을 이용하여 평균 구하기
//		for, arrs, length, typeTrans, 누적합 등을 이용하여 구하기
		
		int sum = 0;
		
		for(int j = 0; j < arrs.length; j++)
		{
			sum += arrs[j];
		}
		
		
//		소숫점이 나올 수 있도록 강제 형변환 해주기(double)
		System.out.println("평균 : " +  (double)sum/arrs.length);
		
	}
	
//----------------------------------------------------------------------------------
	
	
//	* charAt() : String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
	
	
	public void arryCopyExercise() {
		
//		사용자에게 주민번호를 입력받은 후
//		성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오.
//		ex) 230515 - 1231514    ->  230515 - 1******
//		ex) 231026 - 1231515    ->  231026 - 1******	
		
		char [] origin = new char[14];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력해주세요.");
		
//		1) 먼저 문자열로 받음
		String memberNum = sc.next();
		
//		주민번호를 문자열(String)로 출력
		for(int i = 0; i < origin.length; i++) {
//			2) 문자열의 각각 숫자들을 charAt(i)으로 인덱스 자리에 넣어줌
			origin[i] = memberNum.charAt(i);
		}
		
		
//		마스킹 한 값 넣어줄 곳 copy
//		깊은 복사
		char [] copy = new char[14];
		
		for(int i = 0; i < origin.length; i++) {
			if(i < 8) {
//				성별자리 전까지 차례대로 값을 대입
				copy[i] = origin[i];
			} else {
//				성별자리 이후 *로 값 대입
				copy[i] = '*';
			}
		}
	

		
		
//		주민번호를 문자열(String)로 출력
//		for(int i = 0; i < origin.length; i++) {
//			System.out.print(origin[i]);
//		}
		
//		마스킹 후 출력
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}



		
	}
	
//---------------------------------------------------------------------------------------	
	
//	어려움.
	
	public void lottoExercise() {
		
//		로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
//		단, 결과는 오름차순으로 정렬
//		로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		

		
		int [] lottoNums = new int[6];
		Random rand = new Random();
//		temp는 if문 안에 왼쪽에 있는 값이 지워지기 전에 킵해놓음
		int temp = 0; 
		
		

		
		
	
		
		
	
		
//		1~44까지 랜덤한 수가 lottoNums[0]에 들어감
		lottoNums[0] = rand.nextInt(45)+1;
		lottoNums[1] = rand.nextInt(45)+1;
		lottoNums[2] = rand.nextInt(45)+1;
		lottoNums[3] = rand.nextInt(45)+1;
		lottoNums[4] = rand.nextInt(45)+1;
		lottoNums[5] = rand.nextInt(45)+1;
		
	
		
//		중복없이 1 ~ 45 사이의 랜덤한 수를 6개 뽑는것. 밑에 주석에서 for문 확인
		for(int i = 0; i < 6; i++) {
			lottoNums[i] = rand.nextInt(45)+1;
			
			for(int e = 0; e < i; e++) {
				if(lottoNums[i] == lottoNums[e]) {
					//값이 중복되면 다시 뽑아야함
					i--;
					break;
				}
			}
			
		}
			
		
		
			
////			----------------------------------
//			if(lottoNums[1] == lottoNums[0]) {
//				//값이 중복되면 다시 뽑아야함
//			}
////			----------------------------------1번째
//			if(lottoNums[2] == lottoNums[1]) {
//				
//			}
//			if(lottoNums[2] == lottoNums[0]) {
//							
//			}
////			----------------------------------2번째
//			if(lottoNums[3] == lottoNums[2]) {
//				
//			}
//			if(lottoNums[3] == lottoNums[1]) {
//							
//			}
//			if(lottoNums[3] == lottoNums[0]) {
//				
//			}
////			----------------------------------3번째
////			계속 이어짐..
			
			
		
//		버블정렬을 이용하여 오름차순 만들기!
//		버블정렬은 for의 변수가 증가하기만 하면 됨 그래서 쉬움!
//		단, 안에 있는 for문의 조건식의 최대값은 감소(-i)해야함!
		for(int i = 0; i < lottoNums.length-1; i++) {
			for(int j = 0; j < (lottoNums.length-1)-i; j++) {
				
				if(lottoNums[j] > lottoNums[j+1]) {
					temp = lottoNums[j];
					lottoNums[j] = lottoNums[j+1];
					lottoNums[j+1] = temp;
				}
			}
		}
		
		
		
		
//		출력
		for(int k=0; k<lottoNums.length; k++) {
			System.out.print(lottoNums[k] +" ");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
//---------------------------------------------------------------------------------
	
	
	public static void main(String [] args)
	{
		
		 
		
	}
	
	
	
	
	
	
	
	
	
	

}
