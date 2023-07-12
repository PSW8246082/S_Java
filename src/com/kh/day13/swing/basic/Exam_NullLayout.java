package com.kh.day13.swing.basic;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_NullLayout extends JFrame{
	
	public Exam_NullLayout() {
		
		setTitle("NullLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50); //위치
		la.setSize(200, 20); //사이즈를 설정해줘야 보임.
		c.add(la);
		
//		JButton btn = new JButton("1");
//		btn.setLocation(15, 15);  //위치
//		btn.setSize(50, 20);  //사이즈를 설정해줘야 보임.
//		c.add(btn);
		
//		for문으로 만들기.
		for(int i = 1; i <= 9; i++) {
			JButton btn = new JButton(String.valueOf(i));
			btn.setLocation(i*15, i*15);  //위치
			btn.setSize(50, 20);  //사이즈를 설정해줘야 보임.
			c.add(btn);
		}
		
		
		setSize(200,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Exam_NullLayout();

	}

}
