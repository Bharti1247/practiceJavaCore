package com.learn.person;

public class TestEqualsAndHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Sam", 23);
		Person p2 = new Person("Ram", 23);
		Person p3 = new Person("Sam", 23);
		
		if(p1.equals(p3)) System.out.println("P1 and P3 are Same person");
		else System.out.println("Different person");
		
		if(p1.equals(p2)) System.out.println("P1 and P3 are Same person");
		else System.out.println("Different person");
		
		System.out.println("P1 : " + p1.hashCode());
		System.out.println("P2 : " + p2.hashCode());
		System.out.println("P3 : " + p3.hashCode());

	}

}
