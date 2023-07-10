package com.kh.day11.iostream.fileio;

import java.io.File;
import java.io.IOException;

public class Exam_File {

	public static void main(String[] args) {
		
//		해당 경로에 있는 파일명, 부모파일 등을 알 수 있음
//		파일 경로에 있는 파일이 객체화 된다.
//		객체화 된 파일의 다양한 정보를 꺼내어 쓸 수 있다.
		
		File file = new File("D:\\flower5.PNG");
		String fileName = file.getName();
		String path = file.getPath();
		String parent = file.getParent();
		
		System.out.printf("파일이름 : %s \n파일 경로 : %s \n부모폴더 : %s \n"
				, fileName
				, path
				, parent);
		
	
		System.out.printf("파일이 존재하는가? : %b\n파일이 맞는가? : %b\n폴더가 맞는가? : %b\n"
				, file.exists()
				, file.isFile()
				, file.isDirectory());
		

	}





public void fileMake() {
	//파일 만들어 준다.
			File fileMake = new File("src/com/kh/day11/iostream/file_1.txt");
			try {
				fileMake.createNewFile();
				System.out.println("파일이 만들어졌습니다.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}





public void folderMake() {
	
	File folderMake = new File("");
	folderMake.mkdir();
	// mkdirs(); 메소드는 폴더를 만드는 메소드인데 계층형 폴더를 한번에 만들어주는 메소드
	System.out.println("폴더가 만들어졌습니다.");
	
}




}
