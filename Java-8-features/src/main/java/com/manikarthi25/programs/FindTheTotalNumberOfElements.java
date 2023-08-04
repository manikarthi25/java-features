package com.manikarthi25.programs;

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElements {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 13, 4, 5, 6, 18);

		long count = list.stream().count();
		
		System.out.println(count);

	}

}

//6
