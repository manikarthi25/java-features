package com.manikarthi25.java9;

import java.util.List;

public class ListOf {
	
	public static void main(String a[]) {
		
		List<String> names = List.of("Mani", "Mohith", "Mahith");//create immutable list
		System.out.print(names); // print list [Mani, Mohith, Mahith]
		
		//names.add("kannan"); // return exception java.lang.UnsupportedOperationException
		//System.out.print(names);
		
	}

}
