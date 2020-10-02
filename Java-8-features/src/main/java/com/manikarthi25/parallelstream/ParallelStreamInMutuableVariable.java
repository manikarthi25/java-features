package com.manikarthi25.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamInMutuableVariable {
	
	public static void main(String[] args) {
		Sum sum = new  Sum();
		IntStream.rangeClosed(1, 10005).parallel().forEach(value -> sum.performSum(value)); // don't use parallel stream in mutable variable - give wrong result
		System.out.println(sum.getTotal());
	}

}
