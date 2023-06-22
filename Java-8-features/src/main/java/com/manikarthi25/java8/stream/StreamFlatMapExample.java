package com.manikarthi25.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

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
		
		List<Integer> listOfIntegers = Stream.of("1", "2", "3", "4")
	               .map(Integer::valueOf)
	               .collect(Collectors.toList());
		System.out.println("map : " +listOfIntegers);
		
		//The Stream.map() function performs map functional operation i.e. it takes a Stream and transforms it to another Stream.


		List<Integer> evens = Arrays.asList(2, 4, 6);
		List<Integer> odds = Arrays.asList(3, 5, 7); 
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11); 
		
		List<Integer> numbers = Stream.of(evens, odds, primes) 
				.flatMap(list -> list.stream()) 
				.collect(Collectors.toList()); 
		System.out.println("flattend list: " + numbers);
		
		//The Stream.flatMap() function, as the name suggests, is the combination of a map and a flat operation. This means you first apply the map function and then flattens the result.
		
/*
		Stream.map() vs Stream.flatMap() in Java 8
		
		1. The function you pass to the map() operation returns a single value.
		2. The function you pass to flatMap() operation returns a Stream of value.
		3. flatMap() is a combination of map and flat operation. 
		4. map() is used for transformation only, but flatMap() is used for both transformation and flattening. 

*/
	}

}
