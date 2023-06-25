package com.manikarthi25.java8.numericstream;

import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamMinMaxSumAverage {

	public static void main(String[] args) {
		
		int sum = IntStream.rangeClosed(1,50).sum();
		System.out.println("Sum - IntStream : " + sum);
		System.out.println("Count - IntStream :" + IntStream.rangeClosed(1,50).count());
		
		System.out.println();
		OptionalLong optionalLongMax = LongStream.rangeClosed(1, 50).max();
		System.out.print("Max - LongStream : ");
		System.out.print(optionalLongMax.isPresent() ? optionalLongMax.getAsLong() : 0);

		System.out.println();
		OptionalLong optionalLongMin = LongStream.rangeClosed(1, 50).min();
		System.out.print("Min - LongStream : ");
		System.out.print(optionalLongMin.isPresent() ? optionalLongMin.getAsLong() : 0);
		
		System.out.println();
		OptionalDouble optionDoubleAverage = LongStream.rangeClosed(1,  50).asDoubleStream().average();
		System.out.print("Average - DoubleSTream : ");
		System.out.print(optionDoubleAverage.isPresent() ? optionDoubleAverage.getAsDouble() : 0);
	
	}

}

/*
Sum - IntStream : 1275
Count - IntStream :50

Max - LongStream : 50
Min - LongStream : 1
Average - DoubleSTream : 25.5
*/