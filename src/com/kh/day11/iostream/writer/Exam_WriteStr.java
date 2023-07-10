package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {

	public static void main(String[] args) {
		
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writing3.txt");
			//char 문자기반 스트림은 한글 깨짐 없음
			//char [] cbuf2 = "I/O Stream Goood".toCharArray();
			
			//메소드3 : 문자열을 바로 넣는 방법3
			writer.write("I/O Stream Goood");
			writer.flush();
			
			System.out.println("writer(Char[]) 동작 완료!");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	

	}

}
