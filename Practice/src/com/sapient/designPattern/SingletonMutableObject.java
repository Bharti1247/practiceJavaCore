package com.sapient.designPattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingletonMutableObject {
	private static volatile SingletonMutableObject instance;
	
	private final int id;
	private final String name;
	private final List<String> skills; // mutable object
	
	private SingletonMutableObject (int id, String name, List<String> skills) {
		this.id = id;
		this.name = name;
		this.skills = Collections.unmodifiableList(skills); // creating defensive copy
	}
	
	public static SingletonMutableObject getInstance() {		
		if (instance == null) {
			synchronized(SingletonMutableObject.class) {
				if (instance == null) {
					instance = new SingletonMutableObject(1, "Sam", Arrays.asList("Java", "Python"));
				}
			}
		}
		return instance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getSkills() {
		return skills; // already unmodifiable
	}
	

}
