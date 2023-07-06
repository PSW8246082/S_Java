package com.kh.day08.oop.interfacepkg.music;

public class Drum implements Instrument{

	@Override
	public void tunning() {
		System.out.println("드럼 튜닝");
		
	}

	@Override
	public void playInstrument() {
		System.out.println("드럼 소리");
		
	}

}
