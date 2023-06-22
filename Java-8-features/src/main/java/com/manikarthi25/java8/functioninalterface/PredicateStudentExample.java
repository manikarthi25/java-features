package com.manikarthi25.java8.functioninalterface;

import java.util.List;
import java.util.function.Predicate;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (student) -> student.getGpa() >= 6;
	static Predicate<Student> p2 = (student) -> student.getGradeLevel() <= 3;

	public static void filterStudentsByGpa() {
		System.out.println("filterStudentsByGpa");
		List<Student> studenList = StudentDataBase.getStudentDetails();
		studenList.forEach(student -> {
			if (p1.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsByGradeLevel() {
		System.out.println("filterStudentsByGradeLevel");
		List<Student> studenList = StudentDataBase.getStudentDetails();
		studenList.forEach(student -> {
			if (p2.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsAnd() {
		System.out.println("filterStudentsAnd");
		List<Student> studenList = StudentDataBase.getStudentDetails();
		studenList.forEach(student -> {
			if (p1.and(p2).test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsOr() {
		System.out.println("filterStudentsOr");
		List<Student> studenList = StudentDataBase.getStudentDetails();
		studenList.forEach(student -> {
			if (p1.or(p2).test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsNegate() {
		System.out.println("filterStudentsNegate");
		List<Student> studenList = StudentDataBase.getStudentDetails();
		studenList.forEach(student -> {
			if (p1.or(p2).negate().test(student)) {
				System.out.println(student);
			} else {
				System.out.println(student);
			}
		});
	}

	public static void main(String a[]) {

		filterStudentsByGpa();
		System.out.println();

		filterStudentsByGradeLevel();
		System.out.println();

		filterStudentsAnd();
		System.out.println();

		filterStudentsOr();
		System.out.println();

		filterStudentsNegate();
		System.out.println();
	}

}
