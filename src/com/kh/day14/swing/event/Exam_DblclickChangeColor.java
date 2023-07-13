package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Exam_DblclickChangeColor extends JFrame{

	public Exam_DblclickChangeColor() {
		
		setTitle("Click and Dbl Click Change BackgroundColor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		MyMouseListener Lst = new MyMouseListener();
		c.addMouseListener(Lst);
		
		
		setSize(300, 200);
		setVisible(true);
	}
	
	
	
	
	
	
	
	//더블클릭 구현, 클릭 카운트 수가 2면 더블 클릭임.
	//어댑터는 필요한 것만 오버라이딩 할 수 있음
		private class MyMouseListener extends MouseAdapter {
			@Override  
			public void mouseClicked(MouseEvent e) {
				//클릭이 되면 배경색이 바뀐다.
				if(e.getClickCount() == 2) {
					// random값 구하는 법
					// (int) Math.random() * (최댓값 - 최솟값 +1) + 최소값
					// 0~ 255범위의 랜덤한 수를 출력하는 방법
					int red = (int)(Math.random()*256);  
					int green = (int)(Math.random()*256);
					int blue = (int)(Math.random()*256);
					Component c = (Component)e.getSource();
//					c.setBackground(Color.black);
//					c.setBackground(new Color(0,0,255));
					c.setBackground(new Color(red,green,blue));
				}
			}
		}
		
		
		
		
		
		
//	//어댑터는 필요한 것만 오버라이딩 할 수 있음
//	private class MyMouseListener extends MouseAdapter {
//		@Override  
//		public void mouseClicked(MouseEvent e) {
//			//클릭이 되면 배경색이 바뀐다.
//			Component c = (Component)e.getSource();
//			c.setBackground(Color.black);
//		}
//	}
	
	
	
	
	
//	private class MyMouseListener implements MouseListener {
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//			Component c = (Component)e.getSource();
//			c.setBackground(Color.black);
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}
	
	
	
	
	

	public static void main(String[] args) {	
		new Exam_DblclickChangeColor();
	}

	

}
