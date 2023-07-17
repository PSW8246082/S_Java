package com.kh.day16.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Exam_JFileChooser extends JFrame{

	private JLabel imgLabel;
	
	public Exam_JFileChooser() {
		
		imgLabel = new JLabel();
		
		setTitle("메뉴와 파일Chooser 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		createMenu();
		
		c.add(imgLabel);   // 이미지를 표시하는 JLabel 추가
		
		
		setSize(350, 200);
		setVisible(true);
	}
	
	
	private void createMenu() {
		//File
		//Open
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem item = new JMenuItem("Open");
		
		item.addActionListener(new ActionListener() {  //item.addActionListener  ->  Open이 클릭되었을 때 동작하도록.
			//익명클래스를 이용함.
			@Override
			public void actionPerformed(ActionEvent e) {
		
				
				JFileChooser chooser = new JFileChooser();  //파일 선택창을 띄움1
				int chosen = chooser.showOpenDialog(null);  //파일 선택창을 띄움2
				
				// FileChooser 동작 시 비정상적인 선택
				if(chosen != JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
					return;  //밑에 있는 코드를 실행하면 NullPointExecption 발생하기 때문에 종료해줌
				}
				
				
				String filePath = chooser.getSelectedFile().getPath();  //선택한 파일의 경로를 가져오기
				imgLabel.setIcon(new ImageIcon(filePath)); //JLabel에 Image 표시하기
			
			}
		});
		
		menu.add(item);  //메뉴에 아이템 넣어주기
		bar.add(menu);  //메뉴바에 File 넣어주기
		
		
		setJMenuBar(bar);  //메뉴를 콘탠트팬에 올려줌...나타나게..
		
	}


	public static void main(String[] args) {
		new Exam_JFileChooser();

	}

}
