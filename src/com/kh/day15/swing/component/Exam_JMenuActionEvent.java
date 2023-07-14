package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JMenuActionEvent extends JFrame{

	private JLabel imgLabel;
	
	public Exam_JMenuActionEvent() {
		
		
		setTitle("메뉴에 리스너 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createMenu();
		
		Container c = getContentPane();  //컨텐츠팬
		c.setLayout(new BorderLayout());  // BorderLayout() 사용, top, botton, left, right, center로 이루어짐
		
		
		imgLabel = new JLabel();   //이미지 들어갈 라벨
		c.add(imgLabel, BorderLayout.CENTER);
		
		
		setSize(250, 220);
		setVisible(true);
	}
	
	
	private void createMenu() {   //메뉴바를 만들기 위한 메소드를 따로 빼둔것
		JMenuBar bar = new JMenuBar();   //메뉴바
		JMenu screenmenu = new JMenu("screen");  // 메뉴
		
		String [] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
		for(int i = 0; i < 4; i++) {
			JMenuItem menuItem = new JMenuItem(itemTitle[i]);  //아이템(메뉴 밑에 들어감)
			menuItem.addActionListener(new ActionListener() {  //아이템이 선택되었을때
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand(); //아이템이 눌렸을 때 아이템의 텍스트 갖고오기
					
					switch(cmd) {  // else if 보다 빠른 switch case
					case "Load" : 
						if(imgLabel.getIcon() != null) return;    //이미 로딩시 리턴
						imgLabel.setIcon(new ImageIcon("images/img.jpg"));
						break;
					case "Hide" : 
//						imgLabel.setIcon(null);
						imgLabel.setVisible(false);
						break;
					case "ReShow" :
						imgLabel.setVisible(true);
						break;
					case "Exit" : 
						System.exit(0);
						break;
					}

					//switch문으로 바꾸기
//					if(cmd.equals("Load")) {
////						setTitle(cmd);  동작하는거 확인됨 -> 이미지를 로드하면 됨
//						
//					} else if(cmd.equals("Hide")) {
//						
//					} else if(cmd.equals("ReShow")) {
//						
//					} else if(cmd.equals("Exit")) {
//						
//					}
				}
			});
			screenmenu.add(menuItem);
			
		}
		
		//for문으로 바꾸기
//		screenmenu.add(new JMenuItem("Load"));
//		screenmenu.add(new JMenuItem("Hide"));
//		screenmenu.add(new JMenuItem("ReShow"));
//		screenmenu.add(new JMenuItem("Exit"));
		
		bar.add((screenmenu));
		setJMenuBar(bar);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Exam_JMenuActionEvent();

	}

}
