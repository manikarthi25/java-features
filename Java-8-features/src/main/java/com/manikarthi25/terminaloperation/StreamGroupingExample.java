package com.manikarthi25.terminaloperation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.xml.bind.SchemaOutputResolver;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class StreamGroupingExample {

	public static void groupingStudentByGender() {
		Map<String, List<Student>> studentMap = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		System.out.println("groupingStudentByGender :" + studentMap);
	}

	public static void customiziedGroupingStudent() {
		Map<String, List<Student>> studentMap = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() >= 6 ? "OUTSTANDING" : "AVERAGE"));
		System.out.println();
		System.out.println("Customized Grouping - customiziedGroupingStudent : " + studentMap);
	}

	public static void twoLevelGrouping_1() {
		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(Student::getGender)));
		System.out.println();
		System.out.println("Two level Grouping - twoLevelGrouping : " + studentMap);
	}

	public static void twoLevelGrouping_2() {
		Map<String, Integer> studentNotebookCount = StudentDataBase.getStudentDetails().stream()
						.collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));
		System.out.println();
		System.out.println("Grouping and summing :" + studentNotebookCount);
	}
	
	public static void threeArgumentGroupingBy() {
			HashMap<String, List<Student>> studentHashMap = StudentDataBase.getStudentDetails().stream()
					.collect(Collectors.groupingBy(Student::getName, HashMap::new, Collectors.toList()));
			System.out.println();
			System.out.println("Three Arguments : " + studentHashMap);
			System.out.println();
			System.out.println("Kannan Details Only : " + studentHashMap.get("kannan"));
	}

	public static void main(String[] args) {
		
		groupingStudentByGender();
		customiziedGroupingStudent();
		twoLevelGrouping_1();
		twoLevelGrouping_2();
		threeArgumentGroupingBy();

	}

}


