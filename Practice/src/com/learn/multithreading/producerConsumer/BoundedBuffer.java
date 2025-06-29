package com.learn.multithreading.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
	private Queue<Integer> queue = new LinkedList<>();
	private final int capacity;
	
	// constructor to initialize capacity
	public BoundedBuffer (int capacity) {
		this.capacity = capacity;
	}
	
	// producer
	public synchronized void put (int value) throws InterruptedException {
		while (queue.size() == capacity) {
			System.out.println("Buffer full, Producer is waiting...");
			wait();
		}

        queue.offer(value);
        System.out.println("Produced: " + value);
        notifyAll();  // notify waiting consumers
		
	}
	
	// consumer
	public synchronized int get () throws InterruptedException {
		while (queue.isEmpty()) {
			System.out.println("Buffer empty, Consumer is waiting...");
			wait();
		}
		
		int value = queue.poll();
        System.out.println("Consumed: " + value);
        notifyAll();  // notify waiting producers
		return value;
	}
}
