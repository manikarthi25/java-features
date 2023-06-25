package com.manikarthi25.java8.stream;

import java.util.Optional;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

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
/*
 Output
 ---------
findAnyStudent
Find Any Student : Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]

findFirstStudent
Find First Student : Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]
*/