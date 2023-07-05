package com.kh.day08.oop.homework.q6;

public class CardRun {

	public static void main(String[] args) {
		
		//생성자에서 카드번호가 실행되기 때문에  new Card(); 생성될때 카드번호가 추가됨
		Card myCard1 = new Card();
		myCard1.printCardInfo();
		
		Card myCard2 = new Card();
		myCard2.printCardInfo();
		
		Card myCard3 = new Card();
		myCard3.printCardInfo();

	}

}
