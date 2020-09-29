package com.manikarthi25.learn.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeProgrammingRemoveDuplicateValues {

	public static void main(String a[]) {

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 5, 2, 9);

		/**
		 * Imperative
		 */

		List<Integer> uniqueList1 = new ArrayList<>();
		for (Integer integer : integerList) {
			if (!uniqueList1.contains(integer)) {
				uniqueList1.add(integer);
			}
		}
		System.out.println("Imperative - Unique List : " + uniqueList1);

		/**
		 * Declarative
		 */
		List<Integer> uniqueList2 = integerList.stream().distinct().collect(Collectors.toList());
		System.out.println("Imperative - Unique List : " + uniqueList2);

	}

}
