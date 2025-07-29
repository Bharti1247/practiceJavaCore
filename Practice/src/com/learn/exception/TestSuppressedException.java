package com.learn.exception;

public class TestSuppressedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			getException();
		} catch (Exception e) {
			//System.out.println("Exception :" + e.getMessage());
			System.out.println("Exception :" + e);
			for (Throwable t : e.getSuppressed()) {
				System.out.println("Suppressed error from catch :" + t);
			}
		}

	}
	
	@SuppressWarnings("finally")
	private static void getException() throws Exception {
		try {
			System.out.println("In try block");
			throw new Exception("Exception from try");
//		} catch (Exception e) {
//			System.out.println("Exception in catch :" + e.getMessage());
//			for (Throwable t : e.getSuppressed()) {
//				System.out.println("Suppressed error from catch :" + t.getMessage());
//			}
		} finally {
			System.out.println("In finally block");
			throw new Exception("Exception from finally");
		}
	}

}
