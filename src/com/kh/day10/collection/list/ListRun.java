package com.kh.day10.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListRun {

	public static void main(String[] args) {
		
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		sList.add(new Student());
		
		
		for(int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i).toString());
		}

		
	
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void intExample() {
		//배열은 인덱스가 있지만..
				IntList nums = new IntList();
				nums.add(1);
				nums.add(2);
				nums.add(3);
				
//				int result = nums[0]  배열에서는..1
				int result = nums.get(0);
				System.out.println("result : " + result);
				
				
//				int size = nums.length; 배열에서는..2
				int size = nums.size();
				System.out.println("size : " + size);
				
				
//				nums = {} , nums = new int[3]; 배열에서는..3
				nums.Clear();
		
	}
	
	
	
	
	
	
	
	
	public void ObjectExample() {
		
		ObjectList objList = new ObjectList();
		objList.add(10);
		objList.add("월");
		objList.add('A');
		
//		모든걸 다 받기위해 Object로 적음
		Object obj = objList.get(0);
		
		
//		강제 형변환 다운캐스팅으로 타입을 맞춰줌(오류해결)
		int num = (int)obj;
//		오류 : Type mismatch: cannot convert from Object to int
		
		
//		강제 형변환 다운캐스팅으로 타입을 맞춰줌(오류해결)
		Object obj2 = objList.get(1);
		String str = (String)obj2;
//		오류 : Type mismatch: cannot convert from Object to String
		
//		강제 형변환 다운캐스팅으로 타입을 맞춰줌(오류해결)
		char cOne = (char)objList.get(2);
//		오류 : Type mismatch: cannot convert from Object to char
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void genericExample() {
		
		RList<Integer> list = new RList<Integer>();
		list.add(10);
		list.add(26);
		list.add(923);
		
		int num = list.get(0);
		
		System.out.println("num : " +  num);
		
	}
	
	
	
	
	
	
	
	
	public void sListExample() {
		
		
		//** 인터페이스 객체 생성 안됨..
		
		List<String> strList = new ArrayList<String>();
		strList.add("딸기");
		strList.add("복숭아");
		strList.add("바나나");
		strList.add("포도");
		
		System.out.println("첫번째 : " + strList.get(0));
		
		System.out.println("============================================");
		
		for(int i=0; i<strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		
		System.out.println("============================================");
		
		
		//중간에 추가하기1
		strList.add(2, "체리");
		for(int i=0; i<strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		
		System.out.println("============================================");
		
		//중간에 추가하기2
		strList.add(2, "파인애플");
		for(int i=0; i<strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		
		System.out.println("============================================");
		
		//삭제하기
		strList.remove(2);
		for(int i=0; i<strList.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + strList.get(i));
		}
		
		
		
		
		
		//업캐스팅
		ArrayList<String> aList = new ArrayList<String>();
		
	}
	
	
	
	
	
	
	

}
