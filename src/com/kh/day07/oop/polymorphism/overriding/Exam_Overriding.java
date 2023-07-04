package com.kh.day07.oop.polymorphism.overriding;

public class Exam_Overriding {
	
//	1.오버라이딩은 상속 관계에서 사용 가능하다.
//	2.오버라이딩은 다 똑같고 실행문만 다르게 작성한다.
//	3.오버라이딩이 되면 동적바인딩이 되어 다형성을 이용할 수 있다.
	
	static void paint(Shape shape) {
		//업캐스팅에 의해 슈퍼 클래스 래퍼런스로 오버라이딩 된 메소드 호출
		//동적 바이딩이라고 한다.
		shape.draw();
	}
	
//	static void paint(Line line) {
//		line.draw();
//	}
//	static void paint(Circle circle) {
//		circle.draw();
//	}
//	static void paint(Rect rect) {
//		rect.draw();
//	}
	
	
	

	public static void main(String[] args) {
//		Line line = new Line();
//		line.draw();
//		
//		Circle circle = new Circle();
//		circle.draw();
		
		paint(new Line());
		paint(new Circle());
		paint(new Rect());
	}

}
