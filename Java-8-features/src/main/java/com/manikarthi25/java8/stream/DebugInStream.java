package com.manikarthi25.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class DebugInStream {

	public static void main(String[] args) {
		
		Predicate<Student> predicateGradeLevel = (student) -> student.getGradeLevel() >= 3;
		Predicate<Student> predicateGpa = (student) -> student.getGpa() >= 6;

		Map<String, List<String>> studentMapWithPredicate = StudentDataBase.getStudentDetails().stream()
				.peek(student -> { // peek methid used for debug in stream
					System.out.println();
					System.out.println(student);
				})
				.filter(predicateGradeLevel)
				.peek(student -> {
					System.out.println();
					System.out.println("First Filter output : " + student);
				})
				.filter(predicateGpa)
				.peek(student -> {
					System.out.println();
					System.out.println("Second Filter output : " + student);
				})
				.collect(Collectors.toMap(Student::getName, Student::getActivities));// Map - Without collect initialization, wont start any operation in filter

		System.out.println("With Predicate : " + studentMapWithPredicate);

	}

}
