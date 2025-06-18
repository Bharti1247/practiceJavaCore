package com.learn.java8.diamondproblem;

public class DiamondProblem implements Interface1, Interface2 {
	/** 
	 * As we have default void show() available in both the interfaces being implemented
	 * here, class is confused which one to use -> **Diamond Problem**
	 * 
	 * Solution is to use the function with Interface name and super keyword
	 */
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Interface1.super.show();
		Interface2.super.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DiamondProblem dp = new DiamondProblem();
		dp.show();
		
	}

}
