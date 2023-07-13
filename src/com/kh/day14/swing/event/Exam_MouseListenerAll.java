package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_MouseListenerAll extends JFrame{

	private JLabel la;
	
	public Exam_MouseListenerAll() {
		
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		la = new JLabel("No Mouse Event");
		
		c.setLayout(new FlowLayout());
		c.add(la);
		
		MyMouseListener listener = new MyMouseListener();
		//각각 하나씩 추가해줘야함.(이벤트핸들러를 연결해서 동작하게 해줌)
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	
	//내부클래스 -> 클래스 앞에 private 추가
	// extends 다중상속 불가, implements는 다중상속 가능
	//상속받은 추상메소드를 오버라이딩 하면 모든 메소드들이 나타남.  
	private class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// 마우스가 창 안에 들어가있으면 초록색 (마우스리스너)
			Component c = (Component)e.getSource(); //Component는 추상클래스, 형변환해줌
			c.setBackground(Color.GREEN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// 마우스가 창 밖에 나와있으면 빨간색 (마우스리스너)
			Component c = (Component)e.getSource(); //Component는 추상클래스, 형변환해줌
			c.setBackground(Color.red);	
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// 클릭하고 움직이면 좌표 찍어주기 (마우스모션리스너)
			la.setText("MouseDragged "+ (e.getX() + "," + e.getY()));
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			//움직이면 좌표 찍음 (마우스모션리스너)
			la.setText("MouseMoved "+ (e.getX() + "," + e.getY()));
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		new Exam_MouseListenerAll();

	}

}



//외부클래스
