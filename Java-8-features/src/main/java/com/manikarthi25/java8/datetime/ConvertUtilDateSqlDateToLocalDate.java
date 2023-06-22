package com.manikarthi25.java8.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertUtilDateSqlDateToLocalDate {

	public static void main(String[] args) {

		/**
		 * Convert java.util.date to LocalDate and vice versa
		 */
		Date date = new Date();
		System.out.println("java.util.Date                      :"+date);
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("Convert from util.date to LocalDate :" + localDate);
		
		Date date1 = new Date().from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("Convert from LocalDate to util.date :" + date1);
		
		/**
		 * Convert java.sql.date to LocalDAte and vice versa
		 */
		java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
		System.out.println("Convert LocalDate to sql.date       :" + sqlDate);
		
		LocalDate localDate1 = sqlDate.toLocalDate();
		System.out.println("Convert sql.date to localdate       :" +localDate1);
		
	}

}
