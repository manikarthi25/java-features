package com.manikarthi25.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> integerList) {
		return integerList.stream()
				// 1
				// 2
				// 3
				// 4
				// 5
				.limit(3) // Only process 1, 2, 3 - First three element
				.reduce((a, b) -> (a + b));
	}
	
	public static Optional<Integer> skip(List<Integer> integerList) {
		return integerList.stream()
				// 1
				// 2
				// 3
				// 4
				// 5
				.skip(3) // Only process 4 and 5, skip first three element
				.reduce((a, b) -> (a + b));
	}
	public static void main(String[] args) {
		System.out.println("Limit Operation");
		List<Integer> integerList = Arrays.asList(1,2,3,4,5);
		Optional<Integer> limitResult = limit(integerList);
		if (limitResult.isPresent()) {
			System.out.println("Limit - Result is : " + limitResult.get());
		} else {
			System.out.println("Limit - List is empty");
		}
		
		System.out.println();
		System.out.println("Skip Operation");
		Optional<Integer> skipResult = skip(integerList);
		if (skipResult.isPresent()) {
			System.out.println("Skip - Result is :" + skipResult.get());
		} else {
			System.out.println("Skip - List is empty");
		}

	}

}

/*
 Output
 ------
Limit Operation
Limit - Result is : 6

Skip Operation
Skip - Result is :9
 */
