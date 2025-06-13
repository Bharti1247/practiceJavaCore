package com.learn.classes;

public class Student {
	
	public String name;
	public int age;
	
	Student (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString () {
		return "Student's name: " + name + " and age :" + age;
	}
			
}
