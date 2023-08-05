package com.manikarthi25.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenateTwoStreams {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("Java", "8");
		List<String> list2 = Arrays.asList("explained", "through", "programs");

		Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());

		// Concatenated the list1 and list2 by converting them into Stream

		concatStream.forEach(s -> System.out.print(s + " "));

		// Printed the Concatenated Stream
	}

}

//Java 8 explained through programs 