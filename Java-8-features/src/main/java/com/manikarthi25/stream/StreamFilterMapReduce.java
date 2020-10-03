package com.manikarthi25.stream;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class StreamFilterMapReduce {

	public static Integer getNumberOfNoteBooks() {
		return StudentDataBase.getStudentDetails().stream()
				.filter(student -> student.getGpa() > 6)
				.filter(student -> student.getGender().equals("female"))
				.map(Student::getNoteBooks)
				// .reduce(0, (a, b) -> (a + b));
				.reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		System.out.println("Summation of note Books : " + getNumberOfNoteBooks());
	}

}
