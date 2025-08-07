package main.java;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		
		int num = 8;
		int result = c.numSquare(num); 
		System.out.println("Square of " + num + " is " + result);

	}
	
	public int numSquare(int num) {
		if (num < 0) throw new IllegalArgumentException("Number can't be negative");
		return num*num;
	}

}
