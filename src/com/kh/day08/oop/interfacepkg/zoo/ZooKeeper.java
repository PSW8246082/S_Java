package com.kh.day08.oop.interfacepkg.zoo;

public class ZooKeeper {
	
	public void feed(FoodInterface predator) {
		System.out.println("feed " + predator.animalFood());
	}

//위에 두 줄로 줄여줄 수 있음..인터페이스 이용해서.	
////	오버로딩 : 매개변수의 개수는 같으나 타입(Bear,Tiger,Lion)이 다르다.
//	public void feed(Bear bear) {
//		System.out.println("feed" + bear.animalFood());
//	}
//	
//	public void feed(Tiger tiger) {
//		System.out.println("feed" + tiger.animalFood());
//	}
//	
//	public void feed(Lion lion) {
//		System.out.println("feed" + lion.animalFood());
//	}
	
	
	
	
	
//	animalFood()가 오버라이딩 되어있어서 해당 메소드가 실행됨...
	
	public static void main(String [] args) {
		ZooKeeper zk = new ZooKeeper();
		zk.feed(new Bear());
		zk.feed(new Tiger());
		zk.feed(new Lion());
	}
	
	
	
	
	
	

}
