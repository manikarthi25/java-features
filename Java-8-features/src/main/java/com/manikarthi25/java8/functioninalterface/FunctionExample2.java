package com.manikarthi25.java8.functioninalterface;

public class FunctionExample2 {

	static String concatString(String name) {
		return FuncationExample.f2.apply(name);
	}

	public static void main(String a[]) {
		
		String result = concatString("Hello");
		System.out.println(result);

	}

}


//Hellodefault
