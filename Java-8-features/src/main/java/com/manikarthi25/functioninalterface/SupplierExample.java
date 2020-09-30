package com.manikarthi25.functioninalterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class SupplierExample {

	public static void main(String a[]) {

		System.out.println("Get single Student Details");
		Supplier<Student> studentSupplier = () -> {
			return new Student("karthika", "female", 2, 9.4, Arrays.asList("footbal", "Cricket"));
		};
		System.out.println(studentSupplier.get());

		System.out.println();
		System.out.println("Get all Students Details");
		Supplier<List<Student>> studentListSupplier = () -> StudentDataBase.getStudentDetails();
		System.out.println(studentListSupplier.get());

	}

}
