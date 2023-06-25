package com.manikarthi25.java8.learn;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeProgrammingSummation {

	public static void main(String a[]) {
		/**
		 * Imperative - How style of programming How to perform operation
		 */

		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Imperative : " + sum);

		/**
		 * Declarative - What style of programming How to get the result, focus on
		 * result, not an operation
		 */

		int sum1 = IntStream.rangeClosed(0, 100).parallel().sum();
		System.out.println("Declarative : " + sum1);
	}
}

/*
Imperative : 5050
Declarative : 5050
*/