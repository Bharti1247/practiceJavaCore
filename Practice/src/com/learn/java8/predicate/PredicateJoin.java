package com.learn.java8.predicate;

import java.util.function.Predicate;

public class PredicateJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		
		Predicate<Integer> isEven = i -> i%2 == 0;
		Predicate<Integer> isGreater = i -> i >= 18;
		
		System.out.printf("Even: %b", isEven.test(num));
		System.out.println();
		
		System.out.printf("Greater than 18: %b", isGreater.test(num));
		System.out.println();
		
		System.out.printf("Even as well as greater than 18: %b", isEven.and(isGreater).test(num));
		System.out.println();
		
		System.out.printf("Either even or greater than 18: %b", isEven.or(isGreater).test(num));
		System.out.println();
		
		System.out.printf("Not Even: %b", isEven.negate().test(num));
		System.out.println();
		
		System.out.printf("Less than 18: %b", isGreater.negate().test(num));
		System.out.println();
		
		System.out.printf("Neither even nor greater than 18: %b", isEven.or(isGreater).negate().test(num));
		System.out.println();

	}

}
