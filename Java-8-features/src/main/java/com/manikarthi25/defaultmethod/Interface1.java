package com.manikarthi25.defaultmethod;

public interface Interface1 {
	
	default void displayA() {
		System.out.println("Interface1 :" + Interface1.class);
	}

}
