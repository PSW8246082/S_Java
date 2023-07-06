package com.kh.day08.oop.homework.q5;

public class Run {

	public static void main(String[] args) {
		
		Person kim = new Person("김씨", 10000);
		kim.buyCoffee(new StarCafe(), 5500);
		kim.printInfo();
		
		System.out.println();
		
		Person lee = new Person("이씨", 20000);
		lee.buyCoffee(new CongCafe(), 4500);
		lee.printInfo();
		
		System.out.println();

		Person jang = new Person("장씨", 50000);
		jang.buyCoffee(new StarCafe(), 6000);
		jang.printInfo();
	}

}
