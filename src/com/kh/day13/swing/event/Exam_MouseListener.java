package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseListener extends JFrame{

	public Exam_MouseListener() {
		
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel la = new JLabel("Hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(la);
		c.addMouseListener(new MouseListener() {
			//MouseListener() 인터페이스, 
			// 모든 추상 메소드를 오버라이딩(재정의) 해야함.
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);	
			}
			@Override
			public void mouseExited(MouseEvent e) {
					
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
		
			}
		});
		
				
		setSize(250, 250);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {

		new Exam_MouseListener();

	}

}
