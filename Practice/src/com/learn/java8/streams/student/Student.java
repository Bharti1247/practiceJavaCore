package com.learn.java8.streams.student;

public class Student {
	
	private String fName;
	private String lName;
	private String city;
	private double grade;
	private int age;
	private String dept;
	
	public Student(String fName, String lName, String city, double grade, int age, String dept) {
		// TODO Auto-generated constructor stub
		this.fName = fName;
		this.lName = lName;
		this.city = city;
		this.grade = grade;
		this.age = age;
		this.dept = dept;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [fName=");
		builder.append(fName);
		builder.append(", lName=");
		builder.append(lName);
		builder.append(", city=");
		builder.append(city);
		builder.append(", grade=");
		builder.append(grade);
		builder.append(", age=");
		builder.append(age);
		builder.append(", dept=");
		builder.append(dept);
		builder.append("]");
		return builder.toString();
	}
	
	
}
