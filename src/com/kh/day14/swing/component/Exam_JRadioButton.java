package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Exam_JRadioButton extends JFrame{
	
	public Exam_JRadioButton() {
		
		setTitle("JRadioButton 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
         Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherry = new ImageIcon("images/selectedcherry.jpg");
		
		
		//값("사과") 옆에 , 찍고 true 붙여주면 기본값으로 선택이 된 상태에서 시작됨
		// 값("사과") 옆에 , 찍고 이미지도 넣어줄 수 있음
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherry);
		
		
		// 라디오 버튼이 하나만 선택되도록 해주는 버튼 그룹
		// input[type=radio] 태그의 name을 맞춰주는 것과 같음
		ButtonGroup g = new ButtonGroup();
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		
		setSize(400, 600);
		setVisible(true);
		
		
		
	}
	
	

	public static void main(String[] args) {
		new Exam_JRadioButton();

	}

}
