package com.kh.day08.oop.abstractpkg;


class Line extends Shape {
	// 4. The type Line must implement the inherited abstract method Shape.draw()
	// 상속받은 추상클래스를 오버라이딩 해야한다(안할거면 클래스 앞에 abstract 붙이기..)
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}






public abstract class Shape {
	
	//생성자
	public Shape() {}

	//메소드
	public void paint() {}
	abstract public void draw();
	
	
	
	//abstract public void draw() {}
	// 1. Abstract methods do not specify a body    / 중괄호를 없애고 ; 붙이기...
	
	
	// abstract public void draw();
	// 2. The abstract method draw in type Shape can only be defined by an abstract class(여기에 오류)
	// 3. The type Shape must be an abstract class to define abstract methods (위에 클래스 자리에 오류)
	//클래스를 abstract 붙여 추상클래스로 만들어라(2번 3ㄴ번 똑같음)
	
}
