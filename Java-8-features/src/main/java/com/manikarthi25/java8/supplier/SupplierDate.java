package com.manikarthi25.java8.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

/*
 In Java 8, Supplier is a functional interface; it takes no arguments and returns a result.
 */

public class SupplierDate {
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public static void main(String[] args) {

		//In Java, a supplier is a functional interface from the Java.util.function package 
		//that represents a supplier of results. It does not take any arguments and returns a value of the specified type. 
		//The functional interface defines a single abstract method called “get ()” that returns a result1
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