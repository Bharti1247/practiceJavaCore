package com.learn.java8.lambda;

@FunctionalInterface
public interface AbstractInterface {
	public void print();
	
    static void log() {
        System.out.println("Logging...");
    }

}
