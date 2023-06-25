package com.manikarthi25.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class DebugInStream {

	public static void main(String[] args) {
		
		Predicate<Student> predicateGradeLevel = (student) -> student.getGradeLevel() >= 3;
		Predicate<Student> predicateGpa = (student) -> student.getGpa() >= 6;

		Map<String, List<String>> studentMapWithPredicate = StudentDataBase.getStudentDetails().stream()
				.peek(student -> { // peek methid used for debug in stream
					System.out.println();
					System.out.println(student);
				})
				.filter(predicateGradeLevel)
				.peek(student -> {
					System.out.println();
					System.out.println("First Filter output : " + student);
				})
				.filter(predicateGpa)
				.peek(student -> {
					System.out.println();
					System.out.println("Second Filter output : " + student);
				})
				.collect(Collectors.toMap(Student::getName, Student::getActivities));// Map - Without collect initialization, wont start any operation in filter

		System.out.println("With Predicate : " + studentMapWithPredicate);

	}

}

/*
 output
 -----------
 
Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty]

Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]

Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]

First Filter output : Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]

Second Filter output : Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]

Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]

First Filter output : Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]

Second Filter output : Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]

Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]

First Filter output : Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]

Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]

First Filter output : Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]
With Predicate : {karthi=[basket, gymnastics], praise=[volleyball, cricket]}

*/