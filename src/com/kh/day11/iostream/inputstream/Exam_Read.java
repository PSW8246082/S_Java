package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		
		InputStream is = null;
//		추상클래스로 객체 생성 안됨
		
		try {
			is = new FileInputStream("src/com/kh/day11/iostream/reading.txt");
			//읽은 바이트를 읽어냄
			int readByte;
			
//			while(true) {
//				readByte = is.read();
//				if(readByte == -1)break;
//				System.out.print((char)readByte);
//			}
			do {
				readByte = is.read(); //먼저읽고
				System.out.print((char)readByte);  //출력해
			} while(readByte != -1);
		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		

	}

}
