package com.kh.day06.oop.objectarray;

public class Exam_ObjectArray {

	public static void main(String[] args) {
		
//		*참고 : java.lang.NullPointerException는 .앞에를 봐야함
		
		
		//객체 하나만
//		Circle c = new Circle();
//		c.radius = 10;
//		double result = c.getArea();
//		System.out.println(result);
		
		
		//객체 배열로
		Circle [] cArray;
		cArray = new Circle[5];
		Circle c = cArray[0];
		// c.radius = 10;  //java.lang.NullPointerException 오류남 // 그냥 공간이기 때문에 값 넣을수 없음
		System.out.println(c); //지금은 null 여기까지는 그냥 공간임
		System.out.println(cArray[0]); //지금은 null 여기까지는 그냥 공간임
		
		System.out.println();
		
		
		//이렇게 해줘야 객체가 된다.
		cArray[0] = new Circle();
		System.out.println(cArray[0]);
		cArray[0].radius = 10;
		
		System.out.println();
		
//		이렇게 for문으로 객체 만들 수 있음
		for(int i=0; i<cArray.length; i++) {
			cArray[i] = new Circle(); // 이때 화살표가 생기는 것임.(공간에서 주소 복사된 곳으로?)
		}
		
		cArray[0].radius = 1;
		cArray[1].radius = 2;
		cArray[2].radius = 3;
		cArray[3].radius = 4;
		cArray[4].radius = 5;
		
		System.out.println(cArray[0].getArea());
		System.out.println(cArray[1].getArea());
		System.out.println(cArray[2].getArea());
		System.out.println(cArray[3].getArea());
		System.out.println(cArray[4].getArea());
		
	}

}
