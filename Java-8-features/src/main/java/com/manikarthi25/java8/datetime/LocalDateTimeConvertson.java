package com.manikarthi25.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeConvertson {

	public static void main(String[] args) {
		
		/**
		 * Combine LocalDate + LocalTime -> LocalDateTime
		 */
		LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Combine LocalDate + LocalTime -> LocalDateTime : " + localDateTime);
		
		/**
		 * Convert from LocalDate to LocalDateTime
		 */
		LocalDate localDate = LocalDate.now();
		LocalDateTime convertFromLocalDate = localDate.atTime(12,35);
		System.out.println("convert From LocalDate : " + convertFromLocalDate);
		
		/**
		 * Convert from LocalTime to LocalDateTime
		 */
		LocalTime localTime = LocalTime.now();
		LocalDateTime convertFromLocalTime = localTime.atDate(localDate);
		System.out.println("convert From LocalTime : " + convertFromLocalTime);
		
		/**
		 * Get LocalDate and LocalTime from LocalDateTime
		 */
		System.out.println("Get LocalDate from LocalDateTime : " + convertFromLocalTime.toLocalDate());
		System.out.println("Get LocalTime from LocalDateTime : " + convertFromLocalTime.toLocalTime());

	}

}

/*
Combine LocalDate + LocalTime -> LocalDateTime : 2023-06-25T18:51:50.194321100
convert From LocalDate : 2023-06-25T12:35
convert From LocalTime : 2023-06-25T18:51:50.194321100
Get LocalDate from LocalDateTime : 2023-06-25
Get LocalTime from LocalDateTime : 18:51:50.194321100
*/
