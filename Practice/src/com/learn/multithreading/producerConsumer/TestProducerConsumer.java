package com.learn.multithreading.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class TestProducerConsumer {
	
	private Queue<Integer> queue = new LinkedList<>();
	private final int capacity;
	
	public TestProducerConsumer(int capacity) {
		this.capacity = capacity;
	}
	
	public synchronized void put(int value) throws InterruptedException {
		while (queue.size() == capacity) {
			System.out.println("Queue is full. Producer is waiting...");
			wait();
		}
		
		queue.offer(value);
		System.out.println("Produced: " + value);
		notifyAll();		
	}
	
	public synchronized int get() throws InterruptedException {
		while (queue.isEmpty()) {
			System.out.println("Queue is empty. Consumer is waiting...");
			wait();
		}
		
		int value = queue.poll();
		System.out.println("Consumed: " + value);
		notifyAll();
		
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestProducerConsumer test = new TestProducerConsumer(15);
		
		// producer thread
		Thread producer = new Thread(() -> {
			for (int i=0; i<20; i++) {
				try {
					test.put(i);
					//Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		// consumer thread
		Thread consumer = new Thread(() -> {
			for (int i=0; i<20; i++) {
				try {
					test.get();
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Task completed.");
	}

}
