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

/*
studentWithLambda
Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty]
Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]
Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]
Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]
Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]
Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]

studentWithMethodReference
Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty]
Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]
Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]
Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]
Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]
Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]

studentWithMethodReference1
[swimming, cricket]
[footbal, cricket]
[volleyball, cricket]
[basket, gymnastics]
[basket, dancing]
[kabadi, cricket]
*/