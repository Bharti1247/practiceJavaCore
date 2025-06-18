package com.learn.java8.predicate;

import java.util.function.Predicate;

public class PredicateStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi, how are you?";
		
		Predicate<String> pre = s -> s.length() > 15;
		
		System.out.println("String length is gretater than 15 : " + pre.test(str));
	}

}
