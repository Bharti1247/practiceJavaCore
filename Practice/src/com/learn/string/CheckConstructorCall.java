package com.learn.string;

public class CheckConstructorCall {
	/*
	public CheckConstructorCall(String s) {
		System.out.println("String");
	}
	*/
	public CheckConstructorCall(Object s) {
		System.out.println("Object");
	}
	
	
	public CheckConstructorCall(Integer s) {
		System.out.println("Integer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		new CheckConstructorCall(null);
		
		/**
		 * In comparison of String and Object, String is more specific, so it'll print String
		 * In comparison of Integer (Wrapper class) and Object, Integer is more specific, so it'll print Integer
		 * If all 3 will be present, it will show ambiguity as null is compatible with all 3 
		 * and Object is parent for both Integer and String and out of these 2 nothing is more specific.
		 */
	}

}
