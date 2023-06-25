package com.manikarthi25.java8.functioninalterface;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p1 = (number) -> number % 2 == 0;
	static Predicate<Integer> p2 = (number) -> number % 5 == 0;

	public static void getPredicate() {
		System.out.println(p1.test(10));
	}

	public static void getPredicateAnd() {
		System.out.println(p1.and(p2).test(10));
		System.out.println(p1.and(p2).test(15));
	}

	public static void getPredicateOr() {
		System.out.println(p1.and(p2).test(10));
		System.out.println(p1.and(p2).test(15));
	}

	public static void getPredicateNegate() {
		System.out.println(p1.and(p2).negate().test(10));
		System.out.println(p1.and(p2).negate().test(15));
	}

	public static void main(String a[]) {

		getPredicate();
		System.out.println();

		getPredicateAnd();
		System.out.println();

		getPredicateAnd();
		System.out.println();

		getPredicateNegate();
		System.out.println();

	}

}

/*
true

true
false

true
false

false
true
*/
