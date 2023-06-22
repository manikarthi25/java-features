package com.manikarthi25.java8.defaultmethod;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class DefaultMethodComparator {
	
	static Consumer<Student> studentConsumer = (student) -> System.out.println(student);
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
	
	public static void sortByNameComparator(List<Student> studentList) {
		studentList.sort(nameComparator);
		studentList.forEach(studentConsumer);
	}
	
	public static void sortByGpaComparator(List<Student> studentList) {
		studentList.sort(gpaComparator);
		studentList.forEach(studentConsumer);
	}
	
	public static void comparatorChaining(List<Student> studentList) {
		studentList.sort(nameComparator.thenComparing(gpaComparator));
		studentList.forEach(studentConsumer); // throw exception if null in student list
	}
	
	public static void sortNullsFirst(List<Student> studentList) { // it won't throw null pointer exception
		Comparator<Student> studentNameComparator = Comparator.nullsFirst(nameComparator);
		//Comparator<Student> studentGpaComparator = Comparator.nullsLast(gpaComparator);
		studentList.sort(studentNameComparator);
		studentList.forEach(studentConsumer); // throw exception if null in student list
	}
			

	public static void main(String[] args) {
	
		List<Student> studentList = StudentDataBase.getStudentDetails();
		System.out.println("Before Sort:");
		studentList.forEach(studentConsumer);
		
		System.out.println();
		System.out.println("After Name Sort :");
		sortByNameComparator(studentList);
		
		System.out.println();
		System.out.println("After Gpa Sort :");
		sortByGpaComparator(studentList);
		
		System.out.println();
		System.out.println("After Comparator Chaining Sort :");
		comparatorChaining(studentList);
		
		System.out.println();
		System.out.println("After Sort Nulls Firs Check :");
		sortNullsFirst(studentList);

	}

}
