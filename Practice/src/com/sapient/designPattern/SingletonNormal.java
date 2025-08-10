package com.sapient.designPattern;

public class SingletonNormal {

	private static SingletonNormal instance;
	
	private SingletonNormal () {}
	
	public static SingletonNormal getInstance() {
		if (SingletonNormal.instance == null)
			instance = new SingletonNormal();
		return instance;
	}

}


// This is a Singleton class, but not Thread safe.
// Fix - SingletonThreadSafe