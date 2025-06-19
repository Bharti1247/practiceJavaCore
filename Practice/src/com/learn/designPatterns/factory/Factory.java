package com.learn.designPatterns.factory;

public class Factory {
	
	public Profession getService(int num) {
		if (num == 1) return new Doctor();
		else if (num == 2) return new Engineer();
		else {
			throw new IllegalArgumentException("Invalid choice" + num);
		}
	}
	
	
}
