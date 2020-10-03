package com.manikarthi25.datetime;

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
		System.out.println("Convert Time from String to LocalTime - ISO_LOCAL_DATE : " + localTimeISO_LOCAL_DATE);
		
		/**
		 * Customized Time format conversion
		 */
		String customizedTimeInString = "13|10";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH|MM");
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
