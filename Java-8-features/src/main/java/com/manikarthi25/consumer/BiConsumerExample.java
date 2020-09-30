package com.manikarthi25.consumer;

import java.util.List;
import java.util.function.BiConsumer;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class BiConsumerExample {

	public static void printNameAndActivities() {
		List<Student> studentList = StudentDataBase.getStudentDetails();
		BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name +" : " + activities);
		studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
	}

	public static void main(String[] args) {
		printNameAndActivities();
	}

}
