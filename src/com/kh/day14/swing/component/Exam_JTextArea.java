package com.kh.day14.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Exam_JTextArea extends JFrame{

	
	private JLabel textLabel;
	private JTextField fieldLabel;
	private JTextArea areaLabel;
	private JScrollPane scrollPane;
	
	public Exam_JTextArea() {
		
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        Container c = getContentPane();
		
		c.setLayout(new FlowLayout());  //FlowLayout 사용
		
		//객체생성
		textLabel = new JLabel("입력 후 <Enter> 키를 입력하세요.");
		fieldLabel = new JTextField(20);
		areaLabel = new JTextArea(7,20);
		scrollPane = new JScrollPane(areaLabel);
		
		c.add(textLabel);
		c.add(fieldLabel);
//		c.add(areaLabel);
		c.add(scrollPane);
		
		fieldLabel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField jt = (JTextField)e.getSource();
				areaLabel.append(jt.getText() + "\n");
				jt.setText("");
				
			}
		});

		
		
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Exam_JTextArea();
	}
}
