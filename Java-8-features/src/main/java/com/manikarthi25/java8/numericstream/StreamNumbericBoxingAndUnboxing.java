package com.manikarthi25.java8.numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamNumbericBoxingAndUnboxing {
	
	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10)
						// int value
						.boxed()
						// Integer Value
						.collect(Collectors.toList());
	}
	
	public static int unBoxing(List<Integer> integerList) {
		return integerList.stream() // Integer Value
					.mapToInt(Integer::intValue) // int value
					.sum();
	}

	public static void main(String[] args) {
		System.out.println("Boxing - Convert primitive type to wrapper type");
		System.out.println(boxing());
		
		System.out.println();
		System.out.println("UnBoxing - Convert Wrapper type to primitive type");
		List<Integer> integerList = boxing();
		System.out.println(unBoxing(integerList));
		
	}

}
