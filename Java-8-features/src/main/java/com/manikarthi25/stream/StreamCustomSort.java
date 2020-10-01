package com.manikarthi25.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class StreamCustomSort {

	public static List<Student> sortStudentByName() {
		return StudentDataBase.getStudentDetails().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}

	public static List<Student> sortStudentByGpa() {
		return StudentDataBase.getStudentDetails().stream().sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
	}

	public static List<Student> sortStudentByNameDesc() {
		return StudentDataBase.getStudentDetails().stream().sorted(Comparator.comparing(Student::getName).reversed())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println("sortStudentByName : " + sortStudentByName());
		
		System.out.println();
		System.out.println("sortStudentByGpa : " + sortStudentByGpa());
		
		System.out.println();
		System.out.println("sortStudentByNameDesc : " + sortStudentByNameDesc());
	}

}
