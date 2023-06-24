package com.manikarthi25.java9.factorymethods;

import java.util.List;

public class FactoryMethodInList {

	public static void main(String[] args) {
		List<String> list = List.of("Java", "JavaFX", "Spring", "Hibernate", "JSP");
		for (String l : list) {
			System.out.println(l);
		}
	}

}

/*
Java 9 Collection library includes static factory methods for List, Set and Map interface. 
These methods are useful to create small number of collection.
Factory methods are special type of static methods that are used to create unmodifiable instances of collections. 
It means we can use these methods to create list, set and map of small number of elements.

It is unmodifiable, so adding new element will throw java.lang.UnsupportedOperationException
*/

/*
output
-------
Java
JavaFX
Spring
Hibernate
JSP
*/