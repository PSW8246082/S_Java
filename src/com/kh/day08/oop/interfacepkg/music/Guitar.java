package com.kh.day08.oop.interfacepkg.music;

public class Guitar implements Instrument{

	@Override
	public void tunning() {
		System.out.println("기타 튜닝");		
	}

	@Override
	public void playInstrument() {
		System.out.println("기타 소리");
		
	}

}
