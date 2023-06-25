package com.manikarthi25.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxValueExample {

	// Don't use init value when find Minimum and Maximum value, if we use return
	// default value 0
	public static Optional<Integer> findMaxValue(List<Integer> integerList) {
		return integerList.stream().reduce((a, b) -> a > b ? a : b);
	}

	public static Optional<Integer> findMinValue(List<Integer> integerList) {
		return integerList.stream().reduce((a, b) -> a < b ? a : b);
	}

	public static void main(String[] args) {

		// Not Empty List
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> integerOptional = findMaxValue(integerList);
		System.out.println("Optional Value is : " + integerOptional);
		if (integerOptional.isPresent()) {
			System.out.println("Max Value is : " + integerOptional.get());
		} else {
			System.out.println("List is Empty");
		}

		// Empty List
		List<Integer> integerList1 = new ArrayList<>();
		Optional<Integer> integerOptional1 = findMaxValue(integerList1);
		System.out.println("Optional Value is : " + integerOptional1);
		if (integerOptional1.isPresent()) {
			System.out.println("Max Value is : " + integerOptional.get());
		} else {
			System.out.println("List is Empty");
		}

		// Not Empty List
		List<Integer> integerList2 = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> integerOptional2 = findMinValue(integerList2);
		System.out.println("Optional Value is : " + integerOptional2);
		if (integerOptional2.isPresent()) {
			System.out.println("Min Value is : " + integerOptional2.get());
		} else {
			System.out.println("List is Empty");
		}

	}

}

/*
Optional Value is : Optional[5]
Max Value is : 5
Optional Value is : Optional.empty
List is Empty
Optional Value is : Optional[1]
Min Value is : 1
*/
