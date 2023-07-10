package com.kh.day11.hw;

import java.util.Scanner;

import com.kh.day07.oop.member.MemberFunction;

public class HotelMemberRun {
	
public static void main(String[] args) {
		
		
		HotelMemberFunction hFunc = new HotelMemberFunction();
	
		
		finish :
			while(true) {
				
				int inputNum = hFunc.printMenu();
				
				switch(inputNum) {
				case 1 :
					hFunc.inputInfo(hFunc.mArrs);
					break;
				case 2 :
					hFunc.printInfo(hFunc.mArrs);
					break;
				case 3 :
					hFunc.checkReserve(hFunc.mArrs);
					break;
				case 4 : System.out.println("프로그램이 종료되었습니다.");
					break finish;	
				}
			}	
	}


}
