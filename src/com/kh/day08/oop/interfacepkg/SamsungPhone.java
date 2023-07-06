package com.kh.day08.oop.interfacepkg;

public class SamsungPhone implements PhoneInterface{
	
	//The type SamsungPhone must implement the inherited abstract method PhoneInterface.receiveCall()
	//오버라이딩 해줘야함, 빨간줄에 마우스 키 올려서 add해주기.
	
	
	//The type PhoneInterface cannot be the superclass of SamsungPhone; a superclass must be a class
	//extends 안된다는 뜻
	
	
	
	@Override
	public void receiveCall() {
		System.out.println("여보세요");
		
	}

	@Override
	public void sendCall() {
		System.out.println("~~");
		
	}

	@Override
	public void printLogo() {
		System.out.println("== SAMSUNG ==");

		
	}


	
}
