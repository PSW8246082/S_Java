package com.kh.day12.music.run;

import java.util.List;
import java.util.Scanner;

import com.kh.day12.music.controller.MusicController;
import com.kh.day12.music.model.vo.Music;
import com.kh.day12.music.view.MusicView;

public class Run {

	public static void main(String[] args) {
		
		//MusicFunction에 있는 코드를 MusicController/MusicView로 나눴고
		//Run에서 매개변수로 연결해서 동작하게 해줌
		
		MusicView view = new MusicView();
		MusicController mController = new MusicController();
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		Music music = null;
		String title = "";
		int index = 0;
		
		do {
			choice = view.musicMenu();
			
			switch(choice) {
			case 1 : 
				music = view.inputMusicInfo();
				mController.addAtLast(music);
				view.displaySuccess("마지막 위치에 추가 성공!");
				break;
			case 2 : 
				music = view.inputMusicInfo();
				mController.addAtZero(music);
				view.displaySuccess("첫 위치에 추가 성공!");
				break;
			case 3 : 
				List<Music> allList = mController.printMusicList();  //여러개니까 List<Music> 
				view.showAllMusicList(allList);
				view.displaySuccess("전체정보 조회 성공");
				break;
			case 4 : 
				title = view.inputMusicName("검색");  //리턴된 값을 String title로 받을 수 있음
				List<Music> searchList = mController.searchMusicsByName(title);  //검색 결과값이 여러개니까 List<Music> 
				view.showAllMusicList(searchList);
				view.displaySuccess("검색한 " + title + " 조회 성공!");
				break;
			case 5 : 
				title = view.inputMusicName("삭제");
				index = mController.searchOneByTitle(title);
				if(index == -1) {
					view.displayError("존재하지 않습니다.");
					break;
				}
				mController.removeMusic(index);
				view.displaySuccess("곡 삭제 성공!");
				break;
			case 6 :
				//수정할 곡 입력받고
				title = view.inputMusicName("수정");  
				//존재 여부 확인
				index = mController.searchOneByTitle(title);  
				if(index == -1) {
					view.displayError("존재하지 않습니다.");
					break;
				}
				//이후 수정하기
				//수정할 정보 입력받기
				music = view.modifyMusicInfo();
				//수정하기
				mController.updateMusic(index, music);
				break;
			case 7 : 
				view.printMessage("========== 곡명 오름차순 정렬 ============");
				mController.bubbleSortByTitleASC();
				view.displaySuccess("정렬 성공! 3번을 눌러 출력해주세요");
				break;
			case 8 : 
				view.printMessage("========== 곡명 내림차순 정렬 ============");
				mController.bubbleSortByTitleDESC();
				view.displaySuccess("정렬 성공! 3번을 눌러 출력해주세요");
				break;
			case 9 :
				view.printMessage("========== 가수명 오름차순 정렬 ============");
				mController.bubbleSortBySingerASC();
				view.displaySuccess("정렬 성공! 3번을 눌러 출력해주세요");
				break;
			case 10 :
				view.printMessage("========== 가수명 내림차순 정렬 ============");
				mController.bubbleSortBySingerDESC();
				view.displaySuccess("정렬 성공! 3번을 눌러 출력해주세요");
				break;
			case 0 :
				view.printMessage("프로그램을 종료합니다.");
				break;
			default :
				view.printMessage("잘못 입력하셨습니다.");
				break;
			}
			
		} while(choice != 0);
		
	}
	
}
