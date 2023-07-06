package com.kh.day08.oop.interfacepkg.music;

public class Piano implements Instrument{

	@Override
	public void tunning() {
		System.out.println("피아노 튜닝");
		
	}

	@Override
	public void playInstrument() {
		System.out.println("피아노 소리");
		
	}

}
