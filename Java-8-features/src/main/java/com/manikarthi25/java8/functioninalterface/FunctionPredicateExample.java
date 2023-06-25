package com.manikarthi25.java8.functioninalterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class FunctionPredicateExample {

	static Function<List<Student>, Map<String, Double>> stduentsFunction = (students) -> {
		Map<String, Double> studentMap = new HashMap<>();
		students.forEach(student -> {
			if (PredicateStudentExample.p1.test(student)) {
				studentMap.put(student.getName(), student.getGpa());
			}
		});
		return studentMap;
	};

	static void printStudentNameAndGrade(List<Student> studentList) {
		System.out.println(stduentsFunction.apply(studentList));
	}

	public static void main(String a[]) {

		List<Student> studentList = StudentDataBase.getStudentDetails();
		printStudentNameAndGrade(studentList);

	}

}

//{karthika=9.4, karthi=6.2, mani=9.9, praise=6.9}
