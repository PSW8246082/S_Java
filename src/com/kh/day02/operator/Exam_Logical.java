package com.kh.day02.operator;

public class Exam_Logical {
	public static void main(String [] args)
	{
		System.out.println("논리연산자 예제");
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4;
		
		//남자이면서 평균 평점 4.3이상인 사람
		result1 = (num1 ==  num2) && (num1 < num2);  //false
		
		//컴퓨터공학과 또는 경영학과인 사람
		result2 = (num1 <  num2) || (num1 == num2);  //둘다 false
		
		result3 = (num1 >  num2) && (num1 != num2);  //둘다 true
		result4 = (num1 >  num2) || (num1 == num2);  // 앞의 값이 true -> true
		
		System.out.println("result1의 결과값 : " +  result1);
		System.out.println("result2의 결과값 : " +  result2);
		System.out.println("result3의 결과값 : " +  result3);
		System.out.println("result4의 결과값 : " +  result4);
		
		
		
		System.out.println();
		
		
		
		// 연습문제 1-2
		
		// && 인 경우 앞이 false면 뒤는 계산하지 않고 값이 그대로 내려온다!!
		// || 인 경우 앞이 true면 뒤는 계산하지 않고 값이 그대로 내려온다!!
		
		int aNum = 70;
		int bNum = 55;
		
		result1 = (aNum == bNum) || (aNum++ < 100);
		System.out.println("aNum : " + aNum + " bNum : " +bNum + " result : " + result1);
		result2 = (aNum < bNum) && (--bNum < 55);
		System.out.println("aNum : " + aNum + " bNum : " +bNum + " result : " + result2);
		result3 = (aNum != bNum) && (bNum-- < aNum++);
		System.out.println("aNum : " + aNum + " bNum : " +bNum + " result : " + result3);
		result4 = (aNum++ != bNum) || (bNum++ >= 85);
		System.out.println("aNum : " + aNum + " bNum : " +bNum + " result : " + result4);
		
		
		
		
		
				
		
	}

}
