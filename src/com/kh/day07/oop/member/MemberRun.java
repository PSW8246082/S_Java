package com.kh.day07.oop.member;

import java.util.Scanner;

import com.kh.day06.oop.exercise.Student;

public class MemberRun {
	
	//실행용
	
//	static int index = 0;
	
	public static void main(String [] args) {
		
		MemberFunction mFunc = new MemberFunction();
		
		finish :
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			int choice = mFunc.printMenu();
			
			switch(choice) {
				case 1 : 
					mFunc.inputInfo();
					break;
				case 2 : 
					mFunc.printInfo();
					break;
				case 3 : 
					System.out.println("프로그램이 종료되었습니다.");
					break finish;
				default : 
					System.out.println("해당 메뉴는 존재하지 않습니다.");
					break;
			}
		}		
	}
	

	








	





	
	

}
