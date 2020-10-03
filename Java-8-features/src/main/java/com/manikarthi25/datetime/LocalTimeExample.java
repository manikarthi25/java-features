package com.manikarthi25.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample {

	public static void main(String[] args) {

		LocalTime localTimeNow = LocalTime.now();
		System.out.println("localTime using LocalTime.now : " + localTimeNow);
		
		LocalTime localTimeOf = LocalTime.of(12, 22);
		System.out.println("localTime using LocalTime.of : " + localTimeOf);
		
		/**
		 * Get Local time
		 */
		System.out.println("getHour : " + localTimeNow.getHour());
		System.out.println("getMinute : " + localTimeNow.getMinute());
		System.out.println("get(ChronoField.MINUTE_OF_DAY : " + localTimeNow.get(ChronoField.MINUTE_OF_DAY));
		
		/**
		 * Modify local time
		 */
		System.out.println("plusHours : " + localTimeNow.plusHours(12));
		System.out.println("minusMinutes : " + localTimeNow.minusMinutes(45));
		
		/**
		 * Additional Method
		 */
		System.out.println("localTimeNow :" + localTimeNow);
		System.out.println("localTimeOf :" + localTimeOf);
		System.out.println("isAfter : " + localTimeNow.isAfter(localTimeOf));
		System.out.println("isBefore : " + localTimeNow.isBefore(localTimeOf));
		System.out.println("isSupported : " + localTimeNow.isSupported(ChronoField.MINUTE_OF_DAY));
	}

}
