package com.learn.multithreading.counter;

public class Counter extends Thread{
	
	private final ThreadSafeCounterSync counter;
	
	Counter (ThreadSafeCounterSync counter){
		this.counter = counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSafeCounterSync count = new ThreadSafeCounterSync();
		
		Thread t1 = new Counter(count);
		Thread t2 = new Counter(count);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		

	}
	
	@Override
	public void run(){
		for (int i=0; i<10; i++) {
			System.out.println("Incrementing...");
			counter.increment();
			System.out.println("Incremented value..." + counter.getValue());
		}
		
		for (int i=0; i<5; i++) {
			System.out.println("Decrementing...");
			counter.decrement();
			System.out.println("Decremented value..." + counter.getValue());
		}
	
	}

}
