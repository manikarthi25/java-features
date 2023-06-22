package com.manikarthi25.java8.numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamNumbericExample {
	
	public static int sumOfNNumbers(List<Integer> integerList) {
		return integerList.stream().reduce(0, (x, y) -> (x + y)); // unboxing - convert Integer to int
	}
	
	public static int sumOfNNumberUsingIntStream() {
		return IntStream.rangeClosed(1,5).sum();
	}
 
	public static void main(String[] args) {
		
		List<Integer> integerList = Arrays.asList(1,2,3,4,5);
		System.out.println("Sum of N numbers :" + sumOfNNumbers(integerList));
		
		System.out.println();
		System.out.println("sum Of N Number Using IntStream : " + sumOfNNumberUsingIntStream());
		
	}

}
