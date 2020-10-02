package com.manikarthi25.terminaloperation;

import java.util.stream.Collectors;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class StreamSumAndAverageExample {
	
	public static int sum() {
		return StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	public static double average() {
		return StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.averagingInt(Student::getNoteBooks));
	}

	public static void main(String[] args) {
		System.out.println("Using Summing : " + sum());
		System.out.println("Using Averaging : " + average());
	}

}
