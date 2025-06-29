package com.learn.multithreading.producerConsumer;

public class TestBoundedBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoundedBuffer bb = new BoundedBuffer(10);
		
		// producer thread
		Thread producer = new Thread(() -> {
			for (int i=0; i<20; i++) {
				try {
					bb.put(i);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}					
		});
		
		
		// Consumer thread
		Thread consumer = new Thread(() -> {
			for (int i=0; i<20; i++) {
				try {
					int value = bb.get();
					Thread.sleep(1000); // delay
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
		});
		
		// starting threads
		producer.start();
		consumer.start();
		
		try {
			consumer.join();
			producer.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        System.out.println("All tasks completed.");
	}

}
