package com.manikarthi25.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.manikarthi25.data.Student;
import com.manikarthi25.data.StudentDataBase;

public class StreamReduceExample {

	public static Integer performMultiplicationWithInitValue(List<Integer> integerList) {
		return integerList.stream()
				// 1
				// 3
				// 5
				// a=1(Initial Value) * b=1(From Stream) -> result 1 is returned
				// a=1(result) * b=3(From stream) -> result 3 is returned
				// a=3(result) * b=5(From Stream) -> res ult is 15 is returned
				.reduce(1, (a, b) -> (a * b)); // with init value is 1
	}

	public static Optional<Integer> performMultiplicationWithoutInitValue(List<Integer> integerList) {
		return integerList.stream()
				// 1
				// 3
				// 5
				// a=1(result) * b=3(From stream) -> result 3 is returned
				// a=3(result) * b=5(From Stream) -> res ult is 15 is returned
				.reduce((a, b) -> (a * b)); // without init value
	}

	public static Optional<Student> getHighestGpaStudent() {
		return StudentDataBase.getStudentDetails().stream()
				.reduce((student1, student2) -> student1.getGpa() > student2.getGpa() ? student1 : student1);
	}

	public static void main(String[] args) {
		System.out.println(
				"Multiplication with init value: " + performMultiplicationWithInitValue(Arrays.asList(1, 3, 5)));

		System.out.println();
		Optional<Integer> optionalInteger = performMultiplicationWithoutInitValue(Arrays.asList(1, 3, 5));
		System.out.println("Multiplication without init value: " + optionalInteger.get());
		System.out.println("Check value is there or not : " + optionalInteger.isPresent());

		System.out.println();
		ArrayList<Integer> integerList = new ArrayList<>();
		Optional<Integer> optionalInteger1 = performMultiplicationWithoutInitValue(integerList);
		System.out.println("Check value is there or not : " + optionalInteger1.isPresent()); // Empty array

		if (optionalInteger1.isPresent()) {
			System.out.println(optionalInteger1.get());
		}

		System.out.println();
		Optional<Student> studentOptional = getHighestGpaStudent();
		if (studentOptional.isPresent()) {
			System.out.println("Highest GPA Student Details : " + studentOptional.get());
		}

	}

}
