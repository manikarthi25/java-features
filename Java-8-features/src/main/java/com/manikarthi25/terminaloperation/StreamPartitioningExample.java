package com.manikarthi25.terminaloperation;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

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
		System.out.println("Partitioning By with one argument : " + partitioningMap);
	}

	public static void main(String[] args) {
		partitioningByWithOneArgument();
		partitioningByWithTwoArgument();
	}

}
