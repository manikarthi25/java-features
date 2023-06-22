package com.manikarthi25.java8.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamNotUseBoxing {
	
	public static int sumSequental(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();
		int sum = integerList.stream().reduce(0, (a ,b) -> (a + b));
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("Sequential - Sum Duration : " + duration + "ms");
		return sum;
	}
	
	public static int sumParallel(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();
		int sum = integerList.stream().parallel().reduce(0, (a ,b) -> (a + b)); // perform unboxing - Integer to int
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("parallel - Sum Duration : " + duration + "ms");
		return sum;
	}

	public static void main(String[] args) {

		List<Integer> integerList = IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList());
		System.out.println("Sequential - Sum : " + sumSequental(integerList));
		System.out.println("Parallel - Sum : " + sumParallel(integerList));
		
	}

}
