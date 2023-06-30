package com.kh.day05.oop;

public class Exam_Static {
	public static void main(String [] args) 
	{
		
		staticSample sample = new staticSample();
		sample.num = 26;
		
		
//		new(객체생성) 없이도 바로 사용 가능(static 때문에)
		staticSample.input = 10;
		staticSample.originMethod();
		
		
	}
}





class staticSample {
	
	public int num;
	
	public static int input;
	
	public void sampleMethod() {
		
	}
	
	public void goodMethod() {
			
		}
	
	public static void originMethod() {
		input = 1225;
	}
	
	
	
	
	
	
	
	
	
}
