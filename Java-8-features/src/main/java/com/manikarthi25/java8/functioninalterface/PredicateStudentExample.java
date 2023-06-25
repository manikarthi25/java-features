package com.manikarthi25.java8.functioninalterface;

import java.util.List;
import java.util.function.Predicate;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (student) -> student.getGpa() >= 6;
	static Predicate<Student> p2 = (student) -> student.getGradeLevel() <= 3;

	public static void filterStudentsByGpa() {
		System.out.println("filterStudentsByGpa");
		List<Student> studenList = StudentDataBase.getStudentDetails();
		studenList.forEach(student -> {
			if (p1.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsByGradeLevel() {
		System.out.println("filterStudentsByGradeLevel");
		List<Student> studenList = StudentDataBase.getStudentDetails();
		studenList.forEach(student -> {
			if (p2.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsAnd() {
		System.out.println("filterStudentsAnd");
		List<Student> studenList = StudentDataBase.getStudentDetails();
		studenList.forEach(student -> {
			if (p1.and(p2).test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsOr() {
		System.out.println("filterStudentsOr");
		List<Student> studenList = StudentDataBase.getStudentDetails();
		studenList.forEach(student -> {
			if (p1.or(p2).test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentsNegate() {
		System.out.println("filterStudentsNegate");
		List<Student> studenList = StudentDataBase.getStudentDetails();
		studenList.forEach(student -> {
			if (p1.or(p2).negate().test(student)) {
				System.out.println(student);
			} else {
				System.out.println(student);
			}
		});
	}

	public static void main(String a[]) {

		filterStudentsByGpa();
		System.out.println();

		filterStudentsByGradeLevel();
		System.out.println();

		filterStudentsAnd();
		System.out.println();

		filterStudentsOr();
		System.out.println();

		filterStudentsNegate();
		System.out.println();
	}

}

/*
filterStudentsByGpa
Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty]
Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]
Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]
Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]

filterStudentsByGradeLevel
Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty]
Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]
Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]
Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]

filterStudentsAnd
Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty]
Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]
Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]
Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]

filterStudentsOr
Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty]
Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]
Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]
Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]

filterStudentsNegate
Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty]
Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]
Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]
Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]
Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]
Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]
*/
