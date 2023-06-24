package com.manikarthi25.java9.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhile {

	public static void main(String[] args) {
		List<Integer> list = Stream.of(2, 4, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> (i % 2 == 0))
				.collect(Collectors.toList());
		System.out.println(list);
	}

}


/*
output
-------
[2, 4]
*/

/*
 Stream takeWhile method takes each element that matches its predicate. 
 It stops when it get unmatched element. 
 It returns a subset of elements that contains all matched elements, other part of stream is discarded.
*/

