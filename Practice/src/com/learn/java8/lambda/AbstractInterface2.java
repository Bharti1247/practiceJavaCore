package com.learn.java8.lambda;

@FunctionalInterface
public interface AbstractInterface2 {
	public int sum(int num1, int num2, int... others);
	
	default int multiply(int num1, int num2) {
		return num1*num2;
	}
}
