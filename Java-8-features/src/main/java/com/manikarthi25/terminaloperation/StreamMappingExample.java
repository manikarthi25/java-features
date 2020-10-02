package com.manikarthi25.terminaloperation;

import java.util.List;
import java.util.stream.Collectors;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class StreamMappingExample {

	public static void main(String[] args) {

		List<String> nameList = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList())); // avoid one map function - map(Student::getName).collect.... 

		System.out.println(nameList);

	}

}
