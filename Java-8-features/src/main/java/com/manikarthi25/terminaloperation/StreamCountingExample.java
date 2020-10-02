package com.manikarthi25.terminaloperation;

import java.util.stream.Collectors;

import com.manikarthi25.data.StudentDataBase;

public class StreamCountingExample {

	public static long countNoOfStudents() {
		return StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.counting());
	}

	public static long countNoOfStudentsFilterByGpa() {
		return StudentDataBase.getStudentDetails().stream()
				.filter(student -> student.getGpa() > 6)
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {
		
		System.out.println("countNoOfStudents :" + countNoOfStudents());
		System.out.println("countNoOfStudentsFilterByGpa :" + countNoOfStudentsFilterByGpa());

	}

}
