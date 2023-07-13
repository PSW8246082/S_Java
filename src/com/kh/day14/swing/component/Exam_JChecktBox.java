package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Exam_JChecktBox extends JFrame{
	
	
	public Exam_JChecktBox() {
		
		setTitle("JButton 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
         Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedCherry = new ImageIcon("images/selectedcherry.jpg");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배");
		
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		cherry.setBorderPainted(true); //체크 시 음각 양각
		cherry.setSelectedIcon(selectedCherry);
		
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		
		setSize(400, 600);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {

		new Exam_JChecktBox();
		
	}

}
