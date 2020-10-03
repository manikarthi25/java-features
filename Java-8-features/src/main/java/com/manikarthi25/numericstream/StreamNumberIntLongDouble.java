package com.manikarthi25.numericstream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamNumberIntLongDouble {

	public static void main(String[] args) {
		System.out.println("Int Stream Count using range :" +IntStream.range(1, 50).count());
		IntStream.range(1, 50).forEach(value -> System.out.print(value + " "));
		
		System.out.println();
		System.out.println("Int Stream Count using range closed:" +IntStream.rangeClosed(1, 50).count());
		IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + " "));
		
		System.out.println();
		System.out.println("Long Stream Count using range :" +LongStream.range(1, 50).count());
		LongStream.range(1, 50).forEach(value -> System.out.print(value + " "));
		
		System.out.println();
		System.out.println("Long Stream Count using range closed :" +LongStream.rangeClosed(1, 50).count());
		LongStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + " "));
		
		System.out.println();
		System.out.println("Double Stream Count using range :" +LongStream.range(1, 50).asDoubleStream().count());
		LongStream.range(1, 50).asDoubleStream().forEach(value -> System.out.print(value + " "));
		
		System.out.println();
		System.out.println("Double Stream Count using range closed :" +LongStream.rangeClosed(1, 50).asDoubleStream().count());
		LongStream.rangeClosed(1, 50).asDoubleStream().forEach(value -> System.out.print(value + " "));
		
		
	}

}
