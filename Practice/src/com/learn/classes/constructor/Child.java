package com.learn.classes.constructor;

public class Child extends Parent {
	Child () {
		System.out.println("Child Constructor");
	}
	
	void show () {
		System.out.println("Child class....");
	}
	
	static void staticShow() {
		System.out.println("static method child class....");
	}
}
