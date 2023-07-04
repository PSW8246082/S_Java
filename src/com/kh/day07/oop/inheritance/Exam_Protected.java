package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.point.Point;

class parent {
	//필드
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	//생성자
	public parent() {
		
	}
}

class child extends parent {
	private int childMoney;
	
	public child() {}
	void set() {
		super.pub =1;
		super.def = 2;
		super.pro = 3;
//		super.pri = 4; //The field Point.pri is not visible
	}
}


class ShapePoint extends Point {
	private String shape;
	public ShapePoint() {}
	void set() {
		super.pub = 1;
//		super.def = 2; //The field Point.def is not visible
		super.pro = 3;
//		super.pri = 4;  //pri cannot be resolved or is not a field(오타)
						// The field Point.pri is not visible
		//오류 메세지가 왜 다르지? 오타...
	}
}

public class Exam_Protected {
	public static void main(String[] args) {
		
	}

}
