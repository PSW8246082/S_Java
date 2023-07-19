package com.kh.day18.music.controlloer;

import java.util.List;

import com.kh.day18.music.model.dao.MusicDAO;
import com.kh.day18.music.model.vo.Music;

public class MusicController {

	private MusicDAO musicDao;
	
	
	public MusicController() {
		musicDao = new MusicDAO();
	}
	
	/**
	 * 곡정보 등록 
	 * @param music
	 */
	public void addMusic(Music music) {
		musicDao.addMusic(music);
		
	}

	/**
	 * 전체 정보 출력
	 * @return
	 */
	public List<Music> allMusicInfo() {
		List<Music> mList = musicDao.allMusicInfo();
		return mList;
	}

	public List<Music> findListBySinger(String singer) {
		List<Music> mList = musicDao.findListBySinger(singer);
		return mList;
	}

	public int findIndexBySinger(String singer) {
		int index = musicDao.findIndexBySinger(singer);
		return index;
	}

	public void deleteMusic(int index) {
		musicDao.deletMusic(index);
		
	}

	public Music findMusicBySinger(String singer) {
		Music music = musicDao.findMusicBySinger(singer);
		return music;  //리턴은 null/0 으로 두지 않는다.(값이나 변수 꼭 넣을것.)
	}

	public void modifyMusic(int index, Music music) {
		musicDao.updateMusic(index, music);
		
	}

}
