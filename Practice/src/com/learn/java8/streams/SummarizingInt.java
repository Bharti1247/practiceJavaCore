package com.learn.java8.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}

public class SummarizingInt {

	public static void main(String[] args) {
		
		List<Product> p = Arrays.asList(
					new Product ("Apple", 45),
					new Product ("Grapes", 59),
					new Product ("Banana", 65),
					new Product ("Mango", 50)
				);
		
		IntSummaryStatistics stats = p.stream().collect(Collectors.summarizingInt(x -> x.getPrice()));
		
		System.out.println("Sum : " + stats.getSum());
		System.out.println("Average : " + stats.getAverage());
		System.out.println("Count : " + stats.getCount());
		System.out.println("Max : " + stats.getMax());
		System.out.println("Min : " + stats.getMin());

	}

}
