package com.kh.day11.hw;

public class HotelMember {
	
	private String name;
	private int age;
	private int grade;
	private boolean reserveYn;
	private int reserveNum;
	private static int serialNum = 10000;
	
	public HotelMember() {
		reserveNum = serialNum;
		 serialNum++;
	}
	public HotelMember(String name, int age, int grade, boolean reserveYn) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.reserveYn = reserveYn;
	}
	
	
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int getGrade() {
		return this.grade;
	}
	public boolean getReserveYn() {
		return this.reserveYn;
	}
	public int getReserveNum() {
		return this.reserveNum;
	}
	public int getSerialNum() {
		return this.serialNum;
	}
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setReserveYn(boolean reserveYn) {
		this.reserveYn = reserveYn;
	}
	public void setReserveNum(int reserveNum) {
		this.reserveNum = reserveNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

}
