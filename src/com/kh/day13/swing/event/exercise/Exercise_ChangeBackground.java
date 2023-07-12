package com.kh.day13.swing.event.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_ChangeBackground extends JFrame{
	
	// <F1> 키를 입력 받으면 컨텐트팬의 배경을 초록색으로,
	// % 키를 입력 받으면 노란색으로 변경. 
	
	
	public Exercise_ChangeBackground() {
		
		setTitle("Key Code 예제, F1키 : 초록색, %키 : 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		
		
		
		
		JLabel la = new JLabel();
		
//		c.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));s
		c.setLayout(null);
		
		
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				la.setText(e.getKeyText(e.getKeyCode()) + "키가 입력되었습니다.");
				
				int keyCode = e.getKeyCode();
				char keyChar = e.getKeyChar();
				
				if(keyChar == '%') {
					c.setBackground(Color.green);
				} else if(keyCode == KeyEvent.VK_F1) {
					//KeyEvent.VK_F1는 가상키 값 표가 있음. 
					//keyChar로는 F1을 강제할 수 없음
					c.setBackground(Color.yellow);
				} else {
					c.setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		la.setSize(200, 20);
		la.setLocation(0, 50);
		c.add(la);
		
		
		setVisible(true);
		setSize(300, 150);
		
		
		//키를 입력받기 위해서 포커스 줌
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		// title : Key Code 예제, F1키 : 초록색, %키 : 노란색
		// size : 300, 150 
		// 눌린 키 출력하기는 JLabel을 이용하여 컨텐트팬에 출력하기 
		// F1키가 눌렸습니다., 5키가 눌렸습니다.
		
		
		new Exercise_ChangeBackground();

	}

}
