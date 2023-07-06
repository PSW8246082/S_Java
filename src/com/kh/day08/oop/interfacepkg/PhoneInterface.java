package com.kh.day08.oop.interfacepkg;

public interface PhoneInterface {
	//인터페이스는 상수만 가능하다.
	
	
// 1. Illegal modifier for the interface field PhoneInterface.name; only public, static & final are permitted  
//	private String name;  // public만 가능
	
	
	
//	2. The blank final field name may not have been initialized
//	static final이 생략되어 있는데 final은 상수이고 초기화를 시켜줘야 한다.
	public String Name = "";
	public static final int TIME_OUT = 10000;
	
	
	
	
//	Abstract methods do not specify a body 중괄호 없애고 ;
	public abstract void receiveCall();
	void sendCall();
	abstract void printLogo();
	
	
	
	
	public default void showLogo() {
		//디폴트 메소드
		//하위 호환성을 위해서 작성함.
		//하위 호환성을 유지하고 인터페이스의 보안을 위해 작성
		System.out.println("** LG **");
	}
	

}
