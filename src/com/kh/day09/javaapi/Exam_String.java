package com.kh.day09.javaapi;

public class Exam_String {

	public static void main(String[] args) {
		//내용은 같은데 주소가 달라짐
		String msg = "Hello Java";
		msg = new String("Hello Java"); 
		//따라서 내용 비교 equals를 이용하여 값을 비교해야함.
		
		
		String data1 = new String("C#");
		String data2 = new String(",C++ ");
		System.out.println(data1 + "의 길이는 " + data1.length());
		System.out.println(data2 + "의 길이는 " + data2.length());
		
		// 문자열 포함
		System.out.println("#이 있는가? : " + data1.contains("#"));
		
		// 문자열 연결 (문자열이어야 함.)
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 : " + data1);
		
		// 공백 제거
		data1 = data1.trim();
		System.out.println("공백 제거 확인 : " + data1);
		
		// 문자열 교체
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 : " + data1);
		
		// 문자열 분리
		System.out.println(" 문자열 분리 ");
		String [] words = data1.split(",");
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i] + " / ");
	
//		// 문자열 자르기
//		data1 = data1.substring(5);
//		System.out.println("문자열 자르기 : " +  data1);
		
		
		//범위 자르기
		data1 = data1.substring(0, 4);
		System.out.println("범위 자르기 : " +  data1);
		
		//문자 자르기(from String)
		char word = data1.charAt(0);
		System.out.println("문자 자르기 : " + word);
		
		
		
		}
	}

}