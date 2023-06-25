package com.manikarthi25.java8.datetime;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

	public static void main(String[] args) {
		
		// Instant - giving time as machine readable format
		
		Instant instant1 = Instant.now(); 
		System.out.println("instant1 : " + instant1);// display date time 
		
		// 1970-01-01 is start of Epoach, One day second is 86400
		System.out.println("getEpochSecond :" + instant1.getEpochSecond()); // from 1970 - display value as machine readable format
		System.out.println("ofEpochSecond : " + instant1.ofEpochSecond(0)); // 1970-01-01T00:00:00Z
		
		Instant instant2 = Instant.now();

		Duration duration = Duration.between(instant1, instant2);
		System.out.println("Difference between Instant1 and Instant2 in  nanoSeconds :" + duration.getNano());
		
	}

}

/*
instant1 : 2023-06-25T13:16:36.588804200Z
getEpochSecond :1687698996
ofEpochSecond : 1970-01-01T00:00:00Z
Difference between Instant1 and Instant2 in  nanoSeconds :9998900
*/