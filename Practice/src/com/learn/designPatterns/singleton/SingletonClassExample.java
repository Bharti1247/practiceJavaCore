package com.learn.designPatterns.singleton;

public class SingletonClassExample {
	
	private static final SingletonClassExample instance = new SingletonClassExample();
	
	private SingletonClassExample() {
		System.out.println("Object of Singleton class");
	}
	
	public static SingletonClassExample getInstance() {
		return instance;
	}
}
