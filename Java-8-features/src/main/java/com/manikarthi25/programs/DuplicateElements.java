package com.manikarthi25.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 4, 3, 1);
		Set<Integer> distinctValue = new HashSet<>();
		Set<Integer> duplicateValue = new HashSet<>();

		// display distinct value
		System.out.println("Distinct Value from List:");
		list.stream().filter(s -> distinctValue.add(s)).forEach(System.out::println);

		// display duplicate value
		System.out.println("Duplicate Value from List:");
		list.stream().filter(s -> !duplicateValue.add(s)).forEach(System.out::println);

	}

}

/*
Distinct Value from List:
1
2
3
4
5
6
7
8

Duplicate Value from List:
5
4
3
1
*/