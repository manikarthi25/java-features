package com.manikarthi25.java11;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNot {

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] isEven) {

		Predicate<Integer> evenNumber = n -> n % 2 == 0;
		List<Integer> numberList = List.of(1, 3, 6, 8, 9);
		numberList.stream().filter(evenNumber).forEach(n -> System.out.println(n)); // print even numbers 6, 8
		numberList.stream().filter(evenNumber.negate()).forEach(n -> System.out.println(n)); // print odd numbers 1, 3,
																								// 9

		// Java 11 - introduce not method used in method reference
		numberList.stream().filter(PredicateNot::isEven).forEach(n -> System.out.println(n));// print even numbers 6, 8
		numberList.stream().filter(Predicate.not(PredicateNot::isEven)).forEach(n -> System.out.println(n));// print odd
																											// numbers
	}

}
