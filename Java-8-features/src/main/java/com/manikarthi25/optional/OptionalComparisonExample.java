package com.manikarthi25.optional;

import java.util.Optional;

import com.manikarthi25.data.StudentDataBase;

public class OptionalComparisonExample {

	public static String getStudentName() {
		String studentName = StudentDataBase.studentSupplier.get().getName();
		if (studentName != null) {
			return studentName;
		}
		return null; // return null values if name is not found
	}

	public static Optional<String> getStudentNameOptional() {
		Optional<String> studentNameOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get().getName());
		if (studentNameOptional.isPresent()) {
			return studentNameOptional;
		}
		return Optional.empty(); // won't send null values even name is not found
	}

	public static void main(String[] args) {

		System.out.println("Without optional");
		String studentName = getStudentName();
		if (studentName != null) {
			System.out.println("Length of the string :" + studentName.length());
		} else {
			System.out.println("Student is not found");
		}

		System.out.println("With optional");
		Optional<String> studentNameOptionalOptional = getStudentNameOptional();
		if (studentNameOptionalOptional.isPresent()) {
			System.out.println("Length of the string :" + studentNameOptionalOptional.get().length());
		} else {
			System.out.println("Student is not found");
		}

	}

}
