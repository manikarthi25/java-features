package com.manikarthi25.terminaloperation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class StreamGroupingExample {

	public static void groupingStudentByGender() {
		Map<String, List<Student>> studentMap = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		System.out.println("groupingStudentByGender :" + studentMap);
	}
	
	public static void customiziedGroupingStudent( ) {
		Map<String, List<Student>> studentMap = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() >=6 ? "OUTSTANDING" : "AVERAGE"));
		System.out.println();
		System.out.println("Customized Grouping - customiziedGroupingStudent : " + studentMap);
	}

	public static void main(String[] args) {
		groupingStudentByGender();
		customiziedGroupingStudent();
	}

}
