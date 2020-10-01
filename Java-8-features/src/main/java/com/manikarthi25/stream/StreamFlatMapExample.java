package com.manikarthi25.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class StreamFlatMapExample {

	public static List<String> getStudentActivities() {
		List<String> studentActivities = StudentDataBase.getStudentDetails().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.collect(Collectors.toList());

		return studentActivities;
	}

	public static List<String> getStudentActivitiesDistinct() {
		List<String> studentActivities = StudentDataBase.getStudentDetails().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.distinct() // Stream<String> - with distinct
				.collect(Collectors.toList());

		return studentActivities;
	}
	
	public static List<String> getStudentActivitiesDistinctSort() {
		List<String> studentActivities = StudentDataBase.getStudentDetails().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.map(String::toUpperCase)
				.distinct() // Stream<String> - with distinct
				.sorted() // Stream<String> - sorted // based on ascii value it will be sorted
				.collect(Collectors.toList());

		return studentActivities;
	}

	public static long getStudentActivitiesCount() {
		long noOfStudentActivities = StudentDataBase.getStudentDetails().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.distinct() // Stream<String> - with distinct
				.count();

		return noOfStudentActivities;
	}

	public static void main(String[] args) {

		System.out.println("Without Distinct = " + getStudentActivities());
		System.out.println("With Distinct = " + getStudentActivitiesDistinct());
		System.out.println("With Distinct and Sorted = " + getStudentActivitiesDistinctSort());
		System.out.println("With Distinct and Count = " + getStudentActivitiesCount());
		
	}

}
