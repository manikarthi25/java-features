package com.manikarthi25.java8.methodreference;

import java.util.List;
import java.util.function.Consumer;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class ConsumerMethodReference {

	static Consumer<Student> studentWithLambda = (student) -> System.out.println(student);

	static Consumer<Student> studentWithMethodReference = System.out::println;

	static Consumer<Student> studentWithMethodReference1 = Student::printListOfActivities;

	public static void main(String a[]) {
		System.out.println("studentWithLambda");
		List<Student> studentList = StudentDataBase.getStudentDetails();
		studentList.forEach(studentWithLambda);

		System.out.println();
		System.out.println("studentWithMethodReference");
		StudentDataBase.getStudentDetails().forEach(studentWithMethodReference);

		System.out.println();
		System.out.println("studentWithMethodReference1");
		StudentDataBase.getStudentDetails().forEach(studentWithMethodReference1);
	}

}
