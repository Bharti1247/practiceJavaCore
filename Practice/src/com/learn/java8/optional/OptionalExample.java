package com.learn.java8.optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Optional<String> optionalName = Optional.ofNullable("Alex");
		Optional<String> optionalName = Optional.ofNullable(null);
		Optional<String> optionalName2 = Optional.ofNullable(null);
		//Optional<String> optionalName2 = Optional.ofNullable("Alex");
		Optional<String> optionalName3 = Optional.ofNullable("Alice");

		// Check if value is present
		if (optionalName.isPresent()) {
		    System.out.println("Name is present: " + optionalName.get());
		} else {
		    System.out.println("Name is not present");
		}
		
		
		// Equals method
		Optional<String> name1 = Optional.of("Rama");
		Optional<String> name2 = Optional.of("Rama");
		Optional<String> name3 = Optional.of("Ram");
		
		// Comparing Optional objects
        System.out.println(name1.equals(name2)); 
        System.out.println(name1.equals(name3));
        
        System.out.println(optionalName.equals(optionalName2)); 
        System.out.println(optionalName.equals(optionalName3));
	}

}
