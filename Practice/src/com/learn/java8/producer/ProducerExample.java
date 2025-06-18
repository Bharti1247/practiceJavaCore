package com.learn.java8.producer;

import java.util.function.Supplier;
import com.learn.employee.Employee;

public class ProducerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Employee> newEmployee = () -> new Employee("Alex", "23", 5.0f);
		
		System.out.println(newEmployee.get());

	}

}
