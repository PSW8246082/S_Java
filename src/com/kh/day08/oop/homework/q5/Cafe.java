package com.kh.day08.oop.homework.q5;

public abstract class Cafe {
	
	String name;
	
	
	public Cafe() {
		
	}
	public Cafe(String name) {
		this.name = name;
	}
	
	
	abstract public void makeCoffee(int money); //{
//		사실상 카페마다 가격이 다르기 때문에 필요없음  -> 추상클래스로 만들 수 있음
//		if(money == 4000) {
//			System.out.println("주문하신 아이스 아메리카노 한잔 나왔습니다.");
//		}
//		else if(money == 4500) {
//			System.out.println("주문하신 아이스 카페라떼 한잔 나왔습니다.");
//		}
//		else {
//			System.out.println("다시 주문해주세요.");
//		}
	//}

}
