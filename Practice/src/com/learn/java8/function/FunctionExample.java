package com.learn.java8.function;

import java.util.function.Function;

import com.learn.employee.Employee;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("Ram", "45", 67.5f);
		Employee emp2 = new Employee("Sam", "34", 97.5f);
		
		Function<Employee, String> getEmployeeAge = emp -> emp.getAge();
		
		System.out.printf("Age of Employee 1: %s\n", getEmployeeAge.apply(emp1));
		System.out.printf("Age of Employee 2: %s\n", getEmployeeAge.apply(emp2));

	}

}
