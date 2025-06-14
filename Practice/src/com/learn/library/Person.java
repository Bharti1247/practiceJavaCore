package com.learn.library;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		Magazine m = new Magazine();
		DVD d = new DVD();
		
		b.setAuthor("Ashley");
		b.setIsbn("B12345");
		b.setItemID("1");
		b.setTitle("The Suite Life");
		
		System.out.println(b);
		
		m.setItemID("2");
		m.checkout("2");
		
		d.setItemID("3");
		d.returnItem("3");

	}

}
