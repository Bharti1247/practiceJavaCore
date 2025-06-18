package com.learn.java8.lambda;

public class ImplementationClass implements AbstractInterface, AbstractInterface2 {
	
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
		System.out.println(adder.sum(1, 2, 5));   
	}

	/** 
	 As this class is implementing interfaces, we should define the methods of interfaces
	 Without overriding below 2 methods also, it is working fine, but shows error in 'ImplementationClass'
	 */
	@Override
	public int sum(int num1, int num2, int... others) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
 /*
  * Overriding this is not necessary, as it is a default method
  * Also, no need to use default while overriding this method, 
  * if we'll use default then it will act as a access modifier and will throw Compile-time error 
  * as by default all the interface methods are public
	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}
	*/
}
