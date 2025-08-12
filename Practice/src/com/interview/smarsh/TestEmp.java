package com.interview.smarsh;

import java.util.Arrays;
import java.util.List;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = Arrays.asList(
					new Employee("Sam", 45000),
					new Employee("Tim", 50000),
					new Employee("Ram", 48000)
				);
		
		list.stream()
		.forEach(i -> System.out.println(i.getName() + ", " + i.getSalary()));

	}

}
