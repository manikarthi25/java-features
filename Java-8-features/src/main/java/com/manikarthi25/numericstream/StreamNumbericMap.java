package com.manikarthi25.numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamNumbericMap {

	public static List<Integer> mapToObject() {
		return IntStream.rangeClosed(1, 50)
				.mapToObj((i) -> {
					return new Integer(i); // instead of Integer , we can convert any object
				})
				.collect(Collectors.toList());
	}
	
	public static long mapToLong() {
		return IntStream.rangeClosed(1, 50) //intStream
				.mapToLong((i) -> i) //convert intStream to longStream
				.sum(); // long
	}
	
	public static double mapToDouble() {
		return IntStream.rangeClosed(1, 50) //intStream
				.mapToDouble((i) -> i) //convert intStream to doubleStream
				.sum(); // long
	}
	
	public static void main(String[] args) {
		System.out.println("mapToObj :" + mapToObject());
		System.out.println("mapToLong :" + mapToLong());
		System.out.println("mapToDouble :" + mapToDouble());
	}

}
