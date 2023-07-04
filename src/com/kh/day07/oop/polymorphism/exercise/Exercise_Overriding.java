package com.kh.day07.oop.polymorphism.exercise;


class SuperClass {
	void paint() {                                //3번
		draw();                                   //4번
	}
	void draw() {                                 //7번
		System.out.println("Super Object");       //8번
	}
}
	
	
	
class SubClass extends SuperClass {
	void paint() {                     //1번
		super.paint();                 //2번 
		super.draw();                  //6번 
	}
	void draw() {
		System.out.println("Sub Object");   //5번
	}
}




public class Exercise_Overriding {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}
}
