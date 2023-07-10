package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		
//		Reader는 추상클래스니까 객체생성 안됨
		Reader reader = null;
		
		try {
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			int readCharCount;
			char [] cBuf = new char[3];
			
			int i = 0;
			String result = "";
			
			while(true) {
//				cBuf : 읽은값 
//				readCharCount : 읽은 갯수
//				읽을게 없으면 readCharCount가 -1
				readCharCount = reader.read(cBuf);
//				System.out.print(readCharCount);
				
//				reader.read(cBuf);
				if(readCharCount == -1) break;
				
//				cBuf를 0부터 읽은곳까지만 String으로 바꿔줌
				result += new String(cBuf, 0, readCharCount);
				
//				for(char c : cBuf) {
//					System.out.print(c);
//				}
//				System.out.println();
//				i++;
			}
			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { //finally : 예외가 발생하든 안하든 무조건 실행함
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
