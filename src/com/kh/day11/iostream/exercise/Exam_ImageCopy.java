package com.kh.day11.iostream.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {

	public static void main(String[] args) {
		// 바이트 스트림을 이용하여 바이너리 파일을 복사하는 프로그램을 작성하라
		// c:\Windows\Web\Wallpaper\Theme1\img1.jpg를 c:\Temp\copyimg.jpg로 복사하였습니다.
		
		
		InputStream is = null;
		OutputStream os = null;
		
		File src = new File("C:\\Users\\user1\\Desktop\\정리\\flower5.PNG");
		File dest = new File("C:\\Temp\\copyimg.jpg");
		
		int readByte;
		
		try {
			
			//폴더가 없으면 폴더 만들기.
			File folder = new File("c:\\Temp");
			if(!folder.exists()) {
				folder.mkdir();
			}
			
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			
			while(true) {
				readByte = is.read();
				
				if(readByte == -1) break;
				os.write((char)readByte);
			}
			
			is.close();
			os.close();
			
			System.out.printf("%s를 %s로 복사하였습니다.",src.getPath(), dest.getPath());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
