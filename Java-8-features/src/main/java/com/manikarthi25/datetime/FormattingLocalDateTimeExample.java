package com.manikarthi25.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {
	
	public static void parseLocalDateTime() {
		
		/**
		 * Convert DateAndTime from string to LocalDateTime
		 */
		String dateAndTimeInString = "2020-10-03T12:23:50";
		LocalDateTime localDateTime = LocalDateTime.parse(dateAndTimeInString);
		System.out.println("Convert LocalDateTime from String                     :" + localDateTime);
		
		LocalDateTime localDateTime1 = LocalDateTime.parse(dateAndTimeInString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("Convert LocalDateTime from String - ISO_LOCAL_DATE_TIME :" + localDateTime1);
		
		// Customized Format
		String dateAndTimeInString1 = "2020|10|03T12:23:50";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd'T'HH:mm:ss");
		LocalDateTime localDateTime2 = LocalDateTime.parse(dateAndTimeInString1, dateTimeFormatter);
		System.out.println("Convert LocalDateTime from String - Customized :" + localDateTime2);
		
		
	}
	
	public static void formatLocaDateTime() {
		
		/**
		 * Convert LocalDateTime to String
		 */
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd'T'HH:mm:ss");
		String dateTimeInString = localDateTime.format(dateTimeFormatter);
		System.out.println("Convert String from LocalDateTime                  :" + dateTimeInString);
		
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy|MM|dd'abc'HH:mm:ss");
		String dateTimeInString1 = localDateTime.format(dateTimeFormatter1);
		System.out.println("Convert String from LocalDateTime                  :" + dateTimeInString1);
		
	}

	public static void main(String[] args) {
		parseLocalDateTime();
		
		System.out.println();
		formatLocaDateTime();
		
	}

}
