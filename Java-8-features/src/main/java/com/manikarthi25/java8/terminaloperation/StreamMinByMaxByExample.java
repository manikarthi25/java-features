package com.manikarthi25.java8.terminaloperation;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class StreamMinByMaxByExample {
	
	public static Optional<Student> minByExample() {
		return StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	
	public static Optional<Student> maxByExample() {
		return StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}

	public static void main(String[] args) {
		
		System.out.println("Min By - Student :" + minByExample());
		System.out.println("Mzx By - Student :" + maxByExample());
		
	}

}
