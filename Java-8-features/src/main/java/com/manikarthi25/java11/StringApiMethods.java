package com.manikarthi25.java11;

import java.util.stream.Stream;

public class StringApiMethods {

	public static void main(String[] args) {

		System.out.println(" ".isBlank());// check String is empty
		System.out.println("".isBlank());// check String is empty

		System.out.println(" Mani ".strip()); // remove left and right space
		System.out.println(" Mani ".stripTrailing()); // remove right space
		System.out.println(" Mani ".stripLeading()); // remove left space

		Stream<String> names = "Mani\nMohith\nKannan\n".lines();// return stream
		names.forEach(n -> System.out.println(n));

	}

}


/*
 true
true
Mani
 Mani
Mani 
Mani
Mohith
Kannan
*/