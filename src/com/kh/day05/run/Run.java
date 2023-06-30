package com.kh.day05.run;

import java.util.Scanner;

import com.kh.day05.oop.Book;
import com.kh.day05.oop.Circle;
import com.kh.day05.oop.exercise.Rectangle;

public class Run {
	public static void main(String [] args) 
	{
//		서로 다른 Circle 객체를 여러개 만들 수 있음
//		Circle circle1 = new Circle();
//		Circle circle2 = new Circle();
//		Circle circle3 = new Circle();
//		Circle circle4 = new Circle();
//		
//		circle1.radius = 1;
//		circle2.radius = 2;
//		circle3.radius = 3;
//		
//		System.out.println(circle1.getArea());
//		System.out.println(circle2.getArea());
//		System.out.println(circle3.getArea());
		
		
		Circle pizza;
		pizza = new Circle();
		
		pizza.radius = 10;
		pizza.name = "청년피자";
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "청년도넛";
		
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
		
		System.out.println();
		
		
		
		
//		매개변수가 있는 생성자 사용방법..
		
//		pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "청년피자";
		
//		위 세줄을 한줄로 작성 가능
		pizza = new Circle(10,"청년피자");
		
		
		
		
		
//		Circle donut = new Circle();
//		donut.radius = 2;
//		donut.name = "청년도넛";
//		
//		위 세줄을 한줄로 작성 가능
		pizza = new Circle(2, "청년도넛");
		
		
		
//------------------------------------------------------------------------		
		
		System.out.println();
		
		
		
		
		
		//스캐너를 Rectangle 안에 넣지 않는다 보통, 넣어도 되긴함?
		Rectangle rect = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("너비를 입력해주세요.");
		rect.width = sc.nextInt();
		
		
		System.out.println("높이를 입력해주세요.");
		rect.height = sc.nextInt();		
		
		int result = rect.getArea();
		System.out.println("해당 사각형의 넓이는 " + result + "입니다.");
		
		
		
		System.out.println();
		
//	--------------------------------------------------------------------------
		
//		방법1)
//		Book littlePrince = new Book();
//		littlePrince.title = "어린왕자";
//		littlePrince.author = "생택쥐페리";
		
//		방법2) 위에 세줄과 똑같은것
		Book littlePrince = new Book("어린왕자","생택쥐페리");
		
		
		
		Book loveStory = new Book("춘향뎐");
				
				
		System.out.println(littlePrince.title + " , " + littlePrince.author);
		
		System.out.println(loveStory.title);
		System.out.println(loveStory.title + " , " + loveStory.author);
		
		
		
		
		
		
		
		
		
		
	}
}
