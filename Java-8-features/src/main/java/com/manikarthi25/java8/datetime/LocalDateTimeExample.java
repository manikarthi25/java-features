package com.manikarthi25.java8.datetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDateTime localDateTimeNow = LocalDateTime.now();
		System.out.println("localDateTimeNow : " + localDateTimeNow);
		
		LocalDateTime localDateTimeOf = LocalDateTime.of(2020, 05, 20, 11,45,45);
		System.out.println("localDateTimeNow : " + localDateTimeOf);
		
		/**
		 * Get Local date and time  - Access both LocalDate and LocalTime methods
		 */
		System.out.println("getDayOfMonth :" + localDateTimeNow.getDayOfMonth());
		System.out.println(localDateTimeNow.getMinute());
		System.out.println(localDateTimeNow.getYear());
		
		/**
		 * Modify Date and time
		 */
		System.out.println(localDateTimeNow.plusDays(10));
		System.out.println(localDateTimeNow.plusHours(12));
		
		/**
		 * Additional Method
		 */
		System.out.println("isAfter :" + localDateTimeNow.isAfter(localDateTimeOf));
		System.out.println("isBefore : " + localDateTimeNow.isBefore(localDateTimeOf));
		System.out.println("isEqual :" + localDateTimeNow.isEqual(localDateTimeOf));
		System.out.println("isSupported : " + localDateTimeNow.isSupported(ChronoField.DAY_OF_WEEK));

	}

}
