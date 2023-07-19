package com.kh.day18.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day18.music.controlloer.MusicController;
import com.kh.day18.music.model.vo.Music;

public class MusicView {
	
	private MusicController mControlloer;
	
	//생성자
	//객체생성, 초기화  -> 객체 사용되어질 수 있음
	public MusicView() {
		mControlloer = new MusicController();
	}
	
	public void startProgram() {
		
		Music music = null;
		List<Music> mList = null;
		String singer = "";
		int index = -1;
		
		end :
		while(true) {
			
			int choice = printMenu();
			
			switch(choice) {
			case 1 : 
				music = inputMusic();
				mControlloer.addMusic(music);
				break;
			case 2 : 
				singer = inputSinger();
				index =  mControlloer.findIndexBySinger(singer);
				if(index != -1) {
					music = mControlloer.findMusicBySinger(singer);
					music = modifyMusic(music);
					mControlloer.modifyMusic(index, music);
				}
				break;
			case 3 : 
				singer = inputSinger();
				index = mControlloer.findIndexBySinger(singer);
				mControlloer.deleteMusic(index);
				break;
			case 4 : 
				singer = inputSinger();
				mList = mControlloer.findListBySinger(singer);
				printAllMusics(mList);
				break;
			case 5 : 
				mList = mControlloer.allMusicInfo();
				printAllMusics(mList);
				break;
			case 6 : break end;
			
			
			}
		}
	}
	
	private Music modifyMusic(Music music) {
		Scanner sc = new Scanner(System.in);
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		music.setTitle(title);
		music.setSinger(singer);
		return music;
	}

	private String inputSinger() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		return singer;
	}

	private void printAllMusics(List<Music> mList) {
		for(int i = 0; i < mList.size(); i++) {
			Music music = mList.get(i);
			System.out.printf("%d번째곡 -> 가수명 : %s\t곡명 : %s\n"
					, (i+1)
					, music.getSinger()
					, music.getTitle());
		}
//		for(Music music : mList) {
//			//인덱스 신경 안써도 됨 포이치문
//		}
		
	}

	private Music inputMusic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 음악 정보 등록 ======");
		System.out.println("곡명 : ");
		String title = sc.nextLine();
		System.out.println("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 음악관리 프로그램 ======");
		System.out.println("1. 음악 정보 등록");
		System.out.println("2. 음악 정보 수정");
		System.out.println("3. 음악 정보 삭제");
		System.out.println("4. 음악 정보 출력(가수명)");
		System.out.println("5. 음악 정보 전체 출력");
		System.out.println("6. 프로그램 종료");
		int number = sc.nextInt();
		return number;
	}

}
