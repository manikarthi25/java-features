package com.manikarthi25.java8.defaultmethod;

import java.util.List;

public class MultiplierImple implements Multiplier {

	@Override
	public int multiply(List<Integer> integerList) {
		return integerList.stream().reduce(1, (a, b) -> (a * b));
	}
	
	/*@Override
	public int size(List<Integer> integerList) { // can be override in implementation class - java 1.8 and above
		System.out.println("Inside implemention class");
		return integerList.size();
	}*/

}
