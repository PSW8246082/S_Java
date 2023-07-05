package com.kh.day08.oop.homework.q6;

public class Card {

	int cardNum;
	static int serialNum = 10000;  //여기서 계속 초기화되면 안됨. 증가된 값을 어딘가에 저장해줘야함
//static을 추가해줘야 다른곳에서도 사용할수있고..?(전역변수) 초기화되지 않고 숫자가 증가됨...뭔소리야
//사라지지 않고 유지가 됨...
//static으로 증가된 값을 저장해주는듯...진경이 지연이 쏘 감사..ㅎ	
	
	//입력받은 카드번호 자동으로 증가하게 해줌.
	public Card() {
		 cardNum = serialNum;
		 serialNum++;
	}
	
	
	public void printCardInfo() {
		System.out.println(this.cardNum + "입니다.");
	}
}
