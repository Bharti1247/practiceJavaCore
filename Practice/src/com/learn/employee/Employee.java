package com.learn.employee;

public class Employee {
	private String name;
	private String age;
	private float salary;
	
	public Employee (String name, String age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(String age) {
		this.age = age;
	}
	
	void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAge() {
		return age;
	}
	
	public float getSalary() {
		return salary;
	}
	
	String displayEmployeeDetails() {
		return toString();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Employee details:\nName : ").append(this.name);
		sb.append("\nAge : ").append(this.age);
		sb.append("\nSalary : ").append(this.salary);
		return sb.toString();
	}
}
