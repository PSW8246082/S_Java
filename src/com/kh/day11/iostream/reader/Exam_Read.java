package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		
//		Reader reader = new Reader();
//		오류 : Cannot instantiate the type Reader
		
		Reader reader = null;
//		Reader : 추상클래스이므로 객체 생성 안됨
		
		try {
			//통로를 만들어줌..
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
//			오류 : Unhandled exception type FileNotFoundException
//			트라이캐치를 강제함.(이런것들을 Checked Exception이라고 함)
			
			while(true) {
//				reader.read();
//				오류 : Unhandled exception type IOException
//				트라이캐치를 강제함.
				
				int readData = reader.read();
				if(readData == -1) break; //무한반복을 하지 않기 위해.
				System.out.print((char)readData);
			}
			

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
//				오류 : Unhandled exception type IOException
//				트라이캐치를 강제함.
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


	}

}
