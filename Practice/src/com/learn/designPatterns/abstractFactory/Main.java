package com.learn.designPatterns.abstractFactory;

import java.util.Scanner;
import com.learn.designPatterns.factory.Profession;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you want to call a Senior?");
		String choice = sc.nextLine();
		
		System.out.println("Who do you want to call?\\n Press '1' for a Doctor\\n '2' for an Engineer");
		int input = sc.nextInt();
		
		AbstractFactory afact = new AbstractFactory();
		
		Profession p = (Profession)afact.getService(choice, input); 
		p.print();
		
		sc.close();

	}

}
