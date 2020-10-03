package com.manikarthi25.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();

		/**
		 * Get local Date
		 */
		System.out.println("System Current Date : " + localDate); // YYYY-mm-DD
		System.out.println("localDate.of : " + LocalDate.of(2018, 07, 25)); // Give year, month and date
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
		
	}

}
