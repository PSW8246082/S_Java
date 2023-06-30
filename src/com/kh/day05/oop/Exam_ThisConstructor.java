package com.kh.day05.oop;

public class Exam_ThisConstructor {
	
	public static void main(String[] args) {
		
		//하나의 클래스에 다른 클래스를 넣는법1
		//파일 하나에 여러개의 클래스를 넣는법1
		Circle2 circle3 = new Circle2();
		circle3.radius = 10;
		System.out.println("원의 넓이는" + circle3.getArea());
		
		
		//하나의 클래스에 다른 클래스를 넣는법2
		//파일 하나에 여러개의 클래스를 넣는법2
		Book2 book = new Book2();
		
		Book2 loveStory = new Book2("춘향뎐");
		System.out.println(loveStory.title + ", " + loveStory.author);

	}

}

//-------------------------------------------------------------------
//하나의 클래스에 다른 클래스를 넣는법1
//파일 하나에 여러개의 클래스를 넣는법1
class Circle2 {
	
	public double radius;
	public String name;
	
	
	public Circle2() {
		
	}
	
	
	public double getArea() {
		return 3.14*radius * radius;
	}
	
}
//--------------------------------------------------------------------------

//하나의 클래스에 다른 클래스를 넣는법2
//파일 하나에 여러개의 클래스를 넣는법2
class Book2 {
	
	public String title;
	public String author;
	
	
	public Book2() {
		System.out.println("Book2 생성자 호출됨");
	}
	public Book2(String title) {
//		this.title = title;
		this(title, "작자미상");
	}
	public Book2(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
}
//----------------------------------------------------------------------------





