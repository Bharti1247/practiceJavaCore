package com.learn.multithreading.evenOdd;

public class PrintEvenOdd extends Thread{

	static int num = 1;

	public static void main(String[] args) {
		int limit = 20;
		final Object lock = new Object();
		
		// thread to print even nos
		Thread evenThread = new Thread(() -> { 
			while(num <= limit) {
				synchronized(lock) {
					if (num % 2 == 0) {
						System.out.println("Even Thread: " + num);
						num++;
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						lock.notify();
					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});

		// thread to print odd nos
		Thread oddThread = new Thread(() -> {
			while(num <= limit) {
				synchronized(lock) {
					if (num % 2 != 0) {
						System.out.println("Odd Thread: " + num);
						num++;
						lock.notify();
					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		
		// starting threads
		evenThread.start();
		oddThread.start();

	}

}
