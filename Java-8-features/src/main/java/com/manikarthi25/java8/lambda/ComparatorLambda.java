package com.manikarthi25.java8.lambda;

import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String a[]) {

		// Without lambda
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);// 0 => o1==o2, 1 => 01>02, -1 => o1<o2
			}
		};

		System.out.println("Without lambda : " + comparator.compare(9, 5));

		// With Lambda
		Comparator<Integer> comparator1 = (Integer o1, Integer o2) -> o1.compareTo(o2);
		System.out.println("With lambda : " + comparator1.compare(9, 5));
	}

}


//Without lambda : 1
//With lambda : 1
