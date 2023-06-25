package com.manikarthi25.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class StreamExample {

	public static void main(String a[]) {

		// without predicate
		Map<String, List<String>> studentMapWithoutPredicate = StudentDataBase.getStudentDetails().stream()
				.filter(student -> student.getGradeLevel() >= 3).filter(student -> student.getGpa() >= 6)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println("Without predicate : " + studentMapWithoutPredicate);

		// with predicate
		Predicate<Student> predicateGradeLevel = (student) -> student.getGradeLevel() >= 3;
		Predicate<Student> predicateGpa = (student) -> student.getGpa() >= 6;

		Map<String, List<String>> studentMapWithPredicate = StudentDataBase.getStudentDetails().stream()
				.filter(predicateGradeLevel)//Stream<Student>
				.filter(predicateGpa)//Stream<Student>
				.collect(Collectors.toMap(Student::getName, Student::getActivities));//Map - Without collect initialization, wont start any operation in filter  

		System.out.println("With Predicate : " + studentMapWithPredicate);

	}

}

/*
 Output
 ------
Without predicate : {karthi=[basket, gymnastics], praise=[volleyball, cricket]}
With Predicate : {karthi=[basket, gymnastics], praise=[volleyball, cricket]}
*/
