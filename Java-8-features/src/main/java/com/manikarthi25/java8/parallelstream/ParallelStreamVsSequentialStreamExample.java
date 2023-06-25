package com.manikarthi25.java8.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamVsSequentialStreamExample {
	
	public static long comparePerformace(Supplier<Integer> supplier, int noOfTimesCall) {
		long startTime = System.currentTimeMillis();
		for(int i = 0; i <= noOfTimesCall; i++) {
			supplier.get();
			//System.out.println("supplier.get() : "+supplier.get());
		}
		long endTime = System.currentTimeMillis(); 
		return endTime - startTime;
	}
	
	public static int sumSequentialStream() {
		long startTime = System.currentTimeMillis();
		int sumSequentialStream = IntStream.rangeClosed(1, 1000000).sum();	
		long endTime = System.currentTimeMillis(); 
		System.out.println("sumSequentialStream Time:" +(endTime - startTime)) ;
		System.out.println("sumSequentialStream :" +sumSequentialStream) ;
		return sumSequentialStream;
	}
	
	public static int sumParallelStream() {
		long startTime = System.currentTimeMillis();
		int sumParallelStream = IntStream.rangeClosed(1, 1000000).parallel().sum();	
		long endTime = System.currentTimeMillis(); 
		System.out.println("sumParallelStream Time:" +(endTime - startTime)) ;
		System.out.println("sumParallelStream :" +sumParallelStream) ;
		return sumParallelStream;
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("Available Processor in this system : " + Runtime.getRuntime().availableProcessors());
		System.out.println("Sequential : " + comparePerformace(ParallelStreamVsSequentialStreamExample::sumSequentialStream, 20) + "ms");
		System.out.println("Parallel : " + comparePerformace(ParallelStreamVsSequentialStreamExample::sumParallelStream, 20) + "ms");

	}

}

/*
Available Processor in this system : 8
sumSequentialStream Time:10
sumSequentialStream :1784293664
sumSequentialStream Time:4
sumSequentialStream :1784293664
sumSequentialStream Time:1
sumSequentialStream :1784293664
sumSequentialStream Time:0
sumSequentialStream :1784293664
sumSequentialStream Time:0
sumSequentialStream :1784293664
sumSequentialStream Time:1
sumSequentialStream :1784293664
sumSequentialStream Time:0
sumSequentialStream :1784293664
sumSequentialStream Time:1
sumSequentialStream :1784293664
sumSequentialStream Time:0
sumSequentialStream :1784293664
sumSequentialStream Time:1
sumSequentialStream :1784293664
sumSequentialStream Time:0
sumSequentialStream :1784293664
sumSequentialStream Time:0
sumSequentialStream :1784293664
sumSequentialStream Time:1
sumSequentialStream :1784293664
sumSequentialStream Time:0
sumSequentialStream :1784293664
sumSequentialStream Time:0
sumSequentialStream :1784293664
sumSequentialStream Time:0
sumSequentialStream :1784293664
sumSequentialStream Time:0
sumSequentialStream :1784293664
sumSequentialStream Time:0
sumSequentialStream :1784293664
sumSequentialStream Time:1
sumSequentialStream :1784293664
sumSequentialStream Time:0
sumSequentialStream :1784293664
sumSequentialStream Time:1
sumSequentialStream :1784293664
Sequential : 22ms
sumParallelStream Time:4
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:1
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:1
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:1
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:1
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
sumParallelStream Time:1
sumParallelStream :1784293664
sumParallelStream Time:0
sumParallelStream :1784293664
Parallel : 9ms
*/
