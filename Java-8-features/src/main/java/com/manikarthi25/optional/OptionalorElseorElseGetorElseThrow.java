package com.manikarthi25.optional;

import java.util.Optional;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class OptionalorElseorElseGetorElseThrow {
	
	public static String optionalorElse() {
		//Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		String name = studentOptional.map(Student::getName).orElse("default"); // String is argument if value is not present, return default string 
		return name;
	}
	
	public static String optionalorElseGet() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> studentOptional = Optional.ofNullable(null); // return default
		String name = studentOptional.map(Student::getName).orElseGet(() ->"default"); // Supplier as argument if value is not present, return default string
		return name;
	}
	
	public static String optionalorElseThrow() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		//Optional<Student> studentOptional = Optional.ofNullable(null); // return exception
		String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException()); //  if value is not present, return exception
		return name;
	}

	public static void main(String[] args) {
		
		System.out.println("orElse : " + optionalorElse());
		System.out.println("orElseGet : " + optionalorElseGet());
		System.out.println("orElseThrow : " + optionalorElseThrow());

	}

}
