package com.manikarthi25.java8.functioninalterface;

import java.util.List;
import java.util.function.Consumer;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

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

/*
Change to Upper Case Letter : MANI
printName
Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty]
Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]
Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]
Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]
Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]
Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]

printNameAndActivites
mani[swimming, cricket]karthika[footbal, cricket]praise[volleyball, cricket]karthi[basket, gymnastics]kannan[basket, dancing]raji[kabadi, cricket]
printNameAndActivitesUsingCondition
mani[swimming, cricket]karthika[footbal, cricket]praise[volleyball, cricket]karthi[basket, gymnastics]
*/