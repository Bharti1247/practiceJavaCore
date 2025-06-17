package com.learn.compare;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	
	Employee (int id, String name) {
		this.id = id;
		this.name = name;
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Employee [id: ").append(this.id);
		sb.append(", name: ").append(this.name).append("]");
		return sb.toString();
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
	
		@Override
		public int compare(Employee emp1, Employee emp2) {
			// TODO Auto-generated method stub
			return emp1.getName().compareTo(emp2.getName());
		}
	};
}
