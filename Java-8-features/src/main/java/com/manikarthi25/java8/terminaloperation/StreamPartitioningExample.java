package com.manikarthi25.java8.terminaloperation;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class StreamPartitioningExample {

	static Predicate<Student> gpaPredicate = (student) -> student.getGpa() >= 6;

	public static void partitioningByWithOneArgument() {
		Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.partitioningBy(gpaPredicate));
		System.out.println("Partitioning By with one argument : " + partitioningMap);
	}

	public static void partitioningByWithTwoArgument() {
		Map<Boolean, Set<Student>> partitioningMap = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.partitioningBy(gpaPredicate, Collectors.toSet())); // Giving second argument type of
																						// collect like Set
		System.out.println("Partitioning By with two arguments : " + partitioningMap);
	}

	public static void main(String[] args) {
		partitioningByWithOneArgument();
		partitioningByWithTwoArgument();
	}

}

/*
Partitioning By with one argument : {false=[Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty], Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]], true=[Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty], Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty], Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty], Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]]}
Partitioning By with two arguments : {false=[Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty], Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]], true=[Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty], Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty], Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty], Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]]}
*/