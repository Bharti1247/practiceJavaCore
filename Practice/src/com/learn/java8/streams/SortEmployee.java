package com.learn.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		List<Employee> list = Arrays.asList(
				new Employee(1, "Alice", 45000),
				new Employee(2, "Alice", 49500),
				new Employee(3, "James", 65000),
				new Employee(4, "Lily", 89000),
				new Employee(5, "James", 80000),
				new Employee(6, "Alice", 234000),
	            new Employee(7, "Bob", 80000) 
		);
		
		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
				.thenComparing(Employee::getName)).forEach(System.out::println);

	}

}
