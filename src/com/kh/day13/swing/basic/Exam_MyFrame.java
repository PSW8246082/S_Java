package com.kh.day13.swing.basic;

import javax.swing.JFrame;

public class Exam_MyFrame extends JFrame{

	public Exam_MyFrame() {
		
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {

		Exam_MyFrame exFrame = new Exam_MyFrame();
		// new Exam_MyFrame();  //이렇게만 적어도 객체 생성됨 -> 실행됨.
		// exFrame는 주소를 갖는곳.

	}

}
//run클래스를 만들기보다 합쳐쓰는것을 권장함??