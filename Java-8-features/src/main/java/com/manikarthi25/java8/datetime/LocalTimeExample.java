package com.manikarthi25.java8.datetime;

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

/*
localTime using LocalTime.now : 18:55:12.635304600
localTime using LocalTime.of : 12:22
getHour : 18
getMinute : 55
get(ChronoField.MINUTE_OF_DAY : 1135
plusHours : 06:55:12.635304600
minusMinutes : 18:10:12.635304600
localTimeNow :18:55:12.635304600
localTimeOf :12:22
isAfter : true
isBefore : false
isSupported : true
*/