package com.manikarthi25.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamVsSequentialStreamExample {
	
	public static long comparePerformace(Supplier<Integer> supplier, int noOfTimesCall) {
		long startTime = System.currentTimeMillis();
		for(int i = 0; i <= noOfTimesCall; i++) {
			supplier.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1, 1000000).sum();	
	}
	
	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 1000000).parallel().sum();	
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("Available Processor in this system : " + Runtime.getRuntime().availableProcessors());
		System.out.println("Sequential : " + comparePerformace(ParallelStreamVsSequentialStreamExample::sumSequentialStream, 20) + "ms");
		System.out.println("Parallel : " + comparePerformace(ParallelStreamVsSequentialStreamExample::sumParallelStream, 20) + "ms");

	}

}
