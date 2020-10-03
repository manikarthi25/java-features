package com.manikarthi25.methodreference;

import java.util.function.Function;

public class FunctionMethodReference {

	static Function<String, String> functionWithLambda = (name) -> name.toUpperCase();
	static Function<String, String> functionWithMethodReference = String::toUpperCase;

	public static void main(String[] args) {

		System.out.println(functionWithLambda.apply("java"));
		System.out.println(functionWithMethodReference.apply("java"));

	}

}
