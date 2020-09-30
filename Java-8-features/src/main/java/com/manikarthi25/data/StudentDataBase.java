package com.manikarthi25.data;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {

	public static List<Student> getStudentDetails() {

		Student student1 = new Student("mani", "male", 2, 9.9, Arrays.asList("Swimming", "Cricket"));
		Student student2 = new Student("karthika", "female", 2, 9.4, Arrays.asList("footbal", "Cricket"));

		Student student3 = new Student("praise", "female", 3, 6.9, Arrays.asList("volleyball", "Cricket"));
		Student student4 = new Student("karthi", "male", 3, 6.2, Arrays.asList("basket", "gymnastics"));

		Student student5 = new Student("kannan", "male", 4, 4.9, Arrays.asList("basket", "dancing"));
		Student student6 = new Student("raji", "femal4", 5, 5.4, Arrays.asList("kabadi", "Cricket"));

		List<Student> studentList = Arrays.asList(student1, student2, student3, student4, student5, student6);
		return studentList;

	}

}
