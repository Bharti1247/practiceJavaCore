package com.learn.multithreading.counter;

public class ThreadSafeCounterSync {
	int count = 0;
	
	synchronized void increment() {
		this.count ++;
	}
	
	synchronized void decrement() {
		this.count --;
	}
	
	synchronized int getValue() {
		return this.count;
	}
	
}
