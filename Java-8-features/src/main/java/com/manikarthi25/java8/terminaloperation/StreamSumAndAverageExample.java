package com.manikarthi25.java8.terminaloperation;

import java.util.stream.Collectors;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

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

/*
Using Summing : 41
Using Averaging : 6.833333333333333
*/