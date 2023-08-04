package com.manikarthi25.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class StreamWithMap {
	
	public static void main(String a[]) {
		
		Map<String, List<Student>> studentMap = StudentDataBase.getStudentDetails().stream().collect(Collectors.groupingBy(Student::getGender));
		
		//iterate map using stream
		studentMap.entrySet().stream().forEach(e -> {
			System.out.println("Key : "+e.getKey());
			System.out.println("Value : "+e.getValue());
		});
	}

}


/*
Key : female
Value : [Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty], Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty], Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]]
Key : male
Value : [Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty], Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty], Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]]
*/