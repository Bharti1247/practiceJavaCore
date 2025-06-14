package com.learn.math.geometry;

public class Rectangle {
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public int calculateArea(int length, int breadth) {
		return length*breadth;
	}

}
