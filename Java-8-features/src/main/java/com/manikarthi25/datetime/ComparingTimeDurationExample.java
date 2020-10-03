package com.manikarthi25.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimeDurationExample {

	public static void main(String[] args) {

		// Duration - Calculate difference between time through LocalTime and LocalDateTime , don't use Duration in LocalDate
		
		LocalTime localTime1 = LocalTime.of(01, 20);
		LocalTime localTime2 = LocalTime.of(12, 20);
		
		long differenceHours = localTime1.until(localTime2, ChronoUnit.HOURS);
		System.out.println("Difference between localTime2 and localTime1 in minutes: " + differenceHours);
		
		long differenceMinutes = localTime1.until(localTime2, ChronoUnit.MINUTES);
		System.out.println("Difference between localTime2 and localTime1 in minutes: " + differenceMinutes);
		
		Duration duration = Duration.between(localTime1, localTime2);
		System.out.println("Duration is :" + duration.toHours() + ":" + duration.toMinutes());
		
		Duration durationHours = Duration.ofHours(10);
		System.out.println("durationHours :" + durationHours.toHours());
		
		

	}

}
