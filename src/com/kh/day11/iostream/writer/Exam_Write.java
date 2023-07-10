package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {

	public static void main(String[] args) {
		
		Writer writer = null;
//		Writer :추상클래스이므로 객체 생성 안됨
		
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/writing.txt");
//			오류 : Unhandled exception type IOException
//			트라이 캐치 강제함
			
			//char 문자기반 스트림은 한글 깨짐 없음
			char [] data = "java/oracle/jdbc".toCharArray();
			
			for(int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			
//			writer.flush();  종료해줄때, finally대신 씀?? 둘다 써도 되는듯...?
			System.out.println("파일쓰기 완료!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
