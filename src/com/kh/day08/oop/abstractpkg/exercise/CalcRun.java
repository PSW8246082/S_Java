package com.kh.day08.oop.abstractpkg.exercise;

public class CalcRun {

	public static void main(String[] args) {
		
//		Calculator calc = new Calculator();
//		Cannot instantiate the type Calculator
//		추상클래스는 객체생성 안됨(인스턴스화 안됨)
		
		//업캐스팅
		Calculator calc = new GoodCalc(); 
		
		int [] a = {1,2,3,4,5};
		System.out.printf("합 : %d\n", calc.add(1, 2));
		System.out.printf("차 : %d\n", calc.substract(20, 10));
		System.out.printf("평균 : %.2f\n", calc.average(a));



	}

}
