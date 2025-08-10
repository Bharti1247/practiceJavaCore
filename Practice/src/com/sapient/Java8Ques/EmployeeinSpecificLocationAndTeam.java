package com.sapient.Java8Ques;

import java.util.Arrays;
import java.util.List;

public class EmployeeinSpecificLocationAndTeam {
	
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Sam", "Bangalore", "IT"),
				new Employee("Ram", "Delhi", "HR"),
				new Employee("Jim", "Bangalore", "Product"),
				new Employee("Harry", "Delhi", "Product"),
				new Employee("Leena", "Bangalore", "Product")
			);

			employees.stream()
			.filter(emp -> emp.getTeam() == "Product" && emp.getLocation() == "Bangalore")
			.forEach(System.out::println);
	}
	
}
