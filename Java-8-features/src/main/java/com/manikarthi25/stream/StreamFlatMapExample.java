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

	public static void main(String[] args) {
		System.out.println(getStudentActivities());
	}

}
