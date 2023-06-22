package com.manikarthi25.java8.stream;

import com.manikarthi25.java8.data.StudentDataBase;

public class StreamMatchExample {
	
	public static boolean allMatch() {
		return StudentDataBase.getStudentDetails().stream()
				.allMatch(student -> student.getGpa() >= 6); // return true if all students gpa is above 6 else false
	}
	
	public static boolean anyMatch() {
		return StudentDataBase.getStudentDetails().stream()
				.anyMatch(student -> student.getGpa() >= 6); // return true if any students gpa is above 6 else false
	}

	public static boolean noneMatch() {
		return StudentDataBase.getStudentDetails().stream()
				.noneMatch(student -> student.getGpa() >= 6); // opposite to allMatch
	}
	
	public static void main(String[] args) {
		System.out.println("allMatch : " + allMatch());
		
		System.out.println();
		System.out.println("anyMatch : " + anyMatch());
		
		System.out.println();
		System.out.println("noneMatch : " +noneMatch());
	}

}
