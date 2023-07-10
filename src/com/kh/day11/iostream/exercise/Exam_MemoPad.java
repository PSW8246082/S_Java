package com.kh.day11.iostream.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("저장할 파일명 입력(확장자 제외) : ");
		String fileName = sc.nextLine(); // 입력하고 엔터치면 엔터가 33번째 줄로 들어가서 1 : 에는 공백이 입력되고 2 : 부터 시작함
									// 여기에서 발생한 엔터를 제거 필요
		// 방법1. sc.nextLine(); 밑에다 쓰기
		// 방법2. sc.next(); -> sc.nextLine();로 바꾸기
		
		System.out.println(fileName + "파일에 저장될 내용 입력");
		
		
		//경로 입력 및 파일명으로 파일 생성해줌
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/com/kh/day11/iostream/" +  fileName + ".txt");
	
			
			//무한 반복하여 입력받는데 exit를 입력하면 무한 반복을 빠져나오는 코드
			System.out.println("종료는 exit");
			
			
			for(int i = 1 ;; i++) {
				System.out.print(i + " : ");
				String input = sc.nextLine(); //저장할 파일명 입력 뒤에 공백을 입력받아 1.이 씹힘. 
				writer.write(input + "\n");
				
				//exit를 입력하면 무한반복 빠져나오기
				if(input.equals("exit")) break;
			}
			
			writer.flush();
			System.out.println("파일 저장이 완료되었습니다.");
			
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
