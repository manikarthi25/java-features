package com.manikarthi25.java8.consumer;

import java.util.function.BiConsumer;

/* In Java 8, BiConsumer is a functional interface; it takes two arguments and returns nothing. */

public class BiConsumerEx {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
		addTwo.accept(1, 2); // 3

	}

}

// output - 3