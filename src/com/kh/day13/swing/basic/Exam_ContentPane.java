package com.kh.day13.swing.basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_ContentPane extends JFrame{
	
	//생성자
	public Exam_ContentPane() {
		
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창 닫으면 실제로 종료되는 코드
		
		Container contentPane = getContentPane(); //Container javax.swing.JFrame.getContentPane() 가진 메소드
		contentPane.setBackground(Color.orange); //import java.awt.Color;
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Exam_ContentPane();  //객체 생성

	}

}
