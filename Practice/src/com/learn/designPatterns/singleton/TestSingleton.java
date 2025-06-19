package com.learn.designPatterns.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Eager method -> Thread safe
		//SingletonClassExample single = new SingletonClassExample();
		
		SingletonClassExample s1 = SingletonClassExample.getInstance();
		SingletonClassExample s2 = SingletonClassExample.getInstance();
		SingletonClassExample s3 = SingletonClassExample.getInstance();
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
		
		// Enum -> Thread safe; recommended by Java
		Singleton single1 = Singleton.INSTANCE;
		single1.doSomething();
		
		Singleton single2 = Singleton.INSTANCE;
		single2.doSomething();
		
		System.out.println("single1: " + single1);
		System.out.println("single2: " + single2);

	}

}
