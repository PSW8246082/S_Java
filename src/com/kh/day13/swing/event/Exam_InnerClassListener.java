package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_InnerClassListener extends JFrame{

	public Exam_InnerClassListener() {
		
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());  //동작할 코드가 있는 클래스를 넣어줘야함
		c.add(btn);
		
		
		setSize(350, 150);
		setVisible(true);
		
	}
	
	
	//이너클래스 - 외부의 접근을 차단함. + private
	private class MyActionListener implements ActionListener{
		
//		인터페이스(ActionListener)는 추상메소드만 있음 -> 오버라이딩 해줘야함.
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action")) {
				btn.setText("액션");
			} else {
				btn.setText("Action");
			}
			//외부 클래스의 this.setTitle에 이너클래스 btn.getText() 값 넣어주기?
			Exam_InnerClassListener.this.setTitle(btn.getText() + " 이벤트 리스너 예제");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		new Exam_InnerClassListener();

	}

}


