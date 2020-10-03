package com.manikarthi25.stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SreamOfIterateGenerateExample {

	public static void main(String[] args) {
		
		// of - create stream with values
		Stream<String> stringStream = Stream.of("mani","karthi","kiruthi","praise");
		stringStream.forEach(System.out::println);
		
		System.out.println();
		// iterate - iterate the function based on limit or condition
		Stream.iterate(1, value -> value *2)
			.limit(5)
			.forEach(System.out::println);
		
		System.out.println();
		// generate - generate the value based on limit - input is supplier
		Supplier<Integer> integerSupplier = new Random()::nextInt;
		Stream.generate(integerSupplier)
			.limit(3)
			.forEach(System.out::println);
		
		

	}

}
