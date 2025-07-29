package com.learn.exception;

public class TestExceptionReturnStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(getException());

	}
	
	@SuppressWarnings("finally")
	private static int getException() {
		try {
			System.out.println("In try block");
			//System.exit(0); // We won't get the output after this line in terminal
			//int x= 10/0;
			return 5;
		} catch (Exception e) {
			System.out.println("Exception in catch :" + e.getMessage());
			return 10;
		} finally {
			System.out.println("In finally block");
			return 15; // If return statement is available in finally block, it will be returned every time.
		}
		
		//return 20;  // If there's a return statement either in catch or finally block, it will throw error "Unreachable Code"
	}

}
