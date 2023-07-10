package com.kh.day11.hw;

import java.util.Scanner;

public class HotelMemberFunction {
	
HotelMember [] mArrs = new HotelMember[3];
	

	public static int printMenu() {
		System.out.println();
		System.out.println("======= KH호텔 예약 프로그램 =======");
		System.out.println("1. 회원 정보 입력");
		System.out.println("2. 회원 정보 출력");
		System.out.println("3. 회원 예약 확인");
		System.out.println("4. 프로그램 종료");	
		System.out.print("메뉴 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		return inputNum;
	}
	
	
	public static void inputInfo(HotelMember[] mArrs) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<mArrs.length; i++) {
			System.out.println();
			System.out.println("==회원 정보 입력==");
			System.out.print("이름 : ");
			String name =  sc.next();
			System.out.print("나이 : ");
			int age =  sc.nextInt();
			System.out.print("등급 : ");
			int grade =  sc.nextInt();
			System.out.print("예약 여부 : ");
			boolean reserveYn  =  sc.nextBoolean();
			
			mArrs[i] = new HotelMember();
			
			mArrs[i].setName(name);
			mArrs[i].setAge(age);
			mArrs[i].setGrade(grade);
			mArrs[i].setReserveYn(reserveYn);
		}	
	}
	
	
	
	public static void printInfo(HotelMember[] mArrs) {
		for(int i=0; i<mArrs.length; i++) {
			System.out.println();
			System.out.println("==회원 정보 출력==");
			System.out.println(mArrs[i].getName() + "님의 정보 안내");
			System.out.println("나이 : " + mArrs[i].getAge());
			System.out.println("등급 : " + mArrs[i].getGrade());
		}
	}
	
	
	public static void checkReserve(HotelMember[] mArrs) {
		for(int i=0; i<mArrs.length; i++) {
			if(mArrs[i].getReserveYn() == true) {
				System.out.println("예약번호 " + mArrs[i].getReserveNum() + " " +  mArrs[i].getName() + "님 예약되셨습니다.");
			}
			else {
				System.out.println(mArrs[i].getName() + "님 예약되지 않으셨습니다.");
			}
		}
	}

}
