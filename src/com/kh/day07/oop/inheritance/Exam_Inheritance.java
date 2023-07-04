package com.kh.day07.oop.inheritance;



import com.kh.day07.oop.point.ColorPoint;
import com.kh.day07.oop.point.Point;

public class Exam_Inheritance {

	public static void main(String[] args) {
		
	// (x,y)의 한점을 표현하는 Point클래스와 이를 상속받아 색을 가진 점을 표현하는
	// ColorPoint클래스를 만들고 활용해보자~
//		Point p = new Point();
//		p.set(1, 2);
		Point p1 = new Point(1,2);
		p1.showPoint();
		
//		ColorPoint cp = new ColorPoint();
//		cp.set(3, 4);
		
		ColorPoint cp1 = new ColorPoint(3, 4, "red");
		cp1.setColor("red");
		cp1.showColorPoint();
		
		ColorPoint cp2 = new ColorPoint(5, 6, "blue");
		cp2.showColorPoint();
	}

}






//클래스 안에 클래스 만드는 법
//class Point {
//	public int pub;
//	int def;
//	protected int pro;
//	private int pir;
//	
//	private int x, y;
//	
//	public void set(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	
//	public void showPoint() {
//		System.out.printf("%d, %d\n", x, y);
//	}
//}







//class ColorPoint extends Point {
////	Point를 확장해줌
//	
//	private String color;
//	
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
//	public void showColorPoint() {
//		System.out.print(color);
//		//부모에게서 가져온 내용 super.
//		super.showPoint(); //부모(Point)에게서 온 showPoint..
////		super.set(0, 0);
//	}
//}






