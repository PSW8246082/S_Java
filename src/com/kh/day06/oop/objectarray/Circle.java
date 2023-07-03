package com.kh.day06.oop.objectarray;

public class Circle {
	int radius;
	
	public Circle() {
		
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	
	
	//메소드는 반환형이 있다(return) / 생성자는 반환형 없음
	//반환형이 없으면 void를 써줘야함
	public double getArea() {
		double area = 3.14 * radius*radius;
		return area;
	}

}
