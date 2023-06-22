package com.manikarthi25.java8.defaultmethod;

import java.util.List;

public interface Multiplier {
	
	int multiply(List<Integer> integerList);
	
	default int size(List<Integer> integerList) { // can be override in implementation class - java 1.8 and above
		System.out.println("Inside interface");
		return integerList.size();
	}
	
	static boolean isEmpty(List<Integer> integerList) { //Can't be override in implementation class - java 1.8 and above
		return integerList != null && integerList.size() >0;
	}

}
