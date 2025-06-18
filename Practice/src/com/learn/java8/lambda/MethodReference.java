package com.learn.java8.lambda;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractInterface ai = ClassHavingMethod :: testImplementation;
		ai.print();
	}

}
