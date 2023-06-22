package com.manikarthi25.java8.functioninalterface;

import java.util.function.Function;

public class FuncationExample {

	static Function<String, String> f1 = (name) -> name.toUpperCase();

	static Function<String, String> f2 = (name) -> name.concat("default");

	public static void main(String a[]) {

		System.out.println(f1.apply("java8"));
		System.out.println(f1.andThen(f2).apply("java8")); // first f1 then f2
		System.out.println(f1.compose(f2).apply("java8")); // first f2 then f1

	}

}
