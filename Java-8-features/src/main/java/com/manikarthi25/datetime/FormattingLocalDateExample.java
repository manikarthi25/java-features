package com.manikarthi25.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {
	
	public static void parseLocalDate() {
		
		/**
		 * Convert from String to LocalDate
		 */
		String dateInString = "2020-10-03"; // yyyy-MM-dd
		LocalDate localDateFromString = LocalDate.parse(dateInString);
		System.out.println("Convert Date from String to LocalDate                         :" + localDateFromString);
		
		LocalDate localDateFromStringUsingISO_LOCAL_DATE = LocalDate.parse(dateInString, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("Convert Date from String to LocalDate using ISO_LOCAL_DATE    :" + localDateFromStringUsingISO_LOCAL_DATE);
		
		String dateInStringWIthoutDelimiter = "20201003";
		LocalDate localDateFromStringBASIC_ISO_DATE = LocalDate.parse(dateInStringWIthoutDelimiter, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("Convert Date from String to LocalDate using BASIC_ISO_DATE    :" + localDateFromStringBASIC_ISO_DATE);
		
		//Customized date format
		String customizedDateInString = "2020|10|03";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDateConvertFromCustomiziedString = LocalDate.parse(customizedDateInString, dateTimeFormatter);
		System.out.println("Convert Date from String to LocalDate using Customized format  :" + localDateConvertFromCustomiziedString);
	}
	
	private static void formatLocalDate() {
		/**
		 * Convert date from LocalDate to String
		 */
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		String dateFromLocalDate = localDate.format(dateTimeFormatter);
		System.out.println("Convert date from LocalDate to String                        :"+dateFromLocalDate);
	}


	public static void main(String[] args) {
		parseLocalDate();
	
		System.out.println();
		formatLocalDate();
	}

}
