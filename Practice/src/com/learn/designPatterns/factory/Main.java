package com.learn.designPatterns.factory;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Who do you want to call?\n Press '1' for a Doctor\n '2' for an Engineer?");
		int choice = sc.nextInt();
		
		Factory fact = new Factory();
		
		Profession p = (Profession)fact.getService(choice); 
		p.print();
		
		sc.close();
	}
}
