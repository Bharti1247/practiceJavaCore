package com.learn.java8.streams.employee;

public class Employee {
	private int id;
	private String name;
	private String dept;
	private String designation;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String dept, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", dept=");
		builder.append(dept);
		builder.append(", designation=");
		builder.append(designation);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
