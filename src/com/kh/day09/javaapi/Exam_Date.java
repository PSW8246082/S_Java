package com.kh.day09.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat trans1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		String transDate1 = trans1.format(date);
		String transDate2 = trans2.format(date);
		System.out.println("형식변환1 : " + transDate1);
		System.out.println("형식변환2 : " + transDate2);
		
//		======================== 권장사항 ===========================
		//캘린더(추상클래스) 쓰기.(나라마다 다를 수 있어서 추상클래스임)
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		String changed = trans2.format(calendar.getTime());
		System.out.println("그레고리안 달력 날짜 변환 : " +  changed);
	
	
	}

}
