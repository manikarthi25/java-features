package com.manikarthi25.java10;

import java.util.ArrayList;
import java.util.List;

public class CopyOf {
	
	public static void main(String a[]) {
		
		List<String> names = new ArrayList<>();
		names.add("Mani");
		names.add("Mohith");
		names.add("Mahith");
		changeList(names);
		System.out.println("After changeList Method call : " +names); //After changeList Method call : [Mani, Mohith, Mahith, raj]
		
		List<String> copyOfNames = List.copyOf(names);// return immutable list, can't add it
		canNotChangeList(copyOfNames);
		System.out.println("After canNotChangeList Method call : " +copyOfNames);// return java.lang.UnsupportedOperationException
	}

	private static void canNotChangeList(List<String> names) {
		names.add("kannan");
		
	}

	private static void changeList(List<String> copyOfNames) {
		copyOfNames.add("raj");
		
	}

}
