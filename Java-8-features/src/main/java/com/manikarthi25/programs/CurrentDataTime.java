package com.manikarthi25.programs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDataTime {

	public static void main(String[] args) {

		System.out.println("Current Date : " +LocalDate.now());
		
		System.out.println("Current Time : " +LocalTime.now());
		
		System.out.println("Current Date and Time : " +LocalDateTime.now());
	}

}

/*
Current Date : 2023-08-04
Current Time : 22:46:44.251037800
Current Date and Time : 2023-08-04T22:46:44.251037800
*/