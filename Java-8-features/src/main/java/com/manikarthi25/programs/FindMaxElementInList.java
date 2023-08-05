package com.manikarthi25.programs;

import java.util.Arrays;
import java.util.List;

public class FindMaxElementInList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 13, 4, 5, 6, 18);

		long max = list.stream().max(Integer::compare).get();

		System.out.println(max);

	}

}

//18
