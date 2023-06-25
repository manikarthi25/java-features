package com.manikarthi25.java8.functioninalterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class BiFunctionPredicate {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentBiFunction = (students,
			studentPredicate) -> {
		Map<String, Double> studentMap = new HashMap<>();
		students.forEach(student -> {
			if (studentPredicate.test(student)) {
				studentMap.put(student.getName(), student.getGpa());
			}
		});
		return studentMap;
	};

	public static void main(String a[]) {
		System.out.println(studentBiFunction.apply(StudentDataBase.getStudentDetails(), PredicateStudentExample.p2));
	}

}


//{karthika=9.4, karthi=6.2, mani=9.9, praise=6.9}
