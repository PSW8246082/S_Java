package com.kh.day01.operator;

public class Exam_Unary {
	public static void main(String [] args)
	{
		//단항 연산자
		int a = 1;
		
		// a++ , ++a : a = a + 1 위치에 따라 달라짐
		
		System.out.println(a++); //후위연산(나중연산)
		//여기서 a가 2인 상태임
		System.out.println(a++);
		//여기서 a가 3인 상태임
		System.out.println(a);
		System.out.println(++a); //전위연산(먼저연산)
		
		


		//1. a = 10, b = 20, c = 30 
		//
		//
		// a++,         
		// a = 11,         
		//               
		//
		//b = (--a)+b,
		//b = 10+20 
		//b = 30  다시 생각해보세요
		//
		//
		//
		//c=(a++)+(--b)
		//c = 10+29
		//c = 39
		//
		//b =  29
		//
		//
		//
		//2. !!!!flag;
		//true -> false -> true -> false -> true
		//
		//
		//
		//
		//3. x = 100,   y = 33,     z =0
		//
		//x--;     x = 99
		//z = x-- + --y;      131(z) = 99(x) + 32(y)   x=98,  y = 32,  z = 131
		//x = 99 + x++ + x;     295(x) = 99 + 98(x) + 98(x)   x = 295  다시 생각해보세요
		//y = y-- + y + ++y;     97(y) = 32(y) + 32(y) + 33(y) 다시 생각해보세요
		//
		//
		//x = 99 + x++ + x;     
		//296(x) = 99 + 98(x)(여기서) + 99(x)(후위 연산된 결과가 들어감)   x = 296  y = 32,  z = 131
		//
		//
		//위에 연산에서 값이 넘어오니까 y는 32에서 시작한다.
		//y = y-- + y + ++y;     95(y) = 32(y) + 31(y) + 32(y)

		
		
	}

}
