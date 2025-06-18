package com.learn.java8.function;

import java.util.function.Function;

import com.learn.employee.Employee;

public class FunctionChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("Ram", "45", 6f);
		Employee emp2 = new Employee("Sam", "34", 97.5f);
		
		// andThen method
		Function<Employee, Float> getEmployeeSalary = emp -> emp.getSalary();
		Function<Float, Float> doubleSalary = sal -> 2*sal;
		Function<Float, String> print = p -> "Salary with increment: " + p;
		
		System.out.println("Old Salary: " + getEmployeeSalary.apply(emp1));
		System.out.println(getEmployeeSalary.andThen(doubleSalary).andThen(print).apply(emp1));
		
		System.out.println("\nOld Salary: " + getEmployeeSalary.apply(emp2));
		System.out.println(getEmployeeSalary.andThen(doubleSalary).andThen(print).apply(emp2));
		
		
		// compose method
		Function<Employee, String> getEmployeeName = emp -> emp.getName();
		Function<String, String> updateName = name -> name+" Sharma";
		Function<String, String> addTitle = title -> "Mr. " + title;
		
		System.out.println("Name: " + getEmployeeName.apply(emp1));
		System.out.println(addTitle.compose(updateName).compose(getEmployeeName).apply(emp1));
		
		System.out.println("Name: " + getEmployeeName.apply(emp2));
		System.out.println(addTitle.compose(updateName).compose(getEmployeeName).apply(emp2));
	}

}
