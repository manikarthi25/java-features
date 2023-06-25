package com.manikarthi25.java8.terminaloperation;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.manikarthi25.java8.data.Student;
import com.manikarthi25.java8.data.StudentDataBase;

public class StreamGroupingExample {

	public static void groupingStudentByGender() {
		Map<String, List<Student>> studentMap = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		System.out.println("groupingStudentByGender :" + studentMap);
	}

	public static void customiziedGroupingStudent() {
		Map<String, List<Student>> studentMap = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() >= 6 ? "OUTSTANDING" : "AVERAGE"));
		System.out.println();
		System.out.println("Customized Grouping - customiziedGroupingStudent : " + studentMap);
	}

	public static void twoLevelGrouping_1() {
		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(Student::getGender)));
		System.out.println();
		System.out.println("Two level Grouping - twoLevelGrouping : " + studentMap);
	}

	public static void twoLevelGrouping_2() {
		Map<String, Integer> studentNotebookCount = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));
		System.out.println();
		System.out.println("Grouping and summing based on note books:" + studentNotebookCount);

	}
	
	public static void twoLevelGrouping_3() {
		Map<String, Integer> studentCountBasedOnGender = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.summingInt(Student::getNoteBooks)));
		System.out.println();
		System.out.println("Grouping and summing based on gender :" + studentCountBasedOnGender);

	}

	public static void threeArgumentGroupingBy() {
		HashMap<String, List<Student>> studentHashMap = StudentDataBase.getStudentDetails().stream()
				.collect(Collectors.groupingBy(Student::getName, HashMap::new, Collectors.toList()));
		System.out.println();
		System.out.println("Three Arguments : " + studentHashMap);
		System.out.println();
		System.out.println("Kannan Details Only : " + studentHashMap.get("kannan"));
	}

	public static void findMaxGpaGroupingByGradeLevel() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getStudentDetails().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		System.out.println();
		System.out.println("Find maximum GPA group bt grade level  - with optional : " + studentMapOptional);
		
		Map<Integer, Student> studentMap = StudentDataBase.getStudentDetails().stream().collect(Collectors.groupingBy(Student::getGradeLevel,
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		
		System.out.println();
		System.out.println("Find maximum GPA group by grade level  - without optional : " + studentMap);
	}
	
	public static void findMinGpaGroupingByGradeLevel() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getStudentDetails().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors.minBy(Comparator.comparing(Student::getGpa))));
		System.out.println();
		System.out.println("Find minimum GPA group by grade level  - with optional : " + studentMapOptional);
		
		Map<Integer, Student> studentMap = StudentDataBase.getStudentDetails().stream().collect(Collectors.groupingBy(Student::getGradeLevel,
				Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		
		System.out.println();
		System.out.println("Find minimum GPA group by grade level  - without optional : " + studentMap);
	}

	public static void main(String[] args) {

		groupingStudentByGender();
		customiziedGroupingStudent();
		twoLevelGrouping_1();
		twoLevelGrouping_2();
		twoLevelGrouping_3();
		threeArgumentGroupingBy();
		findMaxGpaGroupingByGradeLevel();
		findMinGpaGroupingByGradeLevel();

	}

}

/*
groupingStudentByGender :{female=[Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty], Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty], Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]], male=[Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty], Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty], Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]]}

Customized Grouping - customiziedGroupingStudent : {AVERAGE=[Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty], Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]], OUTSTANDING=[Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty], Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty], Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty], Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]]}

Two level Grouping - twoLevelGrouping : {2={female=[Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]], male=[Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty]]}, 3={female=[Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]], male=[Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]]}, 4={male=[Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]]}, 5={female=[Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]]}}

Grouping and summing based on note books:{kannan=2, karthika=11, karthi=8, raji=6, mani=10, praise=4}

Grouping and summing based on gender :{female=21, male=20}

Three Arguments : {kannan=[Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]], karthika=[Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]], karthi=[Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]], raji=[Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]], mani=[Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty]], praise=[Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]]}

Kannan Details Only : [Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]]

Find maximum GPA group bt grade level  - with optional : {2=Optional[Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty]], 3=Optional[Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty]], 4=Optional[Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]], 5=Optional[Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]]}

Find maximum GPA group by grade level  - without optional : {2=Student [name=mani, gender=male, gradeLevel=2, gpa=9.9, activities=[swimming, cricket], noteBooks=10, bike=Optional.empty], 3=Student [name=praise, gender=female, gradeLevel=3, gpa=6.9, activities=[volleyball, cricket], noteBooks=4, bike=Optional.empty], 4=Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty], 5=Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]}

Find minimum GPA group by grade level  - with optional : {2=Optional[Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty]], 3=Optional[Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty]], 4=Optional[Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty]], 5=Optional[Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]]}

Find minimum GPA group by grade level  - without optional : {2=Student [name=karthika, gender=female, gradeLevel=2, gpa=9.4, activities=[footbal, cricket], noteBooks=11, bike=Optional.empty], 3=Student [name=karthi, gender=male, gradeLevel=3, gpa=6.2, activities=[basket, gymnastics], noteBooks=8, bike=Optional.empty], 4=Student [name=kannan, gender=male, gradeLevel=4, gpa=4.9, activities=[basket, dancing], noteBooks=2, bike=Optional.empty], 5=Student [name=raji, gender=female, gradeLevel=5, gpa=5.4, activities=[kabadi, cricket], noteBooks=6, bike=Optional.empty]}
*/
