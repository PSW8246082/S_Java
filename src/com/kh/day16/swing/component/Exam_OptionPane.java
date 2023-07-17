package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exam_OptionPane extends JFrame{
	
	public Exam_OptionPane() {
		
		setTitle("옵션 팬 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		c.add(new Mypane(), BorderLayout.NORTH);
		
		
		setSize(500,200);
		setVisible(true);
	}
	
	
	
	
	
	//내부 클래스, 콘텐트 팬처럼 여러가지 요소를 담을 수 있는 팬이 됨.
	private class Mypane extends Panel{
		
		private JButton inputBtn;  //전역변수로 만들어줌
	    private JButton confirmBtn;
	    private JButton msgBtn;
	    private JTextField tf;

		public Mypane() {
			setBackground(Color.LIGHT_GRAY);
			
			inputBtn = new JButton("Input Name");  //초기화
			confirmBtn = new JButton("Confirm");
			msgBtn = new JButton("Message");
			tf = new JTextField(10);

			inputBtn.addActionListener(new ActionListener() {  //input버튼이 눌리면 동작하도록 함
				//익명 클래스를 이용하여 동작하는 코드를 적음
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름을 입력하세요.");  //JS에 prompt와 동일
					if(name != null) {
						tf.setText(name);   //텍스트 필드에 입력값이 추가되어 보이도록.
					}
				}
			});   
			
			confirmBtn.addActionListener(new ActionListener() {    // confirmBtn.addActionListener  ->  confirm 버튼이 눌리면 동작하도록 함
				//익명 클래스를 이용하여 동작하는 코드를 적음  new ActionListener()
				@Override
				public void actionPerformed(ActionEvent e) {
					int choice = JOptionPane.showConfirmDialog(null, "계속할 것입니까?", "confirm", JOptionPane.YES_NO_OPTION);
//					if(choice == JOptionPane.CLOSED_OPTION)  // x표시를 누르면 ~
					if(choice == JOptionPane.YES_OPTION) {
						tf.setText("Yes");
					}
					else if(choice == JOptionPane.NO_OPTION) {
						tf.setText("No");
					}
				}
			});
			
			msgBtn.addActionListener(new ActionListener() {  //msgBtn.addActionListener  ->  msgBtn버튼이 눌리면 동작하도록 함
				//익명 클래스를 이용하여 동작하는 코드를 적음  new ActionListener()
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "조심하세요", "message", JOptionPane.ERROR_MESSAGE);
				}
			});
			
			add(inputBtn);
			add(confirmBtn);
			add(msgBtn);
			add(tf);
		}
		
	}

	
	
	
	
	public static void main(String[] args) {
		
		new Exam_OptionPane();

	}

}
