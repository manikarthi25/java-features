package com.manikarthi25.java8.defaultmethod;

public interface Interface2 extends Interface1 {
	
	default void displayB() {
		System.out.println("Interface2 : "+ Interface2.class);
	}
	
	default void displayA() {
		System.out.println("Interface1 :" + Interface2.class);
	}

}
