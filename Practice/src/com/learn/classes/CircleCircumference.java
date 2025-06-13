package com.learn.classes;

public class CircleCircumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Circle c = new Circle(3.3);	
		System.out.println("Circumference : " + 2*Math.PI*c.radius);
		System.out.println("Circumference : " + Math.round(2*Math.PI*c.radius));
		System.out.println("Circumference : " + Math.ceil(2*Math.PI*c.radius));
		System.out.println("Circumference : " + Math.floor(2*Math.PI*c.radius));
	}

}
