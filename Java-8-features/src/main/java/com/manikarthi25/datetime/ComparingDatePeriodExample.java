package com.manikarthi25.datetime;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatePeriodExample {

	public static void main(String[] args) {

		// Period - Calculate difference between dates through LocalDate and LocalDateTime , don't use Period in LocalTime
		
		LocalDate localDate1 = LocalDate.of(2020, 01, 01);
		LocalDate localDate2 = LocalDate.of(2020, 12, 31);
		
		Period period = localDate1.until(localDate2);
		System.out.println("getYears : " + period.getYears()); // 2020 - 2020 -> 0
		System.out.println("getMonths : " + period.getMonths()); // 12 - 01 -> 11
		System.out.println("getDays : " + period.getDays()); // 31 - 01 = 30
		
		Period periodYear = Period.ofYears(10);
		System.out.println("ofYears - getYears : " + periodYear.getYears());
		
		Period periodDays = Period.ofDays(10);
		System.out.println("ofDays - ofDays : " + periodDays.getDays());
		
		Period periodBetween = Period.between(localDate1, localDate2);
		System.out.println("Period : " + periodBetween.getYears() + ":" + periodBetween.getMonths() + ":" + periodBetween.getDays());
	}

}
