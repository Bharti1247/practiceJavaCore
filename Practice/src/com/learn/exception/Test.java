package com.learn.exception;

public class Test {
	public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println("Caught: " + e);
            for (Throwable t : e.getSuppressed()) {
                System.out.println("Suppressed: " + t);
            }
        }
    }

    @SuppressWarnings("finally")
	static void test() throws Exception {
        try {
            throw new Exception("Exception from try");
        } finally {
            throw new Exception("Exception from finally");
        }
    }
}
