package com.manikarthi25.java8.optional;

import java.util.Optional;

import com.manikarthi25.java8.data.Bike;
import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class OptionalFilterMapExample {

	public static void optionalFilter() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if (studentOptional.isPresent()) {
			studentOptional.filter(student -> student.getGpa() > 9.8)
					.ifPresent(student -> System.out.println("Optional Filter :" + student.getName()));
		}
	}

	public static void optionalFilterWithMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if (studentOptional.isPresent()) {
			String name = studentOptional.filter(student -> student.getGpa() > 9.8).map(Student::getName).get();
			System.out.println("Optional Filter with Map :" + name);
		}
	}
	
	public static void optionalFilterWithFlatMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); // Optional<Student>
		if(studentOptional.isPresent()) {
			studentOptional.filter(student -> student.getGpa() > 9.8) //Optional<Student, Optiona<Bike>>
			.flatMap(Student::getBike) // Optional<Bike>
			.map(Bike::getBikeName)
			.ifPresent(System.out::println); // .ifPresent(bikeName -> System.outprintln(bikeName)); //
		}
	}
	
	

	public static void main(String[] args) {
		optionalFilter();
		optionalFilterWithMap();
		optionalFilterWithFlatMap();
	}
}

