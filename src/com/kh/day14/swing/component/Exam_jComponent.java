package com.kh.day14.swing.component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// ** getSource( ) 메서드는 이벤트를 발생시킨 이벤트 소스 객체를 얻어온다.
// ** 메소드를 사용해서 이벤트리스너를 등록한 무언가를 실행할 시, 그 이벤트가 실행되는 특정 컨테이너(?)의 모든 속성을 가져올 수 있다 ...

public class Exam_jComponent extends JFrame{
	
	public Exam_jComponent() {
		
//		setTitle("jComponent의 공통 메소드 예제");
		super("jComponent의 공통 메소드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Magenta/Yellow Button");
		JButton btn2 = new JButton("Disabled Button");
		JButton btn3 = new JButton("getX(), getY()");
		
		btn1.setBackground(Color.yellow);  //배경색 설정
		btn1.setForeground(Color.magenta);  //글씨색 설정
		btn1.setFont(new Font("Arial", Font.ITALIC, 20));
		
		btn2.setEnabled(false);
		
		btn3.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton jb = (JButton)e.getSource(); //이벤트가 발생한 컴포넌트(요소)를 나타냄
				//버튼이 가지고 있는 최상위 버튼을 가져옴
				Exam_jComponent frame = (Exam_jComponent)jb.getTopLevelAncestor();
			    frame.setTitle(jb.getX() + "," + jb.getY());
				
			}
		});
		
		//추가해야 실행됨...
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		setSize(300, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Exam_jComponent();

	}

}
