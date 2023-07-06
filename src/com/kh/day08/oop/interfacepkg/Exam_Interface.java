package com.kh.day08.oop.interfacepkg;

public class Exam_Interface {

	public static void main(String[] args) {
		
//		Cannot instantiate the type PhoneInterface
//		PhoneInterface phone = new PhoneInterface();
//		인터페이스로 객체 생성 안됨.
		
		
		//업캐스팅
		PhoneInterface phone = new SamsungPhone();
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
	}

}
