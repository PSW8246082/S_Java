package com.kh.day09.javaapi;

public class Exam_StringBuffer {
	public static void main(String[] args) {
		
		//StringBuffer : 문자열을 연결해주는 클래스
		//문자열을 연결해주는 메소드 concat과 같은 역할을 함
		String data1 = "HELLO";
		String data2 = " ";
		String data3 = "JAVA";
		
		StringBuffer stb = new StringBuffer();
		stb.append(data1).append(data2).append(data3);
		System.out.println("연결된 문자열 : " + stb.toString());
		
	
		
		
		// concat으로 연결하는 방법
		//두개 합칠 때
//		data1 = data1.concat(data3);
//		System.out.println("concat 연결 : " +data1);
		
		//여러개 합칠 때
//		data1 = data1.concat(data2).concat(data3);
//		System.out.println(data1);
		
		
		// +로 연결하는 방법
		String result = data1 + data2 + data3;  // 메소드 체이닝 : .으로 연결하는거..
		System.out.println(" + 연결 : " + result);
		
		
	
		
	}

}
