package com.learn.classes.constructor;

public class ObjectReference extends Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating Parent Object and storing in Parent ref");
		Parent p = new Parent();
		p.show();
		
		System.out.println("Creating Child Object and storing in Child ref");
		Child c = new Child();
		c.show();
		
		System.out.println("Creating Child Object and storing in Parent ref");
		Parent p1 = new Child();
		p1.show();
		
	}
	
}
