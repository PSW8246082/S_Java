package com.kh.day08.oop.homework.q5;

public class StarCafe extends Cafe{
	
	@Override
	public void makeCoffee(int money) {
		
		if(money == Menu.STAR_AMERICANO) {
			System.out.println("주문하신 아이스 아메리카노 한잔 나왔습니다.");
		}
		else if(money == Menu.STAR_LATTE) {
			System.out.println("주문하신 아이스 카페라떼 한잔 나왔습니다.");
		}
		else {
			System.out.println("다시 주문해주세요.");
		}
		
	}
}
