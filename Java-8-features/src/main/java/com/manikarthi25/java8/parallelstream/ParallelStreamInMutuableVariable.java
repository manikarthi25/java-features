package com.manikarthi25.java8.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamInMutuableVariable {
	
	// don't use parallel stream in mutable variable - give wrong result
	public static void main(String[] args) {
		Sum sum = new  Sum();
		IntStream.rangeClosed(1, 1000).parallel().forEach(value -> sum.performSum(value)); 
		System.out.println(sum.getTotal());
	}

}
/*
Giving wrong result
First Time Run : 467565
Second Time Run : 447603
*/