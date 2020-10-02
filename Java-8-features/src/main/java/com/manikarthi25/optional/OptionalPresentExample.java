package com.manikarthi25.optional;

import java.util.Optional;

import com.manikarthi25.data.StudentDataBase;

public class OptionalPresentExample {

	public static void main(String[] args) {

		Optional<String> stringOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get().getName());
		if (stringOptional.isPresent()) { // return true or false, if value is present, return true else false
			System.out.println(stringOptional.get());
		}

		stringOptional.ifPresent(name -> System.out.println(name)); // if value is present, we can perform operation using present value
		
	}
}
