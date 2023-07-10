package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		
//		데이터가 출력되어 새로운 파일에 쓰이는것.
		OutputStream os = null;
//		OutputStream : 추상클래스이므로 객체 생성 안됨
		
		try {
			os = new FileOutputStream("src/com/kh/day11/iostream/outputting.txt");
//			byte 기반으로 byte 배열이 필요 (한글 깨질 수 있음)
			byte [] data = "리얼 입출력".getBytes();
			
			for(int i = 0; i < data.length; i++) {
				os.write(data[i]);
			}
			
			os.flush();  //버퍼비우기
			System.out.println("파일쓰기 완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close(); //자원해제?
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}

	}

}
