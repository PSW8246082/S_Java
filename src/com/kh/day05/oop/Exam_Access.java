package com.kh.day05.oop;

public class Exam_Access {

	public static void main(String[] args) 
	{
		Sample sample = new Sample();
		sample.a = 5;
//		sample.b = 15; //멤버변수 b는 private이기 때문에 보이지 않아 접근할 수 없어 오류 발생
//		The field Sample.b is not visible
		sample.c = 10; // default는 같은 패키지이기 때문에 접근 가능
		

	}

}



//  접근 지정자, 접근 제한자
class Sample {
	public int a;    // public : 모든 곳에서 접근 가능 
	private int b;   // private : 자신 클래스 내에서만 접근 가능
	int c;           // default : 자신과 같은 패키지에서만 접근 가능
	
}
