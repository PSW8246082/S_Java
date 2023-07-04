package com.kh.day07.oop.point;


public class ColorPoint extends Point {
//		Point를 확장해줌
		
		private String color;
		
		//기본생성자
		public ColorPoint() {
//			super(); 가 생략되어 있는것과 마찬가지
		}
		
		public ColorPoint(int x, int y, String color) {
			//부모(Point)에서 'private int x, y;' 로 선언되어 있어 직접 접근은 불가능하다.
//			super.x = x;
//			super.y = y;
			super(x,y);   //이렇게 접근해줘야함..!
			this.color = color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
		public void showColorPoint() {
			System.out.print(color);
			//부모에게서 가져온 내용 super.
			super.showPoint(); //부모(Point)에게서 온 showPoint..
//			super.set(0, 0);
		}
	}

