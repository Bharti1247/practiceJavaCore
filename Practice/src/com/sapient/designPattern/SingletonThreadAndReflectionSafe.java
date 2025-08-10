package com.sapient.designPattern;

public class SingletonThreadAndReflectionSafe {
	
	private static volatile SingletonThreadAndReflectionSafe instance;
	private boolean isInstanceCreated = false;
	
	private SingletonThreadAndReflectionSafe() throws Exception {
		if (isInstanceCreated == true) throw new Exception("Object exists...");
		isInstanceCreated = true;
	}
	
	public static SingletonThreadAndReflectionSafe getInstance() throws Exception {
		
		if (SingletonThreadAndReflectionSafe.instance == null) {
			synchronized(SingletonThreadAndReflectionSafe.class) {
				if (SingletonThreadAndReflectionSafe.instance == null) {
					instance = new SingletonThreadAndReflectionSafe();
				}	
			}
		}
		return instance;
	}

}
