package com.manikarthi25.java8.functioninalterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

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

/*
Get single Student Details
Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, Cricket], noteBooks=0, bike=Optional.empty]

Get all Students Details
[Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty], Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty], Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty], Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty], Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty], Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]]
*/