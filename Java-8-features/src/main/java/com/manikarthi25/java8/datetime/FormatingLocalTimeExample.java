package com.manikarthi25.java8.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatingLocalTimeExample {
	
	public static void parseTime() {
		/**
		 * Convert Time from string to LocalTime
		 */
		String timeInString = "13:10";
		LocalTime localTimeFromStrig = LocalTime.parse(timeInString);
		System.out.println("Convert Time from String to LocalTime : " + localTimeFromStrig);
		
		LocalTime localTimeISO_LOCAL_DATE = LocalTime.parse(timeInString, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("Convert Time from String to LocalTime - ISO_LOCAL_TIME : " + localTimeISO_LOCAL_DATE);
		
		/**
		 * Customized Time format conversion
		 */
		String customizedTimeInString = "13|10";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH|mm");
		LocalTime localTimeCustomized = LocalTime.parse(customizedTimeInString, dateTimeFormatter);
		System.out.println("Convert Time from String to LocalTime - Customized : " + localTimeCustomized);
	}
	
	public static void formatTime() {
		/**
		 * Convert Time from LocalTime to String
		 */
		LocalTime localTime = LocalTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
		String timeInString = localTime.format(dateTimeFormatter);
		System.out.println("Convert Time from LocalTime to String : " + timeInString);
		
	};

	public static void main(String[] args) {
		parseTime();
		
		System.out.println();
		formatTime();

	}

}
/*
localDateTime with out zone  :2023-06-25T18:39:30.359144
localDateTime with zone      :2023-06-25T18:39:30.359144-05:00[America/Chicago]
Instant with zone            :2023-06-25T08:09:30.366736-05:00[America/Chicago]
Add offset with LocalDateTime :2023-06-25T18:39:30.366736-06:00
*/
