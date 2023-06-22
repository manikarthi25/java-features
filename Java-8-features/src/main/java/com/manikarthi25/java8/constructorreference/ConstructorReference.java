package com.manikarthi25.java8.constructorreference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.manikarthi25.java8.data.Student;

public class ConstructorReference {

	static Supplier<Student> studentSupplierNoArg = Student::new;

	static Function<String, Student> studentSupplierOneArg = Student::new;

	public static void main(String[] args) {

		System.out.println(studentSupplierNoArg.get());
		System.out.println(studentSupplierOneArg.apply("Mani"));

	}

}
