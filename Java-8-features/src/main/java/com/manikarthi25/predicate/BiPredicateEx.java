package com.manikarthi25.predicate;

import java.util.function.BiPredicate;

public class BiPredicateEx {

	public static void main(String[] args) {

		BiPredicate<String, Integer> filter = (x, y) -> {
			return x.length() == y;
		};

		boolean result = filter.test("mkyong", 6);
		System.out.println(result); // true

		boolean result2 = filter.test("java", 10);
		System.out.println(result2); // false
	}

}

/* output
true
false
*/
