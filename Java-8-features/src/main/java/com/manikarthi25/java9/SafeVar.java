package com.manikarthi25.java9;

import java.util.ArrayList;
import java.util.List;

public class SafeVar {
	
	@SafeVarargs
	private void display(List<String>... products) {
		for (List<String> product : products) {
			System.out.println(product);
		}
	}

	public static void main(String[] args) {
		SafeVar v = new SafeVar();
		List<String> list = new ArrayList<String>();
		list.add("Laptop");
		list.add("Tablet");
		v.display(list);
	}
}


/*
It was included in Java7 and can only be applied on

Final methods
Static methods
Constructors

From Java 9, it can also be used with private instance methods.
Note: 
	The @SafeVarargs annotation can be applied only to methods that cannot be overridden. 
	Applying to the other methods will throw a compile time error.
*/

/*
output
-------
[Laptop, Tablet]
*/