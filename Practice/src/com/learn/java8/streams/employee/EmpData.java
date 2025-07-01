package com.learn.java8.streams.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmpData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp = Arrays.asList(		
			new Employee(1, "Jane", "Sales", "Executive", 45000),
			new Employee(2, "Allen", "Finance", "Sr. Executive", 105000),
			new Employee(3, "Alice", "Sales", "Associate", 25000),
			new Employee(4, "Jinny", "Sales", "Executive", 55000),
			new Employee(5, "Josh", "HR", "Manager", 500000),
			new Employee(6, "Jane", "HR", "Executive", 45800)
		);		
		
		// Employee count per department
		Map<String, Long> empCount = emp.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		System.out.println("Employee count per department: " + empCount);
		System.out.println();
		
		// Employee count per department sorted alphabetically
		Map<String, Long> empCountSorted = emp.stream()
				.collect(Collectors.groupingBy(Employee::getDept, TreeMap::new, Collectors.counting()));
		System.out.println("Employee count per department sorted alphabetically: " + empCountSorted);
		System.out.println();
		
		// Employees having salary > 45000
		System.out.println("Employees having salary > 45000 :");
		emp.stream().filter(s -> s.getSalary() > 45000).forEach(System.out::println);
		System.out.println();
		
		//Employees from Sales dept with salary > 40000
		System.out.println("Employees from Sales dept with salary > 40000");
		emp.stream().filter(s -> s.getDept() == "Sales" && s.getSalary() > 40000)
		.forEach(System.out::println);
		System.out.println();
		
		// Lowest salaried Employee 
		Optional<Employee> lowestSalariedEmp  
			= emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).findFirst();
		if (lowestSalariedEmp.isPresent()) 
			System.out.println("Lowest salaried Employee: " + lowestSalariedEmp);
		System.out.println();
		
		// Highest salaried Employee 
		Optional<Employee> highestSalariedEmp 
			= emp.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		if (highestSalariedEmp.isPresent()) 
			System.out.println("Highest salaried Employee: " + highestSalariedEmp);
		System.out.println();
		
		// Highest salaried employee from Sales dept
		Optional<Employee> highestSalariedEmpSales 
			= emp.stream().filter(s -> s.getDept() == "Sales")
				.max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		if (highestSalariedEmpSales.isPresent()) 
			System.out.println("Highest salaried employee from Sales dept: " + highestSalariedEmpSales);
		else System.out.println("Not found");
		System.out.println();
		
		// Employee partitioned on salary > 100000
		Map<Boolean, List<Employee>> empPart
			= emp.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 100000));
		
		System.out.println("Employees with salary > 100000");
		empPart.get(true).forEach(System.out::println); 
		
		System.out.println("Employees with salary < 100000");
		empPart.get(false).forEach(System.out::println);
		
		System.out.println();
		
		// Average salary per dept
		Map<String, Double> avgSalaryPerDept
			= emp.stream().collect(
					Collectors.groupingBy(Employee::getDept, 
							Collectors.averagingDouble(Employee::getSalary))
					);
		System.out.println("Average salary per dept: " + avgSalaryPerDept);
		System.out.println();
		
		// Sort Employees based on dept and salary
		System.out.println("Employees based on dept and salary");
		emp.stream()
			.sorted(Comparator.comparing(Employee::getDept).thenComparing(Employee::getSalary))
			.forEach(System.out::println);
		System.out.println();
		
		// Employee with second highest salary
		Optional<Employee> empWithSecondHighestSalary
			= emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
				.reversed()).skip(1).findFirst();
		
		if (empWithSecondHighestSalary.isPresent()) 
			System.out.println(empWithSecondHighestSalary);
		else System.out.println("Not found");
	}

}
