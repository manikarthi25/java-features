package com.manikarthi25.parallelstream;import java.util.List;
import java.util.stream.Collectors;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class ParallelStreamExample {
	
	public static List<String> getStudentActivitiesUsingSequentialStream() {
		long startTime = System.currentTimeMillis();
		List<String> activities = StudentDataBase.getStudentDetails().stream() // Stream<Student>
		.map(Student::getActivities) // Stream<List<String>>
		.flatMap(List::stream) // Stream<String>
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Sequential stream : " + (endTime - startTime) + "ms");
		return activities;
	}
	
	public static List<String> getStudentActivitiesUsingParallelStream() {
		long startTime = System.currentTimeMillis();
		List<String> activities = StudentDataBase.getStudentDetails().stream() // Stream<Student>
		.parallel()
		.map(Student::getActivities) // Stream<List<String>>
		.flatMap(List::stream) // Stream<String>
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Parallel stream : " + (endTime - startTime) + "ms");
		return activities;
	}

	public static void main(String[] args) {
		
		System.out.println("Sequential Stream : Activites : " + getStudentActivitiesUsingSequentialStream());
		System.out.println("Parallel Stream : Activites : " + getStudentActivitiesUsingParallelStream());

	}

}
