package com.kh.day06.oop.objectarray;

import java.util.Scanner;

public class Exam_ObjectArray2 {

	public static void main(String[] args) {
		
		Book [] books = new Book[2];
		Scanner sc = new Scanner(System.in);

//---------------------------------------------------------------------------------------
		
		//아래 내용을 for문으로 만듬
		for(int i = 0; i< books.length; i++) {
			System.out.print("제목 >> ");
			String title = sc.nextLine();
			System.out.print("저자 >> ");
			String author = sc.nextLine();
			
			books[i] = new Book(title, author);
			System.out.println("(" + books[i].title + ", " + books[i].author + ")");
		}
	
		
//------------------------------------------------------------------------------------		
		System.out.print("제목 >> ");
		String title = sc.nextLine();
		System.out.print("저자 >> ");
		String author = sc.nextLine();
		
		
		books[0] = new Book(title, author);
		//위아래 같은내용..위에처럼 한줄로 쓸 수 있음;
//		books[0].title = title;
//		books[0].author = author;
		
		System.out.println("(" + books[0].title + ", " + books[0].author + ")");
		
		
		
		//The constructor Book() is undefined
		//매개변수가 있는 생성자가 있는데 기본생성자가 생성되어 있지 않으면 나는 오류
		//books[0] = new Book();
	

	}

}
