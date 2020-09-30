package com.manikarthi25.functioninterface;

import java.util.List;
import java.util.function.Consumer;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> c2 = (student) -> System.out.println(student);
	static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
	static Consumer<Student> c4 = (student) -> System.out.print(student.getActivities());

	public static void printName() {
		System.out.println("printName");
		List<Student> studentList = StudentDataBase.getStudentDetails();
		studentList.forEach(c2);
		System.out.println();
	}

	public static void printNameAndActivites() {
		System.out.println("printNameAndActivites");
		List<Student> studentList = StudentDataBase.getStudentDetails();
		studentList.forEach(c3.andThen(c4)); // Consumer Chaining
		System.out.println();
	}

	public static void printNameAndActivitesUsingCondition() {
		System.out.println("printNameAndActivitesUsingCondition");
		List<Student> studentList = StudentDataBase.getStudentDetails();
		studentList.forEach(student -> {
			if (student.getGpa() >= 6 && student.getGradeLevel() <= 3) {
				c3.andThen(c4).accept(student);
			}
		});
		System.out.println();
	}

	public static void main(String a[]) {

		Consumer<String> c1 = (name) -> System.out.println("Change to Upper Case Letter : " + name.toUpperCase());
		c1.accept("mani");

		printName();
		printNameAndActivites();
		printNameAndActivitesUsingCondition();

	}

}
