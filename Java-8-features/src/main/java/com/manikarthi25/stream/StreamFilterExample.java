package com.manikarthi25.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class StreamFilterExample {

	public static List<Student> filterStudentByGender() {
		return StudentDataBase.getStudentDetails().stream()
				.filter(student -> student.getGender().equals("female"))
				.filter(student -> student.getGpa() >= 7)
				.collect(Collectors.toList());
	}

	public static void main(String a[]) {
		System.out.println("Filter Students by female :" + filterStudentByGender());
	}

}
