package com.manikarthi25.java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		LocalDate localDate1 =LocalDate.of(2020, 10,  04);

		/**
		 * Get local Date
		 */
		System.out.println("System Current Date : " + localDate); // YYYY-mm-DD
		System.out.println("localDate.of : " + localDate1); // Give year, month and date
		System.out.println("getMonth : " + localDate.getMonth()); // October
		System.out.println("getMonthValue : " + localDate.getMonthValue()); // 10
		System.out.println("getDayOfYear : " + localDate.getDayOfYear()); // 277
		System.out.println("getDayOfMonth : " + localDate.getDayOfMonth()); // 3
		System.out.println("getDayOfWeek : " + localDate.getDayOfWeek()); // Saturday
		System.out.println("getYear : " + localDate.getYear()); // 2020
		System.out.println("get(ChronoField.DAY_OfyF_WEEK) : " + localDate.get(ChronoField.DAY_OF_WEEK)); // 6
		
		/**
		 * Modify Local Date
		 */
		System.out.println("plusDays :" + localDate.plusDays(5)); // add no days 
		System.out.println("plusDays :" + localDate.plusMonths(5)); // add no months
		System.out.println("minusDays :" + localDate.minusDays(3)); // minus days
		System.out.println("localDate.with(ChronoField.DAY_OF_WEEK : " + localDate.with(ChronoField.DAY_OF_WEEK, 6));
		System.out.println("localDate.with(ChronoField.YEAR :" + localDate.with(ChronoField.YEAR, 2020));
		System.out.println("localDate.with(TemporalAdjusters.firstDayOfNextMonth() : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		
		/**
		 * Additional Methods
		 */
		
		// localDate : 2020-10-03
		// localDate : 2020-10-04
		System.out.println("localDate :" + localDate + "\nlocalDate1 :" + localDate1 + " \nisEqual : "+ localDate.isEqual(localDate1));
		System.out.println("isBefore : "+ localDate.isBefore(localDate1));
		System.out.println("isAfter : "+ localDate.isAfter(localDate1));
		System.out.println("isLeapYear : "+ localDate.isLeapYear());
		
		/**
		 * Check method is support or not
		 */
		LocalTime localTime = LocalTime.now();
		System.out.println("Is support ChronoUnit.MINUTES method :" + localDate.isSupported(ChronoUnit.MINUTES)); // false - Minus - not support in Local Date, iyts support LocalTime
		System.out.println("Is support ChronoUnit.MINUTES method :" + localTime.isSupported(ChronoUnit.MINUTES)); // True
		
	}

}

/*
System Current Date : 2023-06-25
localDate.of : 2020-10-04
getMonth : JUNE
getMonthValue : 6
getDayOfYear : 176
getDayOfMonth : 25
getDayOfWeek : SUNDAY
getYear : 2023
get(ChronoField.DAY_OfyF_WEEK) : 7
plusDays :2023-06-30
plusDays :2023-11-25
minusDays :2023-06-22
localDate.with(ChronoField.DAY_OF_WEEK : 2023-06-24
localDate.with(ChronoField.YEAR :2020-06-25
localDate.with(TemporalAdjusters.firstDayOfNextMonth() : 2023-07-01
localDate :2023-06-25
localDate1 :2020-10-04 
isEqual : false
isBefore : false
isAfter : true
isLeapYear : false
Is support ChronoUnit.MINUTES method :false
Is support ChronoUnit.MINUTES method :true
*/
