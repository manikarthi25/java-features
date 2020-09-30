package com.manikarthi25.functioninalterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class BiPredicateExample {

	Predicate<Student> p1 = (student) -> student.getGpa() >= 6.2;
	Predicate<Student> p2 = (student) -> student.getGradeLevel() <= 3;

	BiPredicate<Integer, Double> studentBiPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa <= 6.2;

	BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out
			.println(name + " : " + activities);

	Consumer<Student> studentConsumer = (student) -> {
		if (studentBiPredicate.test(student.getGradeLevel(), student.getGpa())) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	};

	public void filterStudentsByGpaAndGradeLevel(List<Student> studentList) {
		studentList.forEach(studentConsumer);
	}

	public static void main(String a[]) {

		List<Student> studentList = StudentDataBase.getStudentDetails();
		new PredicateAndConsumerExample().filterStudentsByGpaAndGradeLevel(studentList);

	}

}
