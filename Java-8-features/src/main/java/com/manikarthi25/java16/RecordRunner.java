package com.manikarthi25.java16;

public class RecordRunner {

	// Java 16
	record Employee(String firstName, String lastName) {
		
		// int age = 20; //not allowed instance variable
		static int age = 20; // allowed static variable
		
		// compact constructors
		Employee {
			if (firstName == null) {
				throw new IllegalArgumentException("first name is null");
			}
		}

	}

	public static void main(String[] args) {

		Employee emp = new Employee("Mani", "Karthi");
		Employee emp1 = new Employee("Mohith", "Mahith");
		Employee emp2 = new Employee("Mohith", "Mahith");
		Employee emp3 = new Employee("Mohith1", "Mahith1");
		System.out.println(emp); // Employee[firstName=Mani, lastName=Karthi]
		System.out.println(emp1.equals(emp2)); // true
		System.out.println(emp2.equals(emp3)); // false

	}

}

/*
 * can not use instance variable and instance initializers can use static
 * variable, static method and static initializers compact constructors only
 * allowed in record public accessor method, constructor, equals method,
 * hashcode and toString method automatically create
 */
