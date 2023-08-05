package com.manikarthi25.programs;

import java.util.Arrays;
import java.util.List;

public class FindMinElementInList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12, 13, 4, 5, 6, 18);

		long min = list.stream().min(Integer::compare).get();

		System.out.println(min);
	}

}

//4