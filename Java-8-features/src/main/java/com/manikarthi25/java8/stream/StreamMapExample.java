package com.manikarthi25.java8.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class StreamMapExample {
	// Stream Map - Convert one type to another type
	// Stream Map is different from Map collection

	public static List<String> getStudentNameList() {

		List<String> nameList = StudentDataBase.getStudentDetails().stream() // Stream<Student>
				// Convert from Stream<Student> to Stream<String>
				.map(Student::getName) // Stream<String>
				.map(String::toUpperCase) // Perform Uppercase operation - Stream<String>
				.collect(Collectors.toList()); // List<String>

		return nameList;
	}

	public static Set<String> getStudentNameSet() {

		Set<String> nameList = StudentDataBase.getStudentDetails().stream() // Stream<Student>
				// Convert from Stream<Student> to Stream<String>
				.map(Student::getName) // Stream<String>
				.map(String::toUpperCase) // Perform Uppercase operation - Stream<String>
				.collect(Collectors.toSet()); // Set<String>

		return nameList;
	}

	public static void main(String a[]) {

		System.out.println("List of student names : " + getStudentNameList());

		System.out.println();
		System.out.println("Set of student names : " + getStudentNameSet());
	}

}

/*
 output
 ------
List of student names : [MANI, KARTHIKA, PRAISE, KARTHI, KANNAN, RAJI]

Set of student names : [KARTHIKA, KANNAN, RAJI, PRAISE, MANI, KARTHI]

*/