package com.kh.day07.oop.polymorphism.instnceof;

public class Exam_InstanceOf {
	
	static void print(Person person) {
		//person = new Person();
		//person = new Student();  person을 상속받은 클래스의 인스턴스(Student())도 넣을 수 있음
		//person = new Researcher();  person을 상속받은 클래스의 인스턴스(Researcher())도 넣을 수 있음
		//person = new StudentWorker();  person을 상속받은 클래스의 인스턴스(StudentWorker())도 넣을 수 있음
		//person = new Professor();  person을 상속받은 클래스의 인스턴스(Professor())도 넣을 수 있음
		
		if(person instanceof Student) {
			System.out.println("Student 입니다.");
			System.out.println();
		}
		if(person instanceof Researcher) {
			System.out.println("Researcher 입니다.");
			System.out.println();
		}
		if(person instanceof StudentWorker) {
			System.out.println("StudentWorker 입니다.");
			System.out.println();
		}
		if(person instanceof Professor) {
			System.out.println("Professor 입니다.");
			System.out.println();
		}
		
	}
	
	
//	static void print(Student Student) {
//		System.out.println("Student 입니다.");
//	}
//	static void print(Researcher resercher) {
//		System.out.println("resercher 입니다.");
//	}
//	static void print(StudentWorker studentWorker) {
//		System.out.println("studentWorker 입니다.");
//	}
//	static void print(Professor professor) {
//		System.out.println("professor 입니다.");
//	}

	
	
	public static void main(String[] args) {
//		Student student = new Student();
		print(new Student());
//		Researcher resercher = new Researcher();
		print(new Researcher());
		print(new StudentWorker());
		print(new Professor());

	}

}
