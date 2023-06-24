package com.manikarthi25.java9.stream;

import java.util.stream.Stream;

public class OfNullable {

	public static void main(String[] args) {
		Stream<Integer> val = Stream.ofNullable(null);
		val.forEach(System.out::println);
	}

}

/*
output
-------
return empty
*/

/*
Stream ofNullable method returns a sequential stream that contains a single element, if non-null. 
Otherwise, it returns an empty stream.

It helps to handle null stream and NullPointerException.
*/
