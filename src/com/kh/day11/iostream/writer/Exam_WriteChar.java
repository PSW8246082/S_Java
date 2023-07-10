package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteChar {

	public static void main(String[] args) {
		
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writing2.txt");
			
			//char 문자기반 스트림은 한글 깨짐 없음
			// 문자 -> 문자열 데이터 변경
			char [] cbuf = "I/O Stream Good".toCharArray();
			
			writer.write(cbuf);
			
			writer.flush();  //버퍼 비우기, 스트림에 있는 데이터들을 비워냄
			
			System.out.println("writer(Char[]) 동작 완료!");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close(); // 버퍼를 비우지 않아도 스트림을 종료하게 되면 버퍼가 비워짐
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
