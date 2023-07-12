package com.kh.day13.swing.event;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_AnonymousClassListener extends JFrame{
	
	public Exam_AnonymousClassListener() {
		
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		
		//ActionListener() 이런식으로 객체생성 안됨, 인터페이스이기 때문에
		//따라서 내부/외부 클래스 만들 필요 없음, 재정의만 해주면 됨(익명으로 리스너 만드는 방식)
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				if(btn.getText().equals("Action")) {
					btn.setText("액션");
				} else {
					btn.setText("Action");
				}	
			}
		});
		
		c.add(btn);
		
		
		setSize(350, 150);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		
		new Exam_AnonymousClassListener();

	}

}
