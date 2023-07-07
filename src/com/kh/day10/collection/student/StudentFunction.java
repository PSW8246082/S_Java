package com.kh.day10.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFunction {
	
//	Student [] students;
//	int index;
	
//	위에 배열 ArrayList로 바꾸기
	List<Student> stdList;
	
	
	
	public StudentFunction() {
//		students = new Student[100];
//		index = 0;
		
		stdList = new ArrayList<Student>();
	}
	
	
	//메인에서 바로 사용하지 않으니 static 뺀다.
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적관리 프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 재평가 대상 여부 확인");
		System.out.println("5. 프로그램 종료");
		System.out.println("선택  : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 입력");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		
		Student std = new Student(name, score1, score2);
//		students[index] = std;
//		index++;	
		stdList.add(std);
	}
	
	
	
	public void printInfo() {
		
//		방법1)
//		for(int i = 0; i < stdList.size(); i++) {
//			//System.out.println(stdList.get(i).getName() + "/ ");
//			System.out.println(stdList.get(i).toString());
//		}
		
		
		//방법2)
		for(Student student : stdList) {
			//오른쪽의 키값(stdList)을 student에 넣어줌..모든 객체들을
			System.out.println(student.toString());	
		}
			
	}
	
	
	
	
	
	
//	평균 60점이상 통과하고 60점이하도 재시험...이거 조건 추가하기...
	public void checkPass() {
		for(Student student : stdList) {
			int score1 = student.getScore1();
			int score2 = student.getScore2();
		}
		
		
	}


	//이름으로 검색하기
	public void searchInfoByName() {
		System.out.println("학생 정보 이름 검색");
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		
		for(Student std : stdList) {
			if(std.getName().equals(searchName)) {
				System.out.println(std.toString());
				break;
			}
		}
	}
	
	
	
	
	
	
	

}
