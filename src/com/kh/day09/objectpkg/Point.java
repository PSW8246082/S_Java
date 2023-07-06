package com.kh.day09.objectpkg;

public class Point {
	private int x , y;
	
	public Point() {
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
//	toString() : 눈으로 보이지 않는 것을 확인할 때 많이 사용함
	@Override
	public String toString() {
	
		return "x : " + this.x + ", y : " +  this.y; 
		
	}
	
	
	
	
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x == p.x && y == p.y) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
}
