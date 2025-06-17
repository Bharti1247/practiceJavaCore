package com.learn.basic;

public class Assert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAssert();

	}
	
	//assert
	public static void testAssert() {
		int age = 14;
		assert age <= 18 : "Cannot vote";
		System.out.println("The voter's age is " + age);
	}

}
