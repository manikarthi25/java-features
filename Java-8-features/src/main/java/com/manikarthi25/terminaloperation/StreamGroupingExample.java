package com.manikarthi25.terminaloperation;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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

	public static void findMaxGpaGroupingByGradeLevel() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getStudentDetails().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		System.out.println();
		System.out.println("Find maximum GPA group bt grade level  - with optional : " + studentMapOptional);
		
		Map<Integer, Student> studentMap = StudentDataBase.getStudentDetails().stream().collect(Collectors.groupingBy(Student::getGradeLevel,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		
		System.out.println();
		System.out.println("Find maximum GPA group by grade level  - without optional : " + studentMap);
	}
	
	public static void findMinGpaGroupingByGradeLevel() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getStudentDetails().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors.minBy(Comparator.comparing(Student::getGpa))));
		System.out.println();
		System.out.println("Find minimum GPA group by grade level  - with optional : " + studentMapOptional);
		
		Map<Integer, Student> studentMap = StudentDataBase.getStudentDetails().stream().collect(Collectors.groupingBy(Student::getGradeLevel,
				Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		
		System.out.println();
		System.out.println("Find minimum GPA group by grade level  - without optional : " + studentMap);
	}

	public static void main(String[] args) {

		groupingStudentByGender();
		customiziedGroupingStudent();
		twoLevelGrouping_1();
		twoLevelGrouping_2();
		threeArgumentGroupingBy();
		findMaxGpaGroupingByGradeLevel();
		findMinGpaGroupingByGradeLevel();

	}

}
