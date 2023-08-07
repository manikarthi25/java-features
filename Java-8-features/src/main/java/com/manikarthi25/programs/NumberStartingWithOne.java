package com.manikarthi25.programs;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
	
	public static void main(String a[]) {
		
		List<Integer> list = Arrays.asList(12,13,4,5,6,18);
		
		list.stream().map(s -> s +"").filter(l -> l.startsWith("1")).forEach(System.out::println);

		}
}

/*
12
13
18
*/