package com.learn.basic;

public class StaticVarAndBlock {

	static int x =10;

	static{
		x = x-- - --x;  // 10 - 8
	}
	
	public static void main(String[] args) {
		System.out.println(x);
	}

}
