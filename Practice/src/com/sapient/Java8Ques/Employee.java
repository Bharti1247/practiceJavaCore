package com.sapient.Java8Ques;

public class Employee {
	private String name;
	private String location;
	private String team;
	
	public Employee(String name, String location, String team) {
		super();
		this.name = name;
		this.location = location;
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", team=" + team + "]";
	}
	
	
}
