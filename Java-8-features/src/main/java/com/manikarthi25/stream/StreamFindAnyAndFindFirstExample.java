package com.manikarthi25.stream;

import java.util.Optional;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class StreamFindAnyAndFindFirstExample {

	public static Optional<Student> findAnyStudent() {
		// see difference in parallelStream
		return StudentDataBase.getStudentDetails().stream()
				// mani
				// karthika
				// praise - Remaining student wont process, because we get first student
				.filter(student -> student.getGradeLevel() >= 3).findAny();
	}

	public static Optional<Student> findFirstStudent() {
		return StudentDataBase.getStudentDetails().stream()
				// mani
				// karthika
				// praise - Remaining student wont process, because we get first student
				.filter(student -> student.getGradeLevel() >= 3).findFirst();
	}

	public static void main(String a[]) {
		System.out.println("findAnyStudent");
		Optional<Student> findAnyStudent = findAnyStudent();
		if (findAnyStudent.isPresent()) {
			System.out.println("Find Any Student : " + findAnyStudent.get());
		} else {
			System.out.println("Student is not found");
		}

		System.out.println();
		System.out.println("findFirstStudent");
		Optional<Student> findFirstAnyStudent = findAnyStudent();
		if (findFirstAnyStudent.isPresent()) {
			System.out.println("Find First Student : " + findFirstAnyStudent.get());
		} else {
			System.out.println("Student is not found");
		}
	}

}
