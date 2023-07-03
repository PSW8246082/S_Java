package com.kh.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {
	public static void main(String [] args) 
	{
		
		
		//switch 문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램을 작성하라. 
		//에스프레소, 카푸치노, 카페라떼는 3500원이고, 아메리카노는 2000원이다.
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하시겠어요? 가격을 알려드립니다.");
		System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노)");
		System.out.println("주문을 입력해주세요 : ");
		
		String menu = sc.next();
		
		
//		방법1
//		switch(menu){
//		case "에스프레소" : System.out.println("3,500원입니다."); break;
//		case "카푸치노" : System.out.println("3,500원입니다."); break;
//		case "카페라떼" : System.out.println("3,500원입니다."); break;
//		case "아메리카노" : System.out.println("2,000원입니다."); break;
//		default : System.out.println("없는 메뉴입니다."); 
//		}
		
		
		
		
		
//		방법2
		int price = 0;
		switch(menu){
		case "에스프레소" : 
		case "카푸치노" : 
		case "카페라떼" : price = 3500; break;
		case "아메리카노" : price = 2000;; break;
		default : System.out.println("없는 메뉴입니다.");
		}
		if(price != 0) {
			System.out.println(price + "원 입니다.");
		}
		
		
		
		
		
		
		
		
	}
}