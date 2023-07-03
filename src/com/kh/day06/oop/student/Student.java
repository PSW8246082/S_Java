package com.kh.day06.oop.student;

public class Student {
	//이름
	//첫번재 성적
	//두번째 입력
	//평균 출력
	
	private String name;
	private int firstScore;
	private int secondScore;
	private double avg;
	
	
	public Student() {
		
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	
	
	
	
	
	
	
	
	public double getAvg() {
		double result = (this.firstScore + this.secondScore) / 2;
		return result;
	}
	
	
	
	public String getName() {
		return this.name;
	}
	public int getFirstScore() {
		return this.firstScore;
	}
	public int getSecondScore() {
		return this.secondScore;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	
	
	
	
	
	
	

}
