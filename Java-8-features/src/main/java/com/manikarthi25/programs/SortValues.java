package com.manikarthi25.programs;

import java.util.Arrays;
import java.util.List;

public class SortValues {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.stream()
              .sorted()
              .forEach(System.out::println);
	}

}


/*
8
10
15
15
25
32
49
98
98
*/