package com.manikarthi25.java8.functioninalterface;

import java.util.List;
import java.util.function.BiConsumer;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

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

/*
mani : [swimming, cricket]
karthika : [footbal, cricket]
praise : [volleyball, cricket]
karthi : [basket, gymnastics]
kannan : [basket, dancing]
raji : [kabadi, cricket]
*/