package com.kh.day07.oop.polymorphism.overloading;


class Weapon {
	public Weapon() {}
	public Weapon(int value) {
		System.out.println(value);
	}
	public Weapon(int value, String name) {
		System.out.println(value + ":" + name);
	}

}



public class Exam_Overloading {
	
	public static void main(String[] args) {
//		메소드는 똑같아도 동작을 한다..
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true);

	}

}

