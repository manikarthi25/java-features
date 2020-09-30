package com.manikarthi25.functioninalterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	// input and output both data type is string
	static UnaryOperator<String> unaryOperator = (name) -> name.concat("default");

	public static void main(String[] args) {

		System.out.println(unaryOperator.apply("Java"));

	}

}
