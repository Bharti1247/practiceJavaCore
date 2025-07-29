package com.learn.basic;

public class StaticTest {
	static int i = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticTest();	
		
	}
	
	public static void staticTest() {
		StaticTest t = new StaticTest();
		System.out.println(i);
		t.i = 1;
		System.out.println(i);
	}	

}
