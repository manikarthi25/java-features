package com.manikarthi25.defaultmethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

	public static void main(String[] args) {

		/**
		 * Before java 1.8
		 */
		List<String> nameListBeforeJave8 = Arrays.asList("Mani", "Achuthan", "karthi", "praise");
		Collections.sort(nameListBeforeJave8);
		System.out.println("Sort name using Collection.sort() :" + nameListBeforeJave8);
		
		/**
		 * Jave 1.8
		 */
		List<String> nameListJave8 = Arrays.asList("Mani", "Achuthan", "karthi", "praise");
		nameListJave8.sort(Comparator.naturalOrder()); 
		System.out.println("Sort name using default List interface method - Ascending Order :" + nameListJave8);
		
		nameListJave8.sort(Comparator.reverseOrder()); 
		System.out.println("Sort name using default List interface method - reverse Order :" + nameListJave8);
		
		

	}

}
