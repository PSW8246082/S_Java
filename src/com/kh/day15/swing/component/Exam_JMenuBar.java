package com.kh.day15.swing.component;

import java.awt.Container;
import java.awt.MenuItem;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JMenuBar extends JFrame{

	public Exam_JMenuBar() {
		
		
		setTitle("메뉴 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createMenu();
		
		setSize(250, 200);
		setVisible(true);
	}
	
	
	private void createMenu() {
		JMenuBar bar = new JMenuBar();  // 메뉴바
		
		JMenu screenMenu = new JMenu("screen");   // 메뉴(screen)
		
		
		screenMenu.add(new JMenuItem("Load"));  //메뉴 아이템
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.add(new JMenuItem("Exit"));
		
		bar.add(screenMenu);
		bar.add(new JMenuItem("Edit"));
		bar.add(new JMenuItem("Source"));
		bar.add(new JMenuItem("Project"));
		bar.add(new JMenuItem("Run"));
		
		setJMenuBar(bar);  //프레임에 추가
	}
	
	
	public static void main(String[] args) {
		new Exam_JMenuBar();

	}

}
