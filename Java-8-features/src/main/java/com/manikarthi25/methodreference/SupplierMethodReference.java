package com.manikarthi25.methodreference;

import java.util.function.Predicate;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class SupplierMethodReference {

	static Predicate<Student> studentPredicate = (student) -> student.getGradeLevel() >= 3;

	static Predicate<Student> studentPredicateMethodReference = SupplierMethodReference::filterStudentsByGradeLevel;

	public static boolean filterStudentsByGradeLevel(Student student) {
		return student.getGradeLevel() >= 3;
	}

	public static void main(String[] args) {

		System.out.println(studentPredicate.test(StudentDataBase.studentSupplier.get()));
		System.out.println(studentPredicateMethodReference.test(StudentDataBase.studentSupplier.get()));

	}

}
