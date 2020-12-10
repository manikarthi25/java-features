package com.manikarthi25.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

/*
 In Java 8, Supplier is a functional interface; it takes no arguments and returns a result.
 */

public class SupplierDate {
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {

		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		LocalDateTime time = s.get();

		System.out.println(time);

		Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
		String time2 = s1.get();

		System.out.println(time2);

	}

}

/* output 
2020-03-02T16:10:49.281223
2020-03-02 16:10:49
*/