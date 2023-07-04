package com.kh.day07.oop.polymorphism.overriding;

public class Rect extends Shape{

	@Override
	public void draw() {
		// 원래 부모의 draw를 가져다 쓴것이라는 뜻(super)
		// 재정의 가능하다.
//		super.draw();
		System.out.println("Rect");
	}
}
