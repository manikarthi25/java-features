package com.manikarthi25.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateTimeExample {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now(); // YYYY-mm-DD
		System.out.println("LocalDate : " + localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime : " + localTime); // HH:MM:SS.NS
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime : " + localDateTime); // YYYY-mm-DD HH:MM:SS.NS

	}

}
