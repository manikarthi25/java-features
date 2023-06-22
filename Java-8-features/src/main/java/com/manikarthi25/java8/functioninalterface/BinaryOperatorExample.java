package com.manikarthi25.java8.functioninalterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
	
	public static void main(String a[]) {
		
		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
		System.out.println("Result of maxBy is : " + maxBy.apply(5, 10));
		
		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println("Result of minBy is : " + minBy.apply(5, 10));
	}

}
