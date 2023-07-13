package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Exam_JSlider extends JFrame{

	
	
	
	public Exam_JSlider() {
		
		setTitle("JSlider 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        Container c = getContentPane();
		
		c.setLayout(new FlowLayout());  //FlowLayout 사용
		
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);   //숫자
		slider.setPaintTicks(true);    //눈금
		slider.setMajorTickSpacing(50);  //눈금 중간값 (나눠떨어지는값으로 설정해야함)
		slider.setMinorTickSpacing(10);  //눈금 최솟값
		slider.setPaintTrack(true);    //기본값이 true, false를 하면 track 바가 사라짐..
		c.add(slider);
		

		

		
		
		
		setSize(300, 100);
		setVisible(true);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Exam_JSlider();
	}
}
