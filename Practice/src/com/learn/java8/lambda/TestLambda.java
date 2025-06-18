package com.learn.java8.lambda;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractInterface ai = () -> System.out.print("This is from abstract method from Abstract Interface\n");
		ai.print();
		AbstractInterface.log();
		
		AbstractInterface2 adder = (n1, n2, others) -> {
			int result = n1 + n2;
			for (int num : others) result += num;
			return result;
		};
		
		System.out.printf("\nFrom Abstract Interface 2: %d\n", adder.sum(1, 34, 6, 9));
		System.out.println(adder.sum(1, 2));   
	}

}
