package com.manikarthi25.java8.numericstream;

import java.util.Optional;
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
		System.out.println("Max - LongStream : ");
		System.out.println(optionalLongMax.isPresent() ? optionalLongMax.getAsLong() : 0);

		System.out.println();
		OptionalLong optionalLongMin = LongStream.rangeClosed(1, 50).min();
		System.out.println("Min - LongStream : ");
		System.out.println(optionalLongMin.isPresent() ? optionalLongMin.getAsLong() : 0);
		
		System.out.println();
		OptionalDouble optionDoubleAverage = LongStream.rangeClosed(1,  50).asDoubleStream().average();
		System.out.println("Average - DoubleSTream");
		System.out.println(optionDoubleAverage.isPresent() ? optionDoubleAverage.getAsDouble() : 0);
	
	}

}
