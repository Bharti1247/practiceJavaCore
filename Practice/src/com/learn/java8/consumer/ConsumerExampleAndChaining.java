package com.learn.java8.consumer;

import java.util.function.Consumer;

public class ConsumerExampleAndChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit = 5;
		
		Consumer<Integer> doubleIt = num -> System.out.println("Doubled value : " + 2*num); 
		Consumer<Integer> squareIt = num -> System.out.println("Squared value : " + num*num);
		
		// as Consumer doesn't return anything it'll simply print the statements
		doubleIt.andThen(squareIt).accept(digit);
		System.out.println();
		squareIt.andThen(doubleIt).accept(digit);
	}

}
