package com.manikarthi25.java8.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class MapExample {

	public static void main(String[] args) {

		Map<String, List<Student>> studentMap = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.groupingBy(Student::getGender));

		// iterate map using stream
		studentMap.entrySet().stream().forEach(e -> { 
							System.out.println("Key : " + e.getKey());
							System.out.println("Value : " + e.getValue());
		});
		
		studentMap.values().stream().forEach(value -> System.out.println(value));
		
		studentMap.keySet().stream().forEach(key -> System.out.println(key));
		
		studentMap.entrySet().stream().filter(e -> e.getKey().equals("male")).forEach(System.out::println);
		
		Map<String, List<String>> people = new HashMap<>();
		people.put("Cena", Arrays.asList("123-1123", "456-3389"));
		people.put("Undertaker", Arrays.asList("678-2243", "986-5264"));
		people.put("Khali", Arrays.asList("678-6654", "986-3242"));

		List<List<String>> phonesWithmap = people.values().stream().map(p -> p).collect(Collectors.toList());
		System.out.println("phones with map() : " + phonesWithmap);

		List<String> phonesWithFlatmap = people.values().stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("phones with flatmap() : " + phonesWithFlatmap); 
		
	}

}

/*
 
Key : female
Value : [Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty], Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty], Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]]

Key : male
Value : [Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty], Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty], Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]]

[Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty], Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty], Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]]
[Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty], Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty], Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]]

female
male

male=[Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty], Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty], Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]]


phones with map() : [[678-6654, 986-3242], [123-1123, 456-3389], [678-2243, 986-5264]]
phones with flatmap() : [678-6654, 986-3242, 123-1123, 456-3389, 678-2243, 986-5264]

*/