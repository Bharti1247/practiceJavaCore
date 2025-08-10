package com.sapient.designPattern;

public class SingletonThreadSafe {
	private static volatile SingletonThreadSafe instance;
	
	private SingletonThreadSafe() {}
	
	public static SingletonThreadSafe getInstance() {
		if (SingletonThreadSafe.instance == null) {
			synchronized(SingletonThreadSafe.class) {
				if (SingletonThreadSafe.instance == null) { // second null check for locking
					instance = new SingletonThreadSafe();
				}
			}
		}
		return instance;
	}

}


// This is Thread safe but can be broken via Reflection.
// Reflection provides method to access private fields as well as private Constructors
// Constructor<SingletonThreadSafe> construcor = SingletonThreadSafe.class.getDefinedConstructor();
// constructor.setAccessible(true);
// SingletonThreadSafe s1 = constructor.newInstance();
// SingletonThreadSafe s2 = SingletonThreadSafe.getInstance();

// Fix - SingletonThreadAndReflectionSafe


