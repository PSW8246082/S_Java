package com.kh.day09.objectpkg;


public class Exam_ObjectProperty {
	
	

	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시 코드 값 : " + obj.hashCode());
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
		System.out.println("객체 출력 : " + obj);
	}
	

	
	
	
	public static void main(String[] args) {
		
		Point p1 = new Point(2,3);
		print(p1);
		Point p2 = new Point(4,5);
		print(p2);
		
		
		
		//문자열 비교
//	-----------------------------------------------------	
		
		String javaStr1 = "Java";
		String javaStr2 = "Java";		
		
		if(javaStr1 == "Java") {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		if(javaStr2 == "Java") {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		
//	-----------------------------------------------------	
		
		String [] strArrs = new String[10];
		strArrs[0] = "Java";
		strArrs[1] = "Java";
		if(strArrs[0] == strArrs[1]) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		
//	-----------------------------------------------------
		
		String javaStr3 = new String("Java");
		
		//주소 비교를 하기 때문에 다름으로 나옴
		if(javaStr1 == javaStr3) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
//		Object 클래스의 .equals() 메소드 : 내용비교
		if(javaStr1.equals(javaStr3)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		

		
		
		
		
		
	}

	
	
	
}
