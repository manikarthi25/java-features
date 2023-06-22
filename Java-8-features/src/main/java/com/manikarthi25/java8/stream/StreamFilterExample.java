package com.manikarthi25.java8.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class StreamFilterExample {

	static Predicate<Student> checkGender = student -> student.getGender().equals("female");
	static Predicate<Student> checkGPA = student -> student.getGpa() >= 7;
	
	
	
	public static List<Student> filterStudentByGender() {
		return StudentDataBase.getStudentDetails().stream()
				.filter(checkGender)
				.filter(checkGPA)
				.collect(Collectors.toList());
	}
	

	public static void main(String a[]) {
		System.out.println("Filter Students by female :" + filterStudentByGender());
	}

}

/*
Filter Students by female :
[Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, 
activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]]
*/