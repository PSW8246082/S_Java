package com.kh.day09.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	
	//정리안됨...강사님 파일 보고 정리해라...
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
			
//		System.out.println(today.get(Calendar.YEAR));
//		System.out.println(today.get(Calendar.MONTH)+1);
//		System.out.println(today.get(Calendar.DAY_OF_MONTH));
//		System.out.println(today.get(Calendar.DAY_OF_WEEK));
//		System.out.println(today.get(Calendar.HOUR_OF_DAY));
//		System.out.println(today.get(Calendar.HOUR));
//		System.out.println(today.get(Calendar.MINUTE));
//		System.out.println(today.get(Calendar.SECOND));
//		System.out.println(today.get(Calendar.MILLISECOND));
		
		
		Calendar openDate = Calendar.getInstance();
		openDate.clear();
		openDate.set(2023, 4, 15);
//		openDate.set(Calendar.HOUR_OF_DAY, 9);
//		openDate.set(Calendar.MINUTE, 0);
		
		
//		System.out.println(openDate.get(Calendar.YEAR));
//		System.out.println(openDate.get(Calendar.MONTH)+1);
//		System.out.println(openDate.get(Calendar.DAY_OF_MONTH));
//		System.out.println(openDate.get(Calendar.DAY_OF_WEEK));
//		System.out.println(openDate.get(Calendar.HOUR_OF_DAY));
//		System.out.println(openDate.get(Calendar.HOUR));
//		System.out.println(openDate.get(Calendar.MINUTE));
//		System.out.println(openDate.get(Calendar.SECOND));
//		System.out.println(openDate.get(Calendar.MILLISECOND));
		
		
		Exam_Calendar ex = new Exam_Calendar();
		ex.printCalendar(null, openDate);
		
		
//		오류 : Cannot make a static reference to the non-static method printCalendar(String, Calendar) from the type Exam_Calendar
//		객체를 만들거나 static을 만들거나.
		
		Calendar closeDate = Calendar.getInstance();
		closeDate.clear();
		closeDate.set(2023, 9, 26, 5, 50);
		closeDate.set(Calendar.HOUR_OF_DAY, 17);
		
		new Exam_Calendar().printCalendar("현재", today);
		new Exam_Calendar().printCalendar("개강일", openDate);
		new Exam_Calendar().printCalendar("종강일", closeDate);
		
	}
	
//	현재 2022/12/7 수요일(11시) 오전 11시 42분 33초 234밀리초
	public static void printCalendar(String title, Calendar cal) {
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		
		
		System.out.println(title + " ");
		System.out.print(cal.get(Calendar.YEAR) + "/" 
		+ (cal.get(Calendar.MONTH)+1) + "/" 
		+ cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("/");
		switch(dayOfWeek) {
		case Calendar.SUNDAY : System.out.print("일요일"); break;
		case Calendar.MONDAY : System.out.print("월요일"); break;
		case Calendar.TUESDAY : System.out.print("화요일"); break;
		case Calendar.WEDNESDAY : System.out.print("수요일"); break;
		case Calendar.THURSDAY : System.out.print("목요일"); break;
		case Calendar.FRIDAY: System.out.print("금요일"); break;
		case Calendar.SATURDAY : System.out.print("토요일"); break;
		}
		
		System.out.println("/" + cal.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("(" + cal.get(Calendar.HOUR_OF_DAY) + ") ");
		
		System.out.println(cal.get(Calendar.HOUR) + "시 ");
		System.out.println(cal.get(Calendar.MINUTE) + "분 ");
		System.out.println(cal.get(Calendar.SECOND) + "초 ");
		System.out.println(cal.get(Calendar.MILLISECOND) + "밀리초");
		
		

	
	}
	
	
	
	
	
	
	
	
	
	



}
