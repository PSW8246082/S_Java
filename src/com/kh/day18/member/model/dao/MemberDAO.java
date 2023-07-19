package com.kh.day18.member.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.day18.member.model.vo.Member;
import com.kh.day18.member.view.MemberView;

public class MemberDAO {

	private List<Member> mList;
//	private MemberView view;
	
	
	public MemberDAO() {
//		view = new MemberView();
		mList = new ArrayList<Member>();
	}
	
	

	
	//이름으로 인덱스 찾기
	public int findIndexByName(String name) {
		for(int i = 0; i < mList.size(); i++) {
			if(mList.get(i).getMemberName().equals(name)) {
				return i;
			}
		}
		return -1;   //for문을 다돌고 못찾았을때 리턴값
	}




	//이름으로 회원 정보 찾기
	public Member findOneByName(String name) {
		for(int i = 0; i < mList.size(); i++) {
			if(mList.get(i).getMemberName().equals(name)) {
				return mList.get(i);
			}
		}
		return null;
	}




	//회원 전체 정보 조회
	public List<Member> allMemberList() {
		return mList;
	}




	//회원 정보 등록
	public void addMember(Member member) {
		mList.add(member);
	}




	//회원정보 수정
	public void modifyMember(int index, Member mOne) {
		mList.set(index, mOne);
	}


	//회원 정보 삭제
	public void subMember(int index) {
		mList.remove(index);
	}
}
