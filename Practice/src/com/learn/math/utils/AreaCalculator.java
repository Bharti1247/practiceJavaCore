package com.learn.math.utils;

import java.util.Scanner;

public class AreaCalculator {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCalculator calc = new AreaCalculator();
		
		System.out.println("*****Welcome to Area Calculator*****");
		int option;
		
		do {	
			System.out.println("\nChoose '1' to calculate the area of Circle\nChoose '2' to calculate the area of Rectangle");
			option = scanner.nextInt();
			
			switch(option) {
				case 1 : calc.areaCircle(); break;
				case 2 : calc.areaRectangle(); break;
				default : System.out.println("Enter the correct option");
			}			
		} while(option > 0 && option < 10);		
		
	}
	
	void areaCircle() {
		System.out.print("Enter the radius of Circle: ");
		double radius = scanner.nextDouble();
		System.out.println();
		
		com.learn.math.geometry.Circle c = new com.learn.math.geometry.Circle(radius);
		System.out.printf("Area of Circle with radius '%f' is %f", radius, c.calculateArea(radius));
		System.out.println();
	}
	
	void areaRectangle() {
		System.out.print("Enter the length of Rectangle: ");
		int length = scanner.nextInt();
		System.out.println();
		
		System.out.print("Enter the breadth of Rectangle: ");
		int breadth = scanner.nextInt();
		System.out.println();		
		
		com.learn.math.geometry.Rectangle r = new com.learn.math.geometry.Rectangle(length,breadth);
		System.out.printf("Area of Rectangle with length '%d' & breadth '%d' is %d", length, breadth, r.calculateArea(length, breadth));
		System.out.println();
	}
	
}
