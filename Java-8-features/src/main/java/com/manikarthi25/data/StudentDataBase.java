package com.manikarthi25.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {

	public static Supplier<Student> studentSupplier = () -> {
		return new Student("mani", "male", 2, 9.9, Arrays.asList("Swimming", "Cricket"));
	};

	public static List<Student> getStudentDetails() {

		Student student1 = new Student("mani", "male", 2, 9.9, Arrays.asList("swimming", "cricket"), 10);
		Student student2 = new Student("karthika", "female", 2, 9.4, Arrays.asList("footbal", "cricket"), 11);

		Student student3 = new Student("praise", "female", 3, 6.9, Arrays.asList("volleyball", "cricket"), 4);
		Student student4 = new Student("karthi", "male", 3, 6.2, Arrays.asList("basket", "gymnastics"), 8);

		Student student5 = new Student("kannan", "male", 4, 4.9, Arrays.asList("basket", "dancing"), 2);
		Student student6 = new Student("raji", "femal4", 5, 5.4, Arrays.asList("kabadi", "cricket"), 6);

		List<Student> studentList = Arrays.asList(student1, student2, student3, student4, student5, student6);
		return studentList;

	}

}
