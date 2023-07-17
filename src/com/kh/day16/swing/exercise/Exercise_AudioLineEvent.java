package com.kh.day16.swing.exercise;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_AudioLineEvent extends JFrame{

	
	private Clip clip;
	private JLabel label;
	
	public Exercise_AudioLineEvent() {
		
		label = new JLabel("애국가 1절");
		
		setTitle("오디오 제어 실습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.setBackground(Color.YELLOW);
		c.add(label);
	
		
		
		setSize(300, 150);
		setVisible(true);
		
		loadAudio("audio/애국가1절.wav");
	}
	

	private void loadAudio(String audioPath) {
		try {
			//클립은 도구, 도구가 Stream 사용
			clip = AudioSystem.getClip();    //비어있는 오디오 클립 생성
			File audioFile = new File(audioPath);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);  //오디오 스트림 생성
			clip.open(audioStream);  //오디오 스트림을 이용하여 오디오 클립
			clip.addLineListener(new LineListener() {
				
				@Override
				public void update(LineEvent event) {
					if(event.getType() == LineEvent.Type.STOP)  { // 노래가 끝났는지 아닌지 알려주는 메소드
						getContentPane().setBackground(Color.ORANGE);  //노래가 끝나면 배경색 변경
						label.setText("연주 끝났습니다.");   //노래가 끝나면 텍스트 변경
					}
					try {
						audioStream.close();  //Stream 자원을 사용한 후 스트림을 닫아 해제해줘야한다.
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					
				}
			});  // 노래가 끝날 때 동작
			clip.start();   // 프로그램 시작하자마자 노래 시작
			
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}


	public static void main(String[] args) {
		new Exercise_AudioLineEvent();

	}

}
