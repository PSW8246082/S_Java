package com.kh.day06.oop.member;

public class MemberRun {

	public static void main(String[] args) {
		
		
		
		
		
//	------------------------------------------------------------
		Member [] mArrs = new Member[3];
		
		finish :
			while(true) {
				
				int inputNum = printMenu();
				
				switch(inputNum) {
				case 1 : 
					inputScore(mArrs);
					break;
				case 2 : 
					printScore(mArrs);
					break;
				case 3 : 
					checkPass(mArrs);
					break;
				case 4 : System.out.println("프로그램이 종료되었습니다.");
					break finish;	
				}
			}	
	}

	
	
	
	
	
	private static void checkPass(Member[] mArrs) {
		// TODO Auto-generated method stub
		
	}

	private static void printScore(Member[] mArrs) {
		// TODO Auto-generated method stub
		
	}

	private static void inputScore(Member[] mArrs) {
		// TODO Auto-generated method stub
		
	}

	private static int printMenu() {
		// TODO Auto-generated method stub
		return 0;
	}

}
