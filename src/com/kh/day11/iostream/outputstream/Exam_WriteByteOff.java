package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/com/kh/day11/iostream/outputting2.txt");
			
//			byte는 동영상 등 큰 파일 옮길때 쓴다.
//			byte기반 스트림이기 때문에 byte배열 만들기.
			byte [] data = "레알 입출력".getBytes();
			
			//커스터마이징 할 수 있음 : 위치 지정해서...
			os.write(data, 0, 16);   //byte기반으로 크기가 작아지면 한글은 깨질 수 있음
			os.flush(); //버퍼 지우기
			
			System.out.println("쓰기 완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
			
		}

	}

