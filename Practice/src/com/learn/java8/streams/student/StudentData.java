package com.learn.java8.streams.student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = Arrays.asList(
				new Student("John", "Doe", "NY", 8.38, 19, "Civil"),
				new Student("John", "Smith", "LA", 7.89, 20, "Mechanical"),
				new Student("Alex", "Ruso", "Washington", 8.8, 18, "Civil"),
				new Student("Neha", "Sharma", "LA", 7.4, 19, "Civil"),
				new Student("Jia", "Singh", "LA", 9.0, 17, "Mechanical")
		);
		
		// all students
		students.forEach(System.out::println);
		System.out.println("----------------------------");
		
		// All students from LA with a grade > 7.8
		students.stream()
				.filter(s -> s.getCity() == "LA" && s.getGrade() > 7.8)
				.forEach(s -> System.out.println(s));
		System.out.println("----------------------------");
		
		// Student with lowest grade
		Optional<Student> stu  = students.stream()
										.sorted(Comparator.comparing(Student::getGrade))
										.findFirst();
		if (stu.isPresent()) System.out.println(stu);
		System.out.println("----------------------------");
		
		// Student with highest grade
		Optional<Student> student  = students.stream()
								.max((s1, s2) -> Double.compare(s1.getGrade(), s2.getGrade()));
		if (student.isPresent()) System.out.println(student);
		System.out.println("----------------------------");
		
		// No. of students in each department
		Map<String, Long> stuCount = students.stream()
				.collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
		System.out.println("Student count per Department: " + stuCount);
		System.out.println("----------------------------");
		
		// Average grade per dept
		Map<String, Double> avgGrade = students.stream()
				.collect(Collectors.groupingBy(Student::getDept, 
						Collectors.averagingDouble(Student::getGrade)));
		System.out.println("Average Grade per Department: " + avgGrade);
		System.out.println("----------------------------");
		
		
		// Sort by age and then by grade
		students.stream().sorted(Comparator.comparing(Student::getAge)
				.thenComparing(Student::getGrade))
				.forEach(System.out::println);
		System.out.println("----------------------------");
		
		// comma-separated list of students
		students.stream().map(s -> s.getfName()).forEach(s -> System.out.print(s + ", "));
		System.out.println();
		System.out.println("----------------------------");
		
		// check if all students are above 18
		Boolean allGreater = students.stream().allMatch(s -> s.getAge() > 18);
		System.out.println("all students are above 18 : " + allGreater);
		System.out.println("----------------------------");
		
		// dept with most students
		String dept = students.stream()
				.collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey).orElse("Null");
		System.out.println("dept with most students : " + dept);
		System.out.println("----------------------------");		
		
		// Partition students based on grade > 8 and <= 8 
		Map<Boolean, List<Student>> part = students.stream()
				.collect(Collectors.partitioningBy(s -> s.getGrade() > 8));
		
		System.out.println("Students with grades > 8 :");
		part.get(true).forEach(System.out::println);
		System.out.println();
		System.out.println("Students with grades < 8 :");
		part.get(false).forEach(System.out::println);
		System.out.println("----------------------------");	
		
		// All Students with full name
		students.stream().map(s -> s.getfName().concat(" " + s.getlName()))
		.forEach(System.out::println);
		System.out.println("----------------------------");	
		
		// Student with longest full name
		Optional<Student>fullName = students.stream()
		.max(Comparator.comparingInt(s -> s.getfName().concat(" " + s.getlName()).length()));
		System.out.println(fullName);
	}

}
